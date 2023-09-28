import java.math.BigDecimal;
import java.util.Scanner;

public class Circle {
  //area
  // radius * radius * pi (3.14)
  // Math.PI

  //* Big Decimal is only used in calculation, in variable declaration, just double is fine */

  BigDecimal radius;
  String colour;

  public void setColour(String colour) {
    this.colour = colour;
  }

  public String getColour() {
    return colour;
  }

  public void setRadius(BigDecimal radius) {
    this.radius = radius;
  }

  public BigDecimal getRadius() {
    return radius;
  }

  public Circle(BigDecimal radius){
    this.radius = radius;
  }


  public BigDecimal area(){
    BigDecimal area = this.radius.multiply(this.radius).multiply(BigDecimal.valueOf(Math.PI));
    return area;
  }



  public static void main(String[] args) {
    Circle circle1 = new Circle(BigDecimal.valueOf(3.2));
    circle1.setColour("Orange");
    
    System.out.println(circle1.area());
    System.out.println(circle1.colour);
    System.out.printf("%s%n%s%n%s%n", "Hello", "World", "Again");

    Scanner input = new Scanner(System.in);
    
  }
  
}
