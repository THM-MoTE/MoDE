package de.thm.mni.mote.mode;

import de.thm.mni.mhpp11.jActor.actors.messagebus.MessageBus;
import de.thm.mni.mhpp11.jActor.actors.ui.messages.StartUIMessage;
import de.thm.mni.mhpp11.jActor.actors.ui.splash.messages.SplashInitMessage;
import de.thm.mni.mhpp11.jActor.actors.ui.splash.messages.SplashShowMessage;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.uiactor.controller.WelcomeController;
import de.thm.mni.mote.mode.util.Constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
  
  public static List<Locale> SUPPORTED_LANGUAGES = new ArrayList<>();
  
  static {
    SUPPORTED_LANGUAGES.add(Locale.ENGLISH);
    SUPPORTED_LANGUAGES.add(Locale.GERMAN);
  }
  
  public static void main(String[] args) {
  
    MessageBus bus = MessageBus.getInstance();
  
    bus.onStart();
  
    SplashInitMessage.SplashInitMessageBuilder builder = SplashInitMessage.builder();
    builder.group(Constants.GLOBALGROUP).to(Constants.UI);
    builder.title(Settings.TITLE);
    builder.subTitle(Settings.SUBTITLE);
    builder.version(Settings.VERSION);
    bus.send(builder.build());
  
    bus.send(new SplashShowMessage(true));
  
    List<?> params = Arrays.asList(args);
    bus.send(new StartUIMessage(WelcomeController.class, params));
  }
}
