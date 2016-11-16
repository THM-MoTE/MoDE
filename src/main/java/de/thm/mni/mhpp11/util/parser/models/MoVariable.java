package de.thm.mni.mhpp11.util.parser.models;

import de.thm.mni.mhpp11.util.ImmutableListCollector;
import de.thm.mni.mhpp11.util.parser.OMCompiler;
import de.thm.mni.mhpp11.util.parser.models.annotations.MoAnnotation;
import de.thm.mni.mhpp11.util.parser.models.annotations.MoPlacement;
import de.thm.mni.mhpp11.util.parser.models.interfaces.MoElement;
import lombok.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Created by hobbypunk on 20.10.16.
 */
@Getter
public class MoVariable extends MoElement {
  private static final Pattern PATTERN = Pattern.compile("(^\"|\"$)");
  private final MoClass parent;
  private Specification kind;
  @Setter private MoClass type = null;
  @Setter private String comment = "";
  
  public enum Specification {
    NONE,
    INPUT,
    OUTPUT,
    FLOW
  }
  
  public MoVariable(@NonNull MoClass parent, MoClass type, String name) {
    super("v", name, "");
    this.parent = parent;
    this.kind = Specification.NONE;
    this.type = type;
  }
  
  @Builder
  private MoVariable(@NonNull MoClass parent, Specification kind, MoClass type, String name, String comment, @Singular List<MoAnnotation> annotations) {
    super("v", name, comment);
    this.parent = parent;
    this.kind = kind;
    if (type != null) this.type = type;
    if (annotations != null) this.addAllAnnotations(annotations);
  }
  
  public List<MoVariable> getVariables() {
    return getType().getVariables();
  }
  
  public List<MoConnection> getConnections() {
    return this.parent.getConnections().stream().filter(moConnection -> moConnection.contains(this)).collect(ImmutableListCollector.toImmutableList());
  }
  
  public MoPlacement getPlacement() {
    for (MoAnnotation ma : getAnnotations())
      if (ma instanceof MoPlacement) return (MoPlacement) ma;
    return null;
  }
  
  public static List<MoVariable> parse(OMCompiler omc, MoClass parent) {
    List<MoVariable> list = new ArrayList<>();
    try {
      for (Map<String, String> m : omc.getVariables(parent.getName(), parent.getClassInformation())) {
        list.add(parse(omc, parent, m));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    return list.stream().filter(moVariable -> moVariable != null).collect(ImmutableListCollector.toImmutableList());
  }
  
  private static MoVariable parse(OMCompiler omc, MoClass parent, Map<String, String> m) {
    if (Boolean.parseBoolean(m.get("isProtected"))) return null;
    
    MoVariableBuilder mb = builder();
    if (Boolean.parseBoolean(m.get("isFlow"))) {
      mb.kind(Specification.FLOW);
    } else if (!m.get("inputOutput").isEmpty()) {
      if (m.get("inputOutput").contains("input")) mb.kind(Specification.INPUT);
      else mb.kind(Specification.OUTPUT);
    } else mb.kind(Specification.NONE);
    mb.parent(parent);
    mb.type(MoClass.findClass(omc, m.get("type")));
    mb.name(m.get("name"));
    mb.comment(m.get("comment"));
    if (m.containsKey("annotation"))
      MoAnnotation.parse(omc, m.get("annotation")).forEach(mb::annotation);
    return mb.build();
  }
}