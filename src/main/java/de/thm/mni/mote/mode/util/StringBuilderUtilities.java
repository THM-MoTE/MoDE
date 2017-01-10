package de.thm.mni.mote.mode.util;

import javafx.beans.property.ReadOnlyProperty;
import javafx.scene.paint.Color;
import lombok.experimental.UtilityClass;

/**
 * Created by hobbypunk on 02.12.16.
 */
@UtilityClass
public class StringBuilderUtilities {
  public StringBuilder addProperty(StringBuilder sb, ReadOnlyProperty<?> property) {
    return addProperty(sb, property, "");
  }
  
  public StringBuilder addProperty(StringBuilder sb, ReadOnlyProperty<?> property, String valuePrefix) {
    if (!sb.toString().isEmpty()) sb.append(", ");
    sb.append(property.getName()).append(" = ");
    if (property.getValue() instanceof Double)
      sb.append(Utilities.getFormatter().format(property.getValue()));
    else if (property.getValue() instanceof Color)
      de.thm.mni.mote.mode.modelica.graphics.Utilities.convertColor(property.getValue());
    else
      sb.append(valuePrefix).append(property.getValue());
    return sb;
  }
  
  public StringBuilder addString(StringBuilder sb, String str) {
    return addString(sb, str, "");
  }
  
  public StringBuilder addString(StringBuilder sb, String str, String ignore) {
    if (!sb.toString().replaceFirst(ignore, "").isEmpty()) sb.append(", ");
    sb.append(str);
    return sb;
  }
}
