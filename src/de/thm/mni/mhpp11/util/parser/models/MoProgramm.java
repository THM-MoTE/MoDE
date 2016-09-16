package de.thm.mni.mhpp11.util.parser.models;

import lombok.Getter;
import lombok.Setter;
import org.jmodelica.modelica.compiler.FullClassDecl;
import org.jmodelica.modelica.compiler.Program;
import org.jmodelica.modelica.compiler.StoredDefinition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 08.09.16.
 */

@Getter
public class MoProgramm extends MoElement {
  
  @Setter private MoWithin moWithin;
  @Setter private MoPackage moPackage;
  private List<MoClass> moClass = new ArrayList<>();
  
  public MoProgramm(String name) {
    super(name);
  }
  
  @Override
  public String toString() {
    return name + "\n\t" + this.moWithin + "\n\t" + this.moClass;
  }
  
  public static MoProgramm parse(Program p) {
    MoProgramm mp = new MoProgramm("");
    StoredDefinition sd = (StoredDefinition)p.getChild(0).getChild(0);
    mp.setMoWithin(MoWithin.parse(sd));
    mp.setMoPackage(MoPackage.parse((FullClassDecl)sd.getChild(1).getChild(0)));
    mp.getMoClass().add(MoClass.parse((FullClassDecl)sd.getChild(1).getChild(0)));
    return mp;
  }
}
