package de.thm.mni.mote.mode.modelica;

import de.thm.mni.mote.mode.backend.omc.OMCompiler;
import lombok.NonNull;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by Marcel Hoppe on 06.10.16.
 */
public class MoLater extends MoClass {
  
  public MoLater() {
    super("l", MoLater.class.getSimpleName());
  }
  
  
  public static void lightParsing(@NonNull OMCompiler omc, @NonNull String name, @NonNull MoContainer parent) {
    Queue<MoContainer> queue = new ConcurrentLinkedQueue<>();
    MoContainer tmp = new MoContainer(omc, parent, name);
    tmp = parent.addChild(tmp).setElement(new MoLater());
    if (!MoClass.getBases().contains(tmp))
      MoClass.getBases().add(tmp);
  
    queue.offer(tmp);

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
    parent.removeNotExistingChildren(names);
    for (String childName : names) {
      MoContainer tmp = new MoContainer(parent.getOmc(), parent, childName);
      tmp = parent.addChild(tmp).setElement(new MoLater());
      queue.offer(tmp);
    }
  }
  
  private static void lightParsing(@NonNull OMCompiler omc, @NonNull String name, MoContainer parent, @NonNull String parentName) {
  
    String n = (parentName.equals("")) ? name : parentName + "." + name;
  
    MoContainer tmp = new MoContainer(omc, parent, name);
    tmp = parent.addChild(tmp).setElement(new MoLater());
    if (parent instanceof MoRoot && !MoClass.getBases().contains(tmp)) {
      MoClass.getBases().add(tmp);
    }
    List<String> names = omc.getChildren(n);
    for (String childName : names) {
      if (!childName.isEmpty()) MoLater.lightParsing(omc, childName, tmp, n);
    }
  }
}
