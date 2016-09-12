package de.thm.mni.mhpp11.util.config.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.simpleframework.xml.Element;

import java.util.Date;


/**
 * Created by hobbypunk on 11.09.16.
 */
@NoArgsConstructor
@AllArgsConstructor
@lombok.Getter
public class Project {
  @Element
  @NonNull private String name;
  @Element
  @NonNull private String path;
  @Element
  @NonNull private Date lastOpened;
}
