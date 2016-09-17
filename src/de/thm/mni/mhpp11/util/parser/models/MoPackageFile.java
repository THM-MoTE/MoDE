package de.thm.mni.mhpp11.util.parser.models;

import org.jmodelica.modelica.compiler.Program;

/**
 * Created by hobbypunk on 17.09.16.
 */
public class MoPackageFile extends MoFile {
  public MoPackageFile() {
    super("pacakge.mo");
  }
  
  public static MoPackageFile parse(Program p) {
    return (MoPackageFile) MoFile.parse(p, new MoPackageFile());
  }
}
