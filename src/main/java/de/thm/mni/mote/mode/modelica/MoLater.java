package de.thm.mni.mote.mode.modelica;

import de.thm.mni.mhpp11.jActor.actors.logging.messages.ErrorMessage;
import de.thm.mni.mhpp11.jActor.actors.messagebus.MessageBus;
import de.thm.mni.mote.mode.omcactor.OMCompiler;
import de.thm.mni.mote.mode.parser.ParserException;
import lombok.NonNull;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by hobbypunk on 06.10.16.
 */
public class MoLater extends MoClass {
  
  public MoLater() {
    super("l", MoLater.class.getSimpleName());
  }
  
  
  public static void lightParsing(@NonNull OMCompiler omc, @NonNull String name, @NonNull MoContainer parent) throws ParserException {
    Queue<MoContainer> queue = new ConcurrentLinkedQueue<>();
    MoContainer tmp = new MoContainer(omc, parent, name);
    tmp = parent.addChild(tmp).setElement(new MoLater());
    if (!MoClass.getBases().contains(tmp))
      MoClass.getBases().add(tmp);
  
    queue.offer(tmp);
    //lightParsing(omc, name, parent, "");
    walk(queue);
  }
  
  private static void walk(Queue<MoContainer> queue) {
    MoContainer parent;
    while ((parent = queue.poll()) != null) {
      addChildren(queue, parent);
    }
  }
  
  private static void addChildren(Queue<MoContainer> queue, MoContainer parent) {
    List<String> names = parent.getOmc().getChildren(parent.getName());
    for (String childName : names) {
      MoContainer tmp = new MoContainer(parent.getOmc(), parent, childName);
      tmp = parent.addChild(tmp).setElement(new MoLater());
      queue.offer(tmp);
    }
  }
  
  private static void lightParsing(@NonNull OMCompiler omc, @NonNull String name, MoContainer parent, @NonNull String parentName) throws ParserException {
  
    String n = (parentName.equals("")) ? name : parentName + "." + name;
  
    MoContainer tmp = new MoContainer(omc, parent, name);
    tmp = parent.addChild(tmp).setElement(new MoLater());
    if (parent instanceof MoRoot && !MoClass.getBases().contains(tmp)) {
      MoClass.getBases().add(tmp);
    }
    List<String> names = omc.getChildren(n);
    for (String childName : names) {
      try {
        if (!childName.isEmpty()) MoLater.lightParsing(omc, childName, tmp, n);
      } catch (ParserException e) {
        MessageBus.getInstance().send(new ErrorMessage(MoLater.class, omc.getGroup(), e));
      }
    }
  }
}
