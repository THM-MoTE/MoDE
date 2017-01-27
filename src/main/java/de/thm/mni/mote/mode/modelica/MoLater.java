package de.thm.mni.mote.mode.modelica;

import de.thm.mni.mhpp11.jActor.actors.logging.messages.ErrorMessage;
import de.thm.mni.mhpp11.jActor.actors.messagebus.MessageBus;
import de.thm.mni.mote.mode.omcactor.OMCompiler;
import de.thm.mni.mote.mode.parser.ParserException;
import lombok.NonNull;

import java.util.List;

/**
 * Created by hobbypunk on 06.10.16.
 */
public class MoLater extends MoClass {
  
  private MoLater() {
    super("l", MoLater.class.getSimpleName());
  }
  
  
  public static void lightParsing(@NonNull OMCompiler omc, @NonNull String name, @NonNull MoContainer parent) throws ParserException {
    lightParsing(omc, name, parent, "");
  }
  
  private static void lightParsing(@NonNull OMCompiler omc, @NonNull String name, MoContainer parent, @NonNull String parentName) throws ParserException {
    String n = (parentName.equals("")) ? name : parentName + "." + name;
    
    MoContainer tmp = new MoContainer(omc, parent, name).setElement(new MoLater());
    parent.getChildren().add(tmp);
    if (parent instanceof MoRoot && !MoClass.getBases().contains(tmp)) {
      MoClass.getBases().add(tmp);
    }
    List<String> names = omc.getChildren(n);
    names.forEach(childName -> {
      try {
        if (!childName.isEmpty()) MoLater.lightParsing(omc, childName, tmp, n);
      } catch (ParserException e) {
        MessageBus.getInstance().send(new ErrorMessage(MoLater.class, e));
      }
    });
  }
}
