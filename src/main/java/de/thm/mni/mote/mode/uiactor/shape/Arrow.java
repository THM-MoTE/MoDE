package de.thm.mni.mote.mode.uiactor.shape;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.transform.Rotate;

//From: https://stackoverflow.com/questions/26702519/javafx-line-curve-with-arrow-head
abstract class Arrow extends Polygon {
  
  public double rotate;
  public float t = 0;
  Line line;
  private Rotate rz;
  
  abstract Point2D getPoint();
  private boolean isStart() {
    return this instanceof StartArrow;
  }
  
  public Arrow(Line parent) {
    super();
    this.line = parent;
    init();
  }
  
  public Arrow(Line parent, double... arg0) {
    super(arg0);
    this.line = parent;
    init();
  }
  
  private void init() {
    
    setFill(Color.web("#ff0900"));
    
    rz = new Rotate();
    {
      rz.setAxis(Rotate.Z_AXIS);
    }
    getTransforms().addAll(rz);
    
    update();
  }
  
  private void update() {
    double size = Math.max(line.getBoundsInLocal().getWidth(), line.getBoundsInLocal().getHeight());
    double scale = size / 4d;
    
    Point2D ori = eval();
    Point2D tan = evalDt().normalize().multiply(scale);
    
    setTranslateX(ori.getX());
    setTranslateY(ori.getY());
    
    double angle = Math.atan2(tan.getY(), tan.getX());
    
    angle = Math.toDegrees(angle);
    
    // arrow origin is top => apply offset
    double offset = -90;
    if (t > 0.5)
      offset = +90;
    
    rz.setAngle(angle + offset);
    
  }
  
  /**
   * Evaluate the cubic line at a parameter 0<=t<=1, returns a Point2D
   *
   * @return a Point2D
   */
  private Point2D eval() {
    return getPoint();
  }
  
  /**
   * Evaluate the tangent of the cubic line at a parameter 0<=t<=1, returns a Point2D
   *
   * @return a Point2D
   */
  private Point2D evalDt() {
    return new Point2D(-3 * getPoint().getX(), -3 * getPoint().getY());
  }
}
