package de.thm.mni.mhpp11.util.parser.models;

import de.thm.mni.mhpp11.util.config.Settings;
import lombok.Getter;
import lombok.Setter;
import org.jmodelica.modelica.compiler.*;

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
    try {
      mp.setMoPackage(MoPackage.parse((FullClassDecl) sd.getElements().getChild(0)));
    } catch (ClassCastException e) {
      Settings.load().getLogger().warning("Cast Problem", "Can't cast " + sd.getElements().getChild(0).getClass().getSimpleName(), true);
    }
  
    for(Element fcd: sd.getElements()) {
      try {
        MoClass mc = null;
        if (fcd instanceof FullClassDecl) {
          mc = MoClass.parse((FullClassDecl) fcd);
        } else if (fcd instanceof ShortClassDecl) {
          throw new ClassCastException();
        }
        if (mc != null) mp.getMoClass().add(mc);
      } catch (ClassCastException e) {
        Settings.load().getLogger().warning("Cast Problem", "Can't cast " + fcd.getClass().getSimpleName(), true);
      }
    }
    
    return mp;
  }
}
