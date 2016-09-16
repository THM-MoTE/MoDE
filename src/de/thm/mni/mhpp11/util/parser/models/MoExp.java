package de.thm.mni.mhpp11.util.parser.models;

import de.thm.mni.mhpp11.util.parser.ASTParser;
import javafx.util.Pair;
import org.jmodelica.modelica.compiler.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 16.09.16.
 */
public class MoExp {
  
  public static Object parse(Exp exp) {
    if(exp instanceof ArrayConstructor) return parseFunctionArguments(((ArrayConstructor) exp).getFunctionArguments());
    if(exp instanceof BooleanLitExp) return parseBoolean(exp);
    if(exp instanceof IntegerLitExp) return Integer.parseInt(((IntegerLitExp) exp).getUNSIGNED_INTEGER());
    if(exp instanceof FunctionCall) return parseFunctionArguments(((FunctionCall) exp).getFunctionArguments());
    if(exp instanceof RealLitExp) return Double.parseDouble(((RealLitExp)exp).getUNSIGNED_NUMBER());
    if(exp instanceof AccessExp) return ASTParser.parse(((AccessExp) exp).getAccess());
    if(exp instanceof NegExp) {
      Number n = (Number)parse(((NegExp) exp).getExp());
      if(n instanceof Integer) return -(Integer)n;
      if(n instanceof Double) return -(Double)n;
    }
    return null;
  }
  
  public static Pair<String, Object> parse(NamedArgument na) {
    return new Pair<>(na.getName().asID(), parse(na.getExp()));
  }
  
  private static Boolean parseBoolean(Exp exp) {
    return exp instanceof BooleanLitExpTrue;
  }
  
  private static List<Object> parseFunctionArguments(FunctionArguments fa) {
    List<Object> l = new ArrayList<>();
    for(Exp e : fa.getExps())
      l.add(parse(e));
    for(NamedArgument na : fa.getNamedArgumentList())
      l.add(parse(na));
    return l;
  }
}
