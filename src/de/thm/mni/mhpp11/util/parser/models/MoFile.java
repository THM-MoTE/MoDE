package de.thm.mni.mhpp11.util.parser.models;

import lombok.Getter;
import lombok.Setter;
import org.jmodelica.modelica.compiler.Element;
import org.jmodelica.modelica.compiler.FullClassDecl;
import org.jmodelica.modelica.compiler.Program;
import org.jmodelica.modelica.compiler.StoredDefinition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 08.09.16.
 */

@Getter
public class MoFile extends MoElement {
  
  public static enum TYPE {
    PROJECT,
    PROJECTLIB,
    LIB,
    BUILTIN
  }
  
  @Setter private TYPE type;
  @Setter private Integer order;
  @Setter private MoWithin moWithin;
  @Setter private MoPackage moPackage;
  private List<MoClass> moClass = new ArrayList<>();
  
  public MoFile(String name) {
    super(name);
  }
  
  @Override
  public String toString() {
    return this.getName() + "\n\t" + this.moWithin + "\n\t" + this.moPackage;
  }
  
  public static MoFile parse(Program p, String name) {
    if(name.equals("package.mo")) return MoPackageFile.parse(p);
    return parse(p, new MoFile(name));
  }
  
  public static MoFile parse(Program p, MoFile mp) {
    StoredDefinition sd = p.getUnstructuredEntitys().getChild(0);
    mp.setMoWithin(MoWithin.parse(sd));
    mp.setMoPackage(MoPackage.parse((FullClassDecl)sd.getElements().getChild(0)));
    for(Element fcd: sd.getElements()) {
      MoClass mc = MoClass.parse((FullClassDecl)fcd);
      if(mc != null) mp.getMoClass().add(mc);
    }
    
    return mp;
  }
}
