package de.thm.mni.mhpp11.shape;

import de.thm.mni.mhpp11.control.icon.MoGroup;
import de.thm.mni.mhpp11.shape.interfaces.Element;
import de.thm.mni.mhpp11.shape.interfaces.FilledElement;
import de.thm.mni.mhpp11.shape.interfaces.StrokedElement;
import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoText;
import de.thm.mni.mhpp11.util.parser.models.graphics.Utilities;
import javafx.collections.ObservableList;
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
    setStrokeWidth(value);
  }
  
  @Override
  public void setStrokeWidth(double value) {
    this.text.setStrokeWidth(value);
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
    
    Point<Double, Double>[] extent = getData().getExtent();
    Font f;
    if (getData().getFontSize() != 0) {
      f = Font.font(getData().getFontName(), getData().getFontSize());
    } else {
      f = Font.font(getData().getFontName(), 20);
      f = Font.font(f.getFamily(), Utilities.calculateMaxFontSize(f, getData().getString(), Math.abs(-extent[0].getX() + extent[1].getX()), Math.abs(-extent[0].getY() + extent[1].getY())));
    }
    
    this.text.setFont(f);
    this.text.setText(getData().getString());
    this.text.setUnderline(MoText.TextStyle.isUnterline(getData().getTextStyle()));
    
    
    Double tlx = Math.min(extent[0].getX(), extent[1].getX());
    Double tly = Math.min(extent[0].getY(), extent[1].getY());
    
    Double widthExtent = Math.abs(extent[0].getX() - extent[1].getX());
    Double heightExtent = Math.abs(extent[0].getY() - extent[1].getY());
    
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
