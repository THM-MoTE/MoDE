package de.thm.mni.mhpp11.parser.model;


import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by hobbypunk on 07.09.16.
 */
public class MoFunction extends MoElement {
  
  public static Pattern START = Pattern.compile("(\\s*([^\\s]*)\\s+)?function\\s+([^\\s]*)(\\s\"([^\"]*)\")?");
  
  public static Boolean is(String line) {
    return START.matcher(line).matches();
  }
  
  public static MoFunction parse(String l, BufferedReader br) throws IOException {
    Matcher m = START.matcher(l);
    System.out.println(m.groupCount());
    String name = m.group(3);
    String description = m.group(5);
    Pattern END = Pattern.compile("\\s*end " + name + ";");
    String line;
    while((line = br.readLine()) != null && !END.matcher(line).matches()) {
      ;
    }
    return new MoFunction(name, description);
  }
  
  
  public MoFunction(String name, String description) {
    super(name, description);
  }
  
  @Override
  public String toString() {
    return "f > " + this.name;
  }
}
