package de.thm.mni.mote.mode;

import de.thm.mni.mhpp11.jActor.actors.messagebus.MessageBus;
import de.thm.mni.mhpp11.jActor.actors.ui.messages.StartUIMessage;
import de.thm.mni.mhpp11.jActor.actors.ui.splash.messages.SplashInitMessage;
import de.thm.mni.mhpp11.jActor.actors.ui.splash.messages.SplashShowMessage;
import de.thm.mni.mhpp11.jActor.actors.utilities.Constants;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.ui.controller.WelcomeController;

import java.io.File;

/**
 * Hello world!
 *
 */
public class Main {
  
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
    bus.send(new StartUIMessage(WelcomeController.class));
  
    Main m = new Main();
    
    //m.testJModelica();
    //m.startGUI(new String[]{"../2014-modelica-kotani/SHM/SeidelThesis/Components/Heart.mo"});
    //m.startGUI(new String[]{"./test.mo"});
    //m.startGUI(args);
  }
  
  private void startGUI(String[] args) {
    MainApp.launch(MainApp.class, args);
  }
  
  private void testJModelica() {
    File file  = new File("./test.mo");
    file = new File("../2014-modelica-kotani/SHM/SeidelThesis/Examples/FullModel/package.mo");
  }
}
