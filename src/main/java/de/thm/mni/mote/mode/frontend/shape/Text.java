package de.thm.mni.mote.mode.frontend.shape;

import de.thm.mni.mote.mode.modelica.graphics.MoText;
import de.thm.mni.mote.mode.modelica.graphics.Utilities;
import de.thm.mni.mote.mode.frontend.controls.modelica.FXMoParentGroup;
import de.thm.mni.mote.mode.frontend.shape.interfaces.Element;
import de.thm.mni.mote.mode.frontend.shape.interfaces.FilledElement;
import de.thm.mni.mote.mode.frontend.shape.interfaces.StrokedElement;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * Created by Marcel Hoppe on 02.11.16.
 */
@Getter
@Setter
public class Text extends Pane implements Element, FilledElement, StrokedElement {
  private final FXMoParentGroup moParent;
  private final MoText data;
  private final javafx.scene.text.Text text = new javafx.scene.text.Text();
  
  private final Translate origin = Transform.translate(0., 0.);
  private final Rotate rotation = Transform.rotate(0., 0., 0.);
  
  DoubleProperty initialStrokeWidthProperty = new SimpleDoubleProperty(1.);
  
  public Text(@NonNull FXMoParentGroup parent, @NonNull MoText data) {
    this.moParent = parent;
    this.data = data;
    this.getChildren().add(text);
    init();
  }
  
  public void setInitialStrokeWidth(Double value) {
    StrokedElement.super.setInitialStrokeWidth(value);
    setOwnStrokeWidth(value);
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
  
    Point2D extent0 = getData().getExtent().getP1();
    Point2D extent1 = getData().getExtent().getP2();
  
    Font f;
    if (getData().getFontSizeProperty().get() != 0) {
      f = Font.font(getData().getFontNameProperty().get(), getData().getFontSizeProperty().get());
    } else {
      f = Font.font(getData().getFontNameProperty().get(), 20);
      f = Font.font(f.getFamily(), Utilities.calculateMaxFontSize(f, getData().getString(), Math.abs(-extent0.getX() + extent1.getX()), Math.abs(-extent0.getY() + extent1.getY())));
    }
    
    this.text.setFont(f);
    this.text.setText(getData().getString());
    this.text.setUnderline(MoText.TextStyle.isUnderline(getData().getTextStyleProperty().get()));
  
  
    Double tlx = Math.min(extent0.getX(), extent1.getX());
    Double tly = Math.min(extent0.getY(), extent1.getY());
  
    Double widthExtent = Math.abs(extent0.getX() - extent1.getX());
    Double heightExtent = Math.abs(extent0.getY() - extent1.getY());
    
    Double widthText = Utilities.calculateStringWidth(f, getData().getString());
    Double heightText = Utilities.calculateFontHeight(f);
    
    this.setPrefWidth(widthExtent);
    this.setPrefHeight(heightExtent);
    //translate the text
    this.getTransforms().add(Transform.translate(tlx, tly));
  
    Scale flipping = new Scale(1., 1.);
    flipping.xProperty().bind(new DoubleBinding() {
      {
        super.bind(getMoParent().getFlippedXProperty());
      }
    
      @Override
      protected double computeValue() {
        return (getMoParent().getFlippedXProperty().get()) ? -1. : 1.;
      }
    
      @Override
      public ObservableList<?> getDependencies() {
        return FXCollections.singletonObservableList(getMoParent().getFlippedXProperty());
      }
    
      @Override
      public void dispose() {
        super.unbind(getMoParent().getFlippedXProperty());
      }
    });
    flipping.yProperty().bind(new DoubleBinding() {
      {
        super.bind(getMoParent().getFlippedYProperty());
      }
    
      @Override
      protected double computeValue() {
        return (getMoParent().getFlippedYProperty().get()) ? 1. : -1.;
      }
    
      @Override
      public ObservableList<?> getDependencies() {
        return FXCollections.singletonObservableList(getMoParent().getFlippedYProperty());
      }
    
      @Override
      public void dispose() {
        super.unbind(getMoParent().getFlippedYProperty());
      }
    });
  
    this.text.getTransforms().add(flipping);
    
    this.text.getTransforms().add(Transform.translate(0, heightText - heightExtent));
    if (getData().getHorizontalAlignmentProperty().get() == MoText.TextAlignment.RIGHT) {
      this.text.getTransforms().add(Transform.translate(widthExtent - widthText, 0));
    } else if (getData().getHorizontalAlignmentProperty().get() == MoText.TextAlignment.CENTER) {
      this.text.getTransforms().add(Transform.translate((widthExtent - widthText) / 2, 0));
    }
  }
}
