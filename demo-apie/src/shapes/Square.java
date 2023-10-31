package shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import enums.Color;

public class Square extends Shape {

  private double length;

  public Square(Color color, int length) {
    super(color);
    this.length = length;
  }

  @Override
  public double area(RoundingMode mode, int dp){
    //BigDecimal -> valueOf()
    BigDecimal lengthBD = BigDecimal.valueOf(this.length);
    return lengthBD.multiply(lengthBD).doubleValue();

  }

  public static void main(String[] args) {
    Square square = new Square(Color.BLUE, 5);
    Double area = square.area(RoundingMode.HALF_UP, 2);
    System.out.println(area);

    

  }

  
  
}
