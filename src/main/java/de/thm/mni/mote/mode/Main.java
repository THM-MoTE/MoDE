package de.thm.mni.mote.mode;

import de.thm.mni.mhpp11.smbj.actors.logging.LogActor;
import de.thm.mni.mhpp11.smbj.actors.messagebus.MessageBus;
import de.thm.mni.mhpp11.smbj.actors.ui.creator.UICreatorActor;
import de.thm.mni.mhpp11.smbj.messages.messagebus.StartMessage;
import de.thm.mni.mhpp11.smbj.messages.ui.SplashShowMessage;
import de.thm.mni.mhpp11.smbj.messages.ui.creator.StartUIMessage;
import de.thm.mni.mhpp11.smbj.ui.splashscreen.controller.SplashController;
import de.thm.mni.mhpp11.smbj.ui.splashscreen.messages.SplashInitMessage;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.uiactor.controller.WelcomeController;
import de.thm.mni.mote.mode.util.Constants;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main extends Application {
  
  public static List<Locale> SUPPORTED_LANGUAGES = new ArrayList<>();
  
  static {
    SUPPORTED_LANGUAGES.add(Locale.ENGLISH);
    SUPPORTED_LANGUAGES.add(Locale.GERMAN);
  }
  
  public static void main(String[] args) {
    MessageBus bus = MessageBus.getInstance();
    bus.send(new StartMessage(LogActor.class, Constants.GLOBALGROUP));
    bus.send(new StartMessage(UICreatorActor.class, Constants.GLOBALGROUP));
  
    bus.onStart();
  
    launch(args);
  }
  
  @Override
  public void start(Stage primaryStage) throws Exception {
    MessageBus bus = MessageBus.getInstance();
    SplashController.load(primaryStage);
  
    SplashInitMessage.SplashInitMessageBuilder builder = SplashInitMessage.builder();
    builder.title(Settings.TITLE);
    builder.subTitle(Settings.SUBTITLE);
    builder.version(Settings.VERSION);
    bus.send(builder.build());
  
    bus.send(new SplashShowMessage(true));
    
    List<?> params = getParameters().getUnnamed();
    bus.send(new StartUIMessage(WelcomeController.class, params));
  }
}
