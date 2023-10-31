package shapes;

import java.math.RoundingMode;
import enums.Color;

public abstract class Shape {
  
  abstract double area(RoundingMode mode, int dp);

  private double radius;

  private Color color;

  public Shape(Color color){
    this.color = color;
  }

  public Color getColor(){
    return this.color;
  }

  public static Shape[] shapes;

  static{
    shapes = new Shape[10];
  }

  public static void add(Shape shape){
    // add shape into shapes
    for (int i = 0; i<shapes.length; i++){
      if (shapes[i] == null){
        shapes[i] = shape;
        return;
      }
        
    }
  }

  public static double totalAreas(Shape[] shapes){
    double total = 0.0;
    for (int i = 0; i<shapes.length; i++){
      if (shapes[i] != null){
        total += shapes[i].area(RoundingMode.HALF_UP,2); // polymorphism, using square.area or circle.area is determined during the runtime
        System.out.println(total);
      }
        
    }
    return total;

  }


  // new 2 Circle and 1 Square, and put them into the Shape[]
  public static void main(String[] args) {
    Circle circle1 = new Circle(3, Color.BLACK);
    Circle circle2 = new Circle(4, Color.WHITE);
    Square square1 = new Square(Color.BLUE, 10);

    Shape.add(circle1);
    Shape.add(circle2);
    Shape.add(square1);

    System.out.println(Shape.totalAreas(shapes)); 

    // shapes[0] = circle1;
    // shapes[1] = circle2;
    // shapes[2] = square1;
  }
    

  


  //double *?
  //getter, setter
  //constructor
  //equals(), hasCode, toString
}
