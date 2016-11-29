package de.thm.mni.mhpp11.ui.controller;

import de.thm.mni.mhpp11.config.model.Logger.LEVEL;
import de.thm.mni.mhpp11.ui.utilities.UTF8ResourceBundleControl;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.util.Pair;
import javafx.util.StringConverter;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by hobbypunk on 14.09.16.
 */
public class SettingsController extends Controller {
  
  @FXML private ChoiceBox<Pair<String, String>> cbLanguage;
  
  @FXML private TextField tfRecentCount;
  @FXML private Slider sRecentCount;
  
  @FXML private TextField tfNotifySeconds;
  @FXML private Slider sNotifySeconds;
  
  @FXML private ChoiceBox<LEVEL> cbLoggerLevel;
  @FXML private ChoiceBox<LEVEL> cbLoggerNotifyLevel;
  
  @FXML private TextField tfModelicaCompiler;
  @FXML private TextField tfModelicaLibrary;
  @FXML private TextField tfModelicaDepth;
  @FXML private Slider sModelicaDepth;
  
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
  
    ResourceBundle languages = ResourceBundle.getBundle("de/thm/mni/mhpp11/i18n/Languages", settings.getLang(), new UTF8ResourceBundleControl());
    Pair<String, String> lang = new Pair<>(settings.getLang().toString(), languages.getString(settings.getLang().toString()));
    
    List<Pair<String, String>> langs = new ArrayList<>();
    for(String l: languages.keySet())
      langs.add(new Pair<>(l, languages.getString(l)));
  
    cbLanguage.setItems(FXCollections.observableArrayList(langs));
    cbLanguage.setValue(lang);
    cbLanguage.setConverter(new StringConverter<Pair<String, String>>() {
      @Override
      public String toString(Pair<String, String> object) {
        return object.getValue();
      }
  
      @Override
      public Pair<String, String> fromString(String string) {
        for(Pair<String, String> p: langs) {
          if(p.getValue().equals(string))
            return p;
        }
        return null;
      }
    });
    cbLanguage.valueProperty().addListener((observable, oldValue, newValue) -> settings.setLang(new Locale(newValue.getKey())));
  
    cbLoggerLevel.setItems(FXCollections.observableArrayList(LEVEL.values()));
    cbLoggerLevel.setValue(settings.getLogger().getLevel());
    cbLoggerLevel.valueProperty().addListener((observable, oldValue, newValue) -> settings.getLogger().setLevel(newValue));
    
    cbLoggerNotifyLevel.setItems(FXCollections.observableArrayList(LEVEL.values()));
    cbLoggerNotifyLevel.setValue(settings.getLogger().getNotifyLevel());
    cbLoggerNotifyLevel.valueProperty().addListener((observable, oldValue, newValue) -> settings.getLogger().setNotifyLevel(newValue));
  
    if (settings.getModelica().getCompiler() != null) {
      Path f = settings.getModelica().getCompiler();
      tfModelicaCompiler.setText(f.toString());
      tfModelicaCompiler.positionCaret(f.toString().length() + 1);
    }
    tfModelicaCompiler.textProperty().addListener((observable, oldValue, newValue) -> settings.getModelica().setCompiler(Paths.get(newValue)));
  
    if (settings.getModelica().getLibrary() != null) {
      Path f = settings.getModelica().getLibrary();
      tfModelicaLibrary.setText(f.toString());
      tfModelicaLibrary.positionCaret(f.toString().length() + 1);
    }
    tfModelicaLibrary.textProperty().addListener((observable, oldValue, newValue) -> settings.getModelica().setLibrary(Paths.get(newValue)));

    initSlider(sRecentCount, tfRecentCount, settings.getRecent().getCount(), (observable, oldValue, newValue) -> {
      if(oldValue.intValue() != newValue.intValue()) settings.getRecent().setCount(newValue.intValue());
    });
  
    initSlider(sNotifySeconds, tfNotifySeconds, settings.getNotification().getSeconds(), (observable, oldValue, newValue) -> {
      if(oldValue.intValue() != newValue.intValue()) settings.getNotification().setSeconds(newValue.intValue());
    });
  
    initSlider(sModelicaDepth, tfModelicaDepth, settings.getModelica().getDepth(), (observable, oldValue, newValue) -> {
      if (oldValue.intValue() != newValue.intValue()) settings.getModelica().setDepth(newValue.intValue());
    });
  
  }
  
  private void initSlider(Slider s, TextField tf, Integer i, ChangeListener<Number> cl) {
    s.setValue(i);
    tf.setText("" + i);
    s.valueProperty().addListener(cl);
    s.valueProperty().addListener((observable, oldValue, newValue) -> tf.setText("" + newValue.intValue()));
  }
  
  @FXML
  private void onModelicaCompilerClick() {
    Path f = fileDialog(
        settings.getModelica().getCompiler(),
        i18n.getString("settings.select.modelica.compiler"),
        true);
    
    if (f == null) return;
    tfModelicaCompiler.setText(f.toString());
    tfModelicaCompiler.positionCaret(f.toString().length() + 1);
  }
  
  @FXML
  private void onModelicaLibraryClick() {
    Path f = (settings.getModelica().getLibrary() != null) ? settings.getModelica().getLibrary() : settings.getModelica().getCompiler();
    f = fileDialog(f, i18n.getString("settings.select.modelica.library"), false);
    
    if (f == null) return;
    tfModelicaLibrary.setText(f.toString());
    tfModelicaLibrary.positionCaret(f.toString().length() + 1);
  }
  
  private Path fileDialog(Path init, String title, Boolean file) {
    title = title.replaceAll(":$", "");
    File f;
    if (file) {
      FileChooser fc = new FileChooser();
      fc.setTitle(title);
      if (init != null) {
        fc.setInitialDirectory(init.getParent().toFile());
        fc.setInitialFileName(init.getFileName().toString());
      }
      f = fc.showOpenDialog(this.stage);
    } else {
      DirectoryChooser dc = new DirectoryChooser();
      dc.setTitle(title);
      if (init != null) {
        if (!Files.isDirectory(init)) init = init.getParent();
        dc.setInitialDirectory(init.toFile());
      }
      
      f = dc.showDialog(this.stage);
    }
    return (f == null) ? null : f.toPath();
  }
}
