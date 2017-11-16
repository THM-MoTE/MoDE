package de.thm.mni.mote.mode.frontend.controllers;

import de.thm.mni.mote.mode.config.Settings;
import javafx.fxml.Initializable;

import java.util.Locale;

public interface IController extends Initializable {
  
  default String getViewPath() {
    return "/" + getClass().getPackage().getName().replaceAll("\\.", "/").replaceAll("controllers$", "views") +
               "/" + getClass().getSimpleName().replaceAll("Controller$", "View") + ".fxml";
  }
  
  default String getBundlePath() {
    return getClass().getPackage().getName().replaceAll("\\.", "/").replaceAll("controllers$", "bundles") +
               "/" + getClass().getSimpleName().replaceAll("Controller$", "Bundle");
  }
  
  default Locale getLocale() {
    return Settings.load().getLang();
  }
}
