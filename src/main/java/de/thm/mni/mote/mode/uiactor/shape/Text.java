package de.thm.mni.mote.mode.uiactor.shape;

import de.thm.mni.mote.mode.modelica.graphics.MoText;
import de.thm.mni.mote.mode.modelica.graphics.Utilities;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoGroup;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.Element;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.FilledElement;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.StrokedElement;
import javafx.beans.property.DoubleProperty;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * Created by hobbypunk on 02.11.16.
 */
@Getter
@Setter
public class Text extends Pane implements Element, FilledElement, StrokedElement {
  private final MoGroup moParent;
  private final MoText data;
  private final javafx.scene.text.Text text = new javafx.scene.text.Text();
  
  private final Translate origin = Transform.translate(0., 0.);
  private final Rotate rotation = Transform.rotate(0., 0., 0.);
  
  Double initialStrokeWidth = 1.;
  
  public Text(@NonNull MoGroup parent, @NonNull MoText data) {
    this.moParent = parent;
    this.data = data;
    this.getChildren().add(text);
    init();
  }
  
  public void setInitialStrokeWidth(Double value) {
    initialStrokeWidth = value;
    setOwnStrokeWidth(value);
  }
  
  @Override
  public void setStrokeWidth(double value) {
    this.text.setStrokeWidth(value);
  }
  
  @Override
  public DoubleProperty strokeWidthProperty() {
    return this.text.strokeWidthProperty();
  }
  
  @Override
  public ObservableList<Double> getStrokeDashArray() {
    return this.text.getStrokeDashArray();
  }
  
  @Override
  public void setStroke(Paint p) {
    this.text.setStroke(p);
  }
  
  public void init() {
    Element.super.init();
    FilledElement.super.init();
    StrokedElement.super.init();
  
    Point2D extent0 = getData().getExtent().getP1();
    Point2D extent1 = getData().getExtent().getP2();
  
    Font f;
    if (getData().getFontSize() != 0) {
      f = Font.font(getData().getFontName(), getData().getFontSize());
    } else {
      f = Font.font(getData().getFontName(), 20);
      f = Font.font(f.getFamily(), Utilities.calculateMaxFontSize(f, getData().getString(), Math.abs(-extent0.getX() + extent1.getX()), Math.abs(-extent0.getY() + extent1.getY())));
    }
    
    this.text.setFont(f);
    this.text.setText(getData().getString());
    this.text.setUnderline(MoText.TextStyle.isUnterline(getData().getTextStyle()));
  
  
    Double tlx = Math.min(extent0.getX(), extent1.getX());
    Double tly = Math.min(extent0.getY(), extent1.getY());
  
    Double widthExtent = Math.abs(extent0.getX() - extent1.getX());
    Double heightExtent = Math.abs(extent0.getY() - extent1.getY());
    
    Double widthText = Utilities.calculateStringWidth(f, getData().getString());
    Double heightText = Utilities.calculateFontHeight(f);
    
    this.setPrefWidth(widthExtent);
    this.setPrefHeight(heightExtent);
//    //translate the text
    this.getTransforms().add(Transform.translate(tlx, tly));
    
    if (getMoParent().getFlippedX()) this.text.getTransforms().add(Transform.scale(-1., 1.));
    if (!getMoParent().getFlippedY()) this.text.getTransforms().add(Transform.scale(1., -1.));
    
    this.text.getTransforms().add(Transform.translate(0, heightText - heightExtent));
    if (getData().getHorizontalAlignment() == MoText.TextAlignment.RIGHT) {
      this.text.getTransforms().add(Transform.translate(widthExtent - widthText, 0));
    } else if (getData().getHorizontalAlignment() == MoText.TextAlignment.CENTER) {
      this.text.getTransforms().add(Transform.translate((widthExtent - widthText) / 2, 0));
    }
  }
}
