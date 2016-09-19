package de.thm.mni.mhpp11.util.parser.models;


import lombok.Getter;
import org.jmodelica.modelica.compiler.FunctionCall;

import java.util.List;

/**
 * Created by hobbypunk on 07.09.16.
 */
@Getter
public class MoFunction extends MoElement {
  
  List<Object> params;
  
  public MoFunction(String name, List<Object> params) {
    super(name, "");
    this.params = params;
  }
  
  @Override
  public String toString() {
    return "f > " + this.getName();
  }
  
  public static MoFunction parse(FunctionCall fc) {
    List<Object> l = MoExp.parseFunctionArguments(fc.getFunctionArguments());
    return new MoFunction(fc.getName().asID(), l);
    
  }
}
