package de.thm.mni.mhpp11.util.parser;

import de.thm.mni.mhpp11.util.parser.models.MoProgramm;
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
  
  private Logger logger;
  
  private PackageParser() {
    Settings settings = Settings.load();
    logger = settings.getLogger();
  }
  
  public File findBasePackage(File f) {
    try {
      MoProgramm mp = ASTParser.parse(f);
      if(mp.getMoPackage() != null || mp.getMoWithin().getPackages().size() > 0) {
        f = f.getParentFile();
        if(mp.getMoPackage() != null && mp.getMoWithin().getPackages().size() > 0) {
          f = f.getParentFile();
        }
        for(Integer i = 1; i < mp.getMoWithin().getPackages().size(); i++) {
          f = f.getParentFile();
        }
        return new File(f.getAbsolutePath() + "/package.mo");
      }
    } catch(ParserException e) {
      logger.error(e);
    }
    return f;
  }
  
  public void collectPackage(File f) {
    try {
      MoProgramm mp = ASTParser.parse(f);
      mp = mp;
    } catch (ParserException e) {
      logger.error(e);
    }
  }
}
