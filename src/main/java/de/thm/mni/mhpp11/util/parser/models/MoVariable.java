package de.thm.mni.mhpp11.util.parser.models;

import de.thm.mni.mhpp11.parser.modelica.ComponentsLexer;
import de.thm.mni.mhpp11.parser.modelica.ComponentsParser;
import de.thm.mni.mhpp11.util.parser.ClassInformation;
import de.thm.mni.mhpp11.util.parser.OMCompiler;
import de.thm.mni.mhpp11.util.parser.models.annotations.MoAnnotation;
import de.thm.mni.mhpp11.util.parser.models.interfaces.MoElement;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;
import omc.corba.Result;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;

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
    Result r = omc.sendExpression(String.format("getComponentsTest(%s)", moClass.getName()));
    ANTLRInputStream is;
    ComponentsParser p;
    try {
      MoVariableBuilder mb;
      MoVariable mv;
      is = new ANTLRInputStream(new ByteArrayInputStream(r.result.getBytes()));
      p = new ComponentsParser(new CommonTokenStream(new ComponentsLexer(is)));
      ComponentsParser.ComponentsContext cs = p.components();
      for (ComponentsParser.ComponentContext c : cs.component()) {
        if (Boolean.parseBoolean(c.isProtected().val.getText())) continue;
        mb = builder();
        String name = PATTERN.matcher(c.name().val.getText()).replaceAll("");
        MoClass clazz = MoClass.findClass(omc, PATTERN.matcher(c.className().val.getText()).replaceAll(""));
        mb.name(name);
        mb.comment(PATTERN.matcher(c.comment().val.getText()).replaceAll(""));
        mb.type(clazz);
        if (clazz == null) continue;//THROW EXCEPTION
        Pattern regex = Pattern.compile(String.format("%s(\\[.*?\\])? %s[\\W]", clazz.getName(), name));
        mv = mb.build();
        //TODO get annotation
        ClassInformation ci = moClass.getClassInformation();
        List<String> list = new ArrayList<>();
        try (Stream<String> lines = Files.lines(ci.getFileName())) {
          Optional<String> line = lines.limit(ci.getLineNumberEnd()).skip(ci.getLineNumberStart() - 1).filter(new Predicate<String>() {
            Boolean match = false;
            
            @Override
            public boolean test(String s) {
              Boolean alwaysReturn = false;
              if (regex.matcher(s).find()) alwaysReturn = match = true;
              if (s.endsWith(";")) {
                if (match) alwaysReturn = true;
                match = false;
              }
              return alwaysReturn || match;
            }
          }).reduce((s, s2) -> s + s2.trim()).filter(s -> s.contains("annotation"));
          if (line.isPresent()) {
            MoAnnotation.parse(omc, mv, line.get().substring(line.get().indexOf("annotation(")));
          }
        }
        
        moClass.getVariables().add(mv);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}