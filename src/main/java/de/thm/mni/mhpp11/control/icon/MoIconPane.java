package de.thm.mni.mhpp11.control.icon;

import de.thm.mni.mhpp11.util.parser.models.MoClass;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoText;

/**
 * Created by hobbypunk on 19.09.16.
 */
public class MoIconPane extends MoPane {
  private final Boolean iconOnly;
  
  public MoIconPane(MoClass moClass) {
    this(moClass, true);
  }
  
  public MoIconPane(MoClass moClass, Boolean iconOnly) {
    super(moClass);
    this.iconOnly = iconOnly;
    init();
  }
  
  protected void initImage() {
    this.getMoClass().getIcon().getMoGraphics().stream().filter(mg -> !iconOnly || (!(mg instanceof MoText))).forEach(this::initImage);
    if (!iconOnly)
      initConnectors();
  }
  
  private void initConnectors() {
    getMoClass().getConnectorVariables().forEach(super::initVariable);
    getBasis().getChildren().stream().filter(node -> node instanceof MoIconPane).forEach(node -> {
      MoIconPane mip = (MoIconPane) node;
      node.setOnMouseClicked(event -> {
        System.out.println(mip.getMoClass());
        event.consume();
      });
    });
  }
  
}
