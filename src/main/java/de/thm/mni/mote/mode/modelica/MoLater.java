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
  
  MoLater(String name, MoClass parent) {
    super(null, name, parent);
    PREFIX = "l";
  }
  
  
  public static void lightParse(@NonNull OMCompiler omc, @NonNull String name, @NonNull MoClass parent) throws ParserException {
    lightParse(omc, name, parent, "");
  }
  
  private static void lightParse(@NonNull OMCompiler omc, @NonNull String name, MoClass parent, @NonNull String parentName) throws ParserException {
    String n = (parentName.equals("")) ? name : parentName + "." + name;
    
    MoLater tmp = new MoLater(name, parent);
    
    List<String> names = omc.getChildren(n);
    names.forEach(childName -> {
      try {
        if (!childName.isEmpty()) MoLater.lightParse(omc, childName, tmp, n);
      } catch (ParserException e) {
        MessageBus.getInstance().send(new ErrorMessage(MoLater.class, e));
      }
    });
  }
}
