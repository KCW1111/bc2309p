package shape;

import java.math.BigDecimal;

public class Circle extends Shape {

  private double radius;

  public Circle(double radius){ // should not let users take care of changing BigDecimal
    this.radius = radius;

  }

  @Override
  public double area(){
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal
    .valueOf(this.radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }
  
}
