import java.math.BigDecimal;
import java.util.Scanner;

public class Triangle {
  // Once it is created, it's base & height cannot be revised
  double base;
  double height;

  public void setBase(double base) {
    this.base = base;
  }

  public double getBase() {
    return base;
  }
  public void setHeight(double height) {
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public Triangle(double base, double height){
    this.base = base;
    this.height = height;
  }

  public BigDecimal area(){
    BigDecimal area = BigDecimal.valueOf(this.base).multiply(BigDecimal.valueOf(this.height)).multiply(BigDecimal.valueOf(0.5));
    return area;
  }

  public static void main(String[] args) {
    Triangle triangle1 = new Triangle(2.0, 3.0);
    //triangle1.setBase(2.0);
    //triangle1.setHeight(3.0);
    System.out.println(triangle1.area());

    Scanner input = new Scanner(System.in);
    System.out.println("please provide the base: ");
    double input1 = input.nextInt();
    System.out.println("please provide the height: 2");
    double input2 = input.nextInt();
    Triangle triangle2 = new Triangle(input1,input2);


    System.out.printf("The area of the triangle is: " + "%s%n",triangle2.area());


  }


}
