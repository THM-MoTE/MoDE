package de.thm.mni.mhpp11.util.parser;

import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.config.model.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by hobbypunk on 14.09.16.
 */
public class PackageParser extends Observable {
  private static PackageParser ourInstance = new PackageParser();
  
  public static PackageParser getInstance() {
    return ourInstance;
  }
  
  private Logger logger;
  
  private PackageParser() {
    Settings settings = Settings.load();
    logger = settings.getLogger();
  }
  
  public File findBasePackage(File f) {
    return f;
  }
  
  public void collectLibs(File base, Integer packageOrder) {
    if (base == null) return;
    
    File[] libs = base.listFiles(File::isDirectory);
    if (libs == null) return;
    for (File lib : libs) {
      collectDir(lib, packageOrder);
    }
  }
  
  public void collectDir(File file, Integer packageOrder) {
    File[] content = file.listFiles(pathname -> pathname.isDirectory() || pathname.getName().endsWith(".mo"));
    File[] orders = file.listFiles(pathname -> pathname.getName().endsWith(".order"));
    if(content == null) return;
    List<String> s = new ArrayList<>();
    if (orders.length > 0) {
      File o = orders[0];
      try {
        s = Files.readAllLines(o.toPath());
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    for (File f: content) {
      Integer order = (f.getName().toLowerCase().equals("package.mo")) ? packageOrder : s.indexOf(f.getName().replaceAll("\\.mo$", ""));
  
      if (f.isDirectory()) collectDir(f, order);
      else collectFile(f, order);
    }
  }
  
  public void collectFile(File file, Integer order) {
      logger.debug("Parse File", file.getName());

//      MoFile mf = ASTParser.parse(file);
//      mf.setType(type);
//      mf.setOrder(order);
//      sendFile(mf);

//    } catch (ParserException e) {
//      Settings.load().getLogger().error(e);
//    }
  }
}
