package shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import enums.Color;

public class Circle extends Shape{

  private static final int HALF_UP = 0;
  private double radius;

  // Encapsulating Constructor
  public static Circle of(double radius, Color color){
    return new Circle(radius,color);
  }

  // constructor

  private Circle(double radius, Color color){
    super(color);
    this.radius = radius;
  }

  // public static Circle of(double radius, Color color){ //Overloading
  //   return new Circle(radius, color);
  // }

  public static Circle of(double radius){ // Overloading
    return new Circle(radius, Color.BLACK);
  }

  public static Circle of(Color color){ // Overloading
    return new Circle(1.0, color);
  }


  public static Circle ofBlue(double radius){ // Overloading
    return new Circle(radius, Color.BLUE);
  }

  // constructor

  // public Circle(double radius, Color color){
  //   super(color);
  //   this.radius = radius;
  // }

  public BigDecimal getRadius() {
    return BigDecimal.valueOf(this.radius);
  }

  // public double getRadius() {
  //   return radius;
  // }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public void setColor(Color color){
    super.setColor(color);
    //this.color = color;
    this.radius = this.radius + 1.0; // bug when double plus double, it should use BigDecimal
    // this.radius = BigDecimal.valueOf(this.radius).add(BigDecimal.ONE).doubleValue();
  }

  public double getDiameter(){
    return this.radius * 2;
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
    Circle circle = new Circle(3.5, Color.BLACK);
    // long result = Math.round(circle.area()* 100);
    // double d1 = result / 100.0; //becareful about result / 100, long/integer is not double
    // System.out.println(d1);
    //System.out.println("circle area=" + Math.round(circle.area() * 100)/100);
    //double d2 = circle.area(HALF_UP,2).doubleValue();
    //System.out.println(d2);

    Shape shape = new Circle(4,Color.WHITE);
    System.out.println(shape.getClass());
    System.out.println(shape.area(RoundingMode.FLOOR, 2));
  }

  Circle circle2 = Circle.ofBlue(5);

  Circle circle3 = Circle.of(Color.WHITE);
  Circle circle4 = Circle.of(3.9);
  Circle circle5 = Circle.of(3.9,Color.BLACK);

  // valueOf() -> static method (used by class)
  String str = String.valueOf(1);
  String str2 = String.valueOf('1');
  String str3 = String.valueOf(true);




  
}
