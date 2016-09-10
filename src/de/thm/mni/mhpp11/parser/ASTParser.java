package de.thm.mni.mhpp11.parser;

/**
 * Created by hobbypunk on 08.09.16.
 */
public class ASTParser {
  
  private static ASTParser ourInstance = new ASTParser();
  
  public static ASTParser getInstance() {
    return ourInstance;
  }
  
  private ASTParser() {
  }
}
