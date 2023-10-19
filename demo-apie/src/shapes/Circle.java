package shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Circle extends Shape{

  private static final int HALF_UP = 0;
  private double radius;

  public Circle(double radius){
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double area(RoundingMode mode, int dp){
    //BigDecimal -> valueOf()
    BigDecimal radiusBD = BigDecimal.valueOf(this.radius);
    return radiusBD.multiply(radiusBD).multiply(BigDecimal.valueOf(Math.PI)).setScale(dp, mode).doubleValue();

  }

  @Override
  public boolean equals(Object obj){ // override, try to follow the shape of the method of the parent class
    if (this == obj) // check object reference, if object reference is equal, obviously they are the same
      return true;
    if (!(obj instanceof Circle)) // check if the object is Bird's instance
      return false;
    Circle circle = (Circle) obj;
    //return bird.getName().equals(this.name); // Check String by equals()
    return Objects.equals(circle.getRadius(),this.radius); 
    //&& Objects.equals(circle.getAge(),this.age);
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.radius);
  }

  @Override
  public String toString(){
    return "Circle(radius=" + this.radius + ")";
  }

  public static void main(String[] args) {
    Circle circle = new Circle(3.5);
    // long result = Math.round(circle.area()* 100);
    // double d1 = result / 100.0; //becareful about result / 100, long/integer is not double
    // System.out.println(d1);
    //System.out.println("circle area=" + Math.round(circle.area() * 100)/100);
    double d2 = circle.area(HALF_UP,2).doubleValue();
    System.out.println(d2);
  }




  
}
