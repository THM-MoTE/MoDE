package de.thm.mni.mhpp11.util.parser;

import de.thm.mni.mhpp11.model.MoProgramm;
import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.config.model.Logger;

import java.io.File;

/**
 * Created by hobbypunk on 14.09.16.
 */
public class PackageParser {
  private static PackageParser ourInstance = new PackageParser();
  
  public static PackageParser getInstance() {
    return ourInstance;
  }
  
  private ASTParser parser;
  private Logger logger;
  
  private PackageParser() {
    Settings settings = Settings.load();
    logger = settings.getLogger();
    parser = ASTParser.getInstance();
  }
  
  public File findBasePackage(File f) {
    try {
      MoProgramm mp = parser.parse(f);
      if(mp.getPackage() != null || mp.getWithin().getPackages().size() > 0) {
        f = f.getParentFile();
        if(mp.getPackage() != null && mp.getWithin().getPackages().size() > 0) {
          f = f.getParentFile();
        }
        for(Integer i = 1; i < mp.getWithin().getPackages().size(); i++) {
          f = f.getParentFile();
        }
        return new File(f.getAbsolutePath() + "/package.mo");
      }
    } catch(ParserException e) {
      logger.error(e);
    }
    return f;
  }
}
