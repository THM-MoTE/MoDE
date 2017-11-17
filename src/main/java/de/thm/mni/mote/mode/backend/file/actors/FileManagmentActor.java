package de.thm.mni.mote.mode.backend.file.actors;

import de.thm.mni.mhpp11.smbj.actors.AbstractActor;
import de.thm.mni.mhpp11.smbj.messages.base.Message;
import de.thm.mni.mote.mode.backend.file.Saver;
import de.thm.mni.mote.mode.backend.file.messages.FileNewMessage;
import de.thm.mni.mote.mode.backend.file.messages.ModelsSaveMessage;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.util.Utilities;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class FileManagmentActor extends AbstractActor {
  
  public FileManagmentActor(UUID id) {
    super(id);
  }
  
  @Override
  public void execute(Message msg) {
    if (msg instanceof FileNewMessage) {
        createNew((FileNewMessage) msg);
      } else if (msg instanceof ModelsSaveMessage) {
        saveAll(((ModelsSaveMessage) msg).getPayload());
      }
  }
  
  private void createNew(FileNewMessage msg) {
    MoContainer parent = msg.getPayload();
    String type = msg.getType().toLowerCase();
    String name = msg.getData().get("name");
    
    Map<String, String> data = msg.getData();
    data.put("type", type);
    Path parentDir = parent.getElement().getClassInformation().getFileName().getParent();
    List<String> fileContent;
    try {
      fileContent = IOUtils.readLines(Utilities.getTemplate(((type.endsWith("package")) ? type : "class") + ".mo"), StandardCharsets.UTF_8);
      for (Map.Entry<String, String> entry : data.entrySet()) {
        for (int i = 0; i < fileContent.size(); i++) {
          fileContent.set(i, fileContent.get(i).replaceAll("<" + entry.getKey() + ">", entry.getValue()));
        }
      }
    
      Path file = parentDir.resolve(name + ".mo");
      if (type.equals("package")) {
        parentDir = parentDir.resolve(name);
        Files.createDirectory(parentDir);
        file = parentDir.resolve("package.mo");
      }
    
      Files.write(file, fileContent, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  private void saveAll(List<MoContainer> containers) {
    containers.forEach(Saver::save);
  }
}
