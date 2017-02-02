package de.thm.mni.mote.mode.omcactor;

import de.thm.mni.mote.mode.parser.modelica.AnnotationLexer;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

import java.io.ByteArrayInputStream;

/**
 * Created by hobbypunk on 29.09.16.
 */
public class GeneratorTest {
  @Test
  public void testLexer() throws Exception {
    ANTLRInputStream is = new ANTLRInputStream(getClass().getResourceAsStream("/Annotation.txt"));
    AnnotationLexer mi = new AnnotationLexer(is);
    Token t;
    while (!mi._hitEOF) {
      t = mi.nextToken();
      System.out.println(mi.getVocabulary().getDisplayName(t.getType()) + ": " + t.getText());
    }
  }
  
  @Test
  public void testLexer2() throws Exception {
    ANTLRInputStream is = new ANTLRInputStream(new ByteArrayInputStream("textString".getBytes()));
    AnnotationLexer iel = new AnnotationLexer(is);
    Token t;
    while (!iel._hitEOF) {
      t = iel.nextToken();
      System.out.println(AnnotationLexer.VOCABULARY.getDisplayName(t.getType()) + ": " + t.getText());
    }
  }
  
  @Test
  public void testParser() throws Exception {
    ANTLRInputStream is = new ANTLRInputStream(getClass().getResourceAsStream("/Annotation.txt"));
    AnnotationParser p = new AnnotationParser(new CommonTokenStream(new AnnotationLexer(is)));
    AnnotationParser.AnnotationContext ac = p.annotation();
    System.out.println(ac);
  }
  
  @Test
  public void testGenerator() throws Exception {
    
  }
  
}
