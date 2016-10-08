package de.thm.mni.mhpp11.util.parser.models;


import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 07.09.16.
 */
@Getter
public class MoFunction extends MoClass {
  
  private final List<Object> params = new ArrayList<>();
  
  @Builder
  public MoFunction(String name, MoClass parent) {
    super(name, parent);
  }
  
  @Override
  public String toString() {
    return "f > " + this.getName();
  }

//  public static MoFunction parse(FunctionCall fc) {
//    MoFunctionBuilder mb = builder();
//    mb.name(fc.getName().asID());
//    mb.parent(null);
//
//    MoFunction mf = mb.build();
//    mf.getParams().addAll(MoExp.parseFunctionArguments(fc.getFunctionArguments()));
//    return mf;
//
//  }
}
