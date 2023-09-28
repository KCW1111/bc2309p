import java.math.BigDecimal;

public class Square2 {

  BigDecimal length;
  //BigDecimal area; Bad definition, as area calculates by length

  int intLength;

  //constructor
  public Square2(){

  }

  public Square2(int length){
    this.intLength = length;
  }

  public void setLength(BigDecimal length) {
    this.length = length;
  }

  public BigDecimal getLength() {
    return length;
  }

  

  public void setIntLength(int intLength) {
    this.intLength = intLength;
  }

  public int getIntLength() {
    return intLength;
  }



  public static BigDecimal area(BigDecimal length){
    BigDecimal area = length.multiply(length);
    return area;
    
  }

  public static double area(double length){
    double area = length * length;
    return area;
  }

  public static int area(int length){
    int area = length * length;
    return area;
  }

  public int area(){
    int area = this.intLength * this.intLength;
    return area;
  }

  public static void main(String[] args){
  BigDecimal line = BigDecimal.valueOf(3.3);
  BigDecimal result = area(line);
  System.out.println(result);
  System.out.println(area(BigDecimal.valueOf(3.3)));


  // new Square
  // approach  1:
  Square2 square = new Square2(); // empty constructor
  square.setIntLength(3);
  System.out.println(square.area());

  // approach 2:
  Square2 square2 = new Square2((int)3);
  System.out.println(square2.area());

}
  
}

