package de.thm.mni.mote.mode.modelica;

import de.thm.mni.mote.mode.parser.ParserException;
import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import static de.thm.mni.mote.mode.modelica.interfaces.Changeable.Change;

/**
 * Created by hobbypunk on 02.12.16.
 */

@UtilityClass
public class Saver {
  public void save(MoContainer container) throws ParserException {
    if (container.getElement().getUnsavedChanges().getValue().equals(Change.NONE)) return;
    
    ClassInformation ci = container.getElement().getClassInformation();
    List<String> fileContent = new ArrayList<>();
    try {
      Files.lines(ci.getFileName()).forEachOrdered(fileContent::add);
      Integer end = saveVariables(fileContent, container.getElement());
      saveConnections(fileContent, container.getElement(), end);
  
      //fileContent.forEach(System.out::println);
      //Files.write(Files.createTempFile("MoDE_", ".mo"), fileContent);
      
      Files.write(ci.getFileName(), fileContent);
      container.getElement().getUnsavedChanges().setValue(Change.NONE);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  private Integer saveVariables(List<String> fileContent, MoClass moClass) {
    ClassInformation ci = moClass.getClassInformation();
    Integer start = ci.getLineNumberStart();
    Integer end = ci.getLineNumberEnd();
  
    String leading = fileContent.get(start).replaceAll("^(\\s*).+", "$1") + "  ";
    
    for (int i = start; i < end; i++) {
      for (MoVariable mv : moClass.getDeletedVariables()) {
        if (fileContent.get(i).contains(mv.getIndicator())) {
          String line;
          do {
            line = fileContent.get(i);
            fileContent.remove(i);
            end--;
          } while (!line.endsWith(";"));
          i--;
          moClass.getDeletedVariables().remove(mv);
          break;
        }
      }
      
      for (MoVariable mv : moClass.getVariables().filtered(moVariable -> moVariable.getUnsavedChanges().get().equals(Change.EDIT))) {
        if (fileContent.get(i).contains(mv.getIndicator())) {
          String line;
          do {
            line = fileContent.get(i);
            fileContent.remove(i);
            end--;
          } while (!line.endsWith(";"));
          fileContent.add(i, leading + generateSaveString(mv));
          mv.getUnsavedChanges().set(Change.NONE);
          break;
        }
      }
    }
  
    for (MoVariable moVariable : moClass.getVariables().filtered(moVariable -> moVariable.getUnsavedChanges().get().equals(Change.NEW))) {
      String str = moVariable.toString();
      if (!str.isEmpty()) {
        fileContent.add(start, leading + str);
        end++;
      }
    }
  
    return end;
  }
  
  private static String generateSaveString(MoVariable mv) {
    String str = mv.getLine();
    str = str.substring(0, str.indexOf("annotation"));
    String tmp = mv.toString();
    str += tmp.substring(tmp.indexOf("annotation"));
    return str;
  }
  
  private void saveConnections(List<String> fileContent, MoClass moClass, Integer end) {
    ClassInformation ci = moClass.getClassInformation();
    
    Integer pos = -1;
    for (Integer i = ci.getLineNumberStart(); i < end; i++) {
      if (fileContent.get(i).startsWith("equation")) {
        pos = i + 1;
        break;
      }
    }
    String leading = "";
    if (pos == -1) {
      pos = end - 1;
      leading = fileContent.get(ci.getColumnNumberStart() - 1).replaceAll("^(\\s*).+", "$1") + "  ";
      fileContent.add(pos++, leading + "equation");
    }
    leading = fileContent.get(pos - 1).replaceAll("^(\\s*).+", "$1") + "  ";
    
    for (int i = pos; i < end; i++) {
      for (MoConnection mc : moClass.getDeletedConnections()) {
        if (fileContent.get(i).contains(mc.getIndicator())) {
          String line;
          do {
            line = fileContent.get(i);
            fileContent.remove(i);
            end--;
          } while (!line.endsWith(";"));
          i--;
          moClass.getDeletedConnections().remove(mc);
          break;
        }
      }
      
      for (MoConnection mc : moClass.getConnections().filtered(moConnection -> moConnection.getUnsavedChanges().get().equals(Change.EDIT))) {
        if (fileContent.get(i).contains(mc.getIndicator())) {
          String line;
          do {
            line = fileContent.get(i);
            fileContent.remove(i);
            end--;
          } while (!line.endsWith(";"));
          fileContent.add(i, leading + "  " + mc.toString());
          mc.getUnsavedChanges().set(Change.NONE);
          break;
        }
      }
    }
    
    //new connect equations
    for (MoConnection mc : moClass.getConnections().filtered(moConnection -> moConnection.getUnsavedChanges().get().equals(Change.NEW))) {
      String str = mc.toString();
      if (!str.isEmpty()) {
        fileContent.add(pos, leading + "  " + mc.toString());
        mc.getUnsavedChanges().set(Change.NONE);
      }
    }
  }
}
