package de.thm.mni.mhpp11;

import de.thm.mni.mhpp11.parser.ModelicaIconLexer;
import de.thm.mni.mhpp11.parser.ModelicaIconParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

/**
 * Created by hobbypunk on 29.09.16.
 */
public class GeneratorTest {
  @Test
  public void testLexer() throws Exception {
    ANTLRInputStream is = new ANTLRInputStream(getClass().getResourceAsStream("/Rectangle.txt"));
    ModelicaIconLexer mi = new ModelicaIconLexer(is);
    Token t = null;
    while (!mi._hitEOF) {
      t = mi.nextToken();
      System.out.println(t.getText());
    }
  }
  
  @Test
  public void testParser() throws Exception {
    String s = "hallo";
    
    ANTLRInputStream is = new ANTLRInputStream(getClass().getResourceAsStream("/Rectangle.txt"));
    ModelicaIconParser p = new ModelicaIconParser(new CommonTokenStream(new ModelicaIconLexer(is)));
    ModelicaIconParser.IconContext ic = p.icon();
  }
}
