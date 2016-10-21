package de.thm.mni.mhpp11.util.parser.models;

import de.thm.mni.mhpp11.util.parser.OMCompiler;
import de.thm.mni.mhpp11.util.parser.models.annotations.MoAnnotation;
import de.thm.mni.mhpp11.util.parser.models.interfaces.MoElement;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Created by hobbypunk on 20.10.16.
 */
@Getter
public class MoVariable extends MoElement {
  private static final Pattern PATTERN = Pattern.compile("(^\"|\"$)");
  @Setter private MoClass type = null;
  @Setter private String comment = "";
  
  @Builder
  private MoVariable(MoClass type, String name, String comment, @Singular List<MoAnnotation> annotations) {
    super("v", name, comment);
    if (type != null) this.type = type;
    if (annotations != null) this.getAnnotations().addAll(annotations);
  }
  
  public static void parse(OMCompiler omc, MoClass moClass) {
    MoVariableBuilder mb;
    try {
      for (Map<String, String> m : omc.getVariables(moClass.getName(), moClass.getClassInformation())) {
        mb = builder();
        mb.type(MoClass.findClass(omc, m.get("type")));
        mb.name(m.get("name"));
        mb.comment(m.get("comment"));
        String line = m.get("line");
        if (line.contains("annotation("))
          for (MoAnnotation ma : MoAnnotation.parse(omc, line.substring(line.indexOf("annotation("))))
            mb.annotation(ma);
    
        moClass.getVariables().add(mb.build());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}