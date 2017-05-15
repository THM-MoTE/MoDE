package de.thm.mni.mote.mode.util;

import lombok.experimental.UtilityClass;

/**
 * Created by hobbypunk on 23.01.17.
 */
@UtilityClass
public class Constants extends de.thm.mni.mhpp11.smbj.utilities.ui.Constants {
  
  static {
    Constants.setConstants(Constants.class);
  }
  
  public Integer OMC = 1 << 20;
  
  public Integer ALL = de.thm.mni.mhpp11.smbj.utilities.ui.Constants.ALL | OMC;
  
}
