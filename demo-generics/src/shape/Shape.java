package shape;

import java.math.BigDecimal;
import java.util.List;

public abstract class Shape {
  abstract double area();

 public static <T extends Shape> double totalArea(List<T> shapes){


  BigDecimal total = new BigDecimal(0);

  for (T t : shapes) {
    total = total.add(BigDecimal.valueOf(t.area()));
    
  }

  return total.doubleValue();

 } 


 public static void main(String[] args) {
  double result = Shape.totalArea(List.of(new Circle(1.0),new Square(2.0))); // bcos line 9 limit the class to be Shape, and it ensures the class has area() method
  
  System.out.println(result);
 }
}
