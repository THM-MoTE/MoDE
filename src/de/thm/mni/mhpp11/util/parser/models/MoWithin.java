package de.thm.mni.mhpp11.util.parser.models;

import de.thm.mni.mhpp11.util.parser.ASTParser;
import lombok.Getter;
import lombok.Setter;
import org.jmodelica.modelica.compiler.StoredDefinition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 08.09.16.
 */
@Setter @Getter
public class MoWithin extends MoElement {
  
  final List<String> packages;
  
  private MoWithin() {
    this(new ArrayList<>());
  }
  
  private MoWithin(List<String> packages) {
    super("within");
    this.packages = packages;
  }
  
  @Override
  public String toString() {
    return "w > " + String.join(".",this.packages);
  }
  
  
  public static MoWithin parse(StoredDefinition sd) {
    if(sd.getWithin() == null) return new MoWithin();
    return new MoWithin(ASTParser.parse(sd.getWithin().getPackageName()));
  }
}
