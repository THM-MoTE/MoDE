package de.thm.mni.mote.mode.modelica;


import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcel Hoppe on 07.09.16.
 */
@Getter
public class MoFunction extends MoClass {
  
  private final List<Object> params = new ArrayList<>();
  
  @Builder
  public MoFunction(ClassInformation classInformation, MoLater that) {
    super(classInformation, that);
  }
  
  @Override
  public String toString() {
    return "f > " + this.getName();
  }

//  public static MoFunction parse(FunctionCall fc) {
//    MoFunctionBuilder mb = builder();
//    mb.name(fc.getText().asID());
//    mb.parent(null);
//
//    MoFunction mf = mb.build();
//    mf.getParams().addAllAnnotations(MoExp.parseFunctionArguments(fc.getFunctionArguments()));
//    return mf;
//
//  }
}
