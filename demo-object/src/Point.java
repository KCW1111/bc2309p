import java.util.Objects;

public class Point {
  
  private int x;
  
  public int getX() {
    return x;
  }
  
  public void setX(int x) {
    this.x = x;
  }
  
  private int y;

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  // public Point(){

  // }
  
  
  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof Point))
      return false;
    Point point = (Point) obj;
    return Objects.equals(this.x, point.getX()) &&
    Objects.equals(this.getY(), point.getY());
    
  }

  @Override
  public String toString(){
    return "X=" + this.x + ", Y=" + this.y;
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.x, this.y);
  }

  public Point right(){
    this.x += 1;
    return this;
  }

  public Point up(){
    this.y += 1;
    return this;
  }

  public Point left(){
    this.x -= 1;
    return this;
  }

  public Point down(){
    this.y -= 1;
    return this;
  }

  public void moveRight(int delta){
    this.x += delta;
  }

public static void main(String[] args) {
  Point point = new Point(0,0);
  Point point2 = new Point(0, 1);
  Point point3 = new Point(0, 1);

  System.out.println(point2.equals(point3));
  System.out.println(point.equals(point3));

  System.out.println(point.x);
  point.right();
  System.out.println(point.x);


  System.out.println(point.y);
  point.up();
  System.out.println(point.y);

  System.out.println(point.toString());

  System.out.println(point.hashCode());
  System.out.println(point2.hashCode());

  point.x = 0;
  point.y = 0;

  System.out.println(point.right().up().left().up()); // for chain method call, the method should return 'this'.

  point.right(); // Java doesn't require to receive the retun object from method
  point.up();

  System.out.println(point);

  //Point result = Point.rightAndUp(point);
  Point.rightAndUp(point);
  System.out.println(point);

  String s = "hello";
  Point.concatA(s);
  System.out.println(s); // Expected: helloA, but just hello, due to pass by value, not pass by reference
  // String is passing the copy

  String s2 = "hello";
  String s3 = Point.concatA(s2);
  System.out.println(s3);

  //17 classes, Wrapper + primitive type, they are all pass by value, the rest of classes are all pass by reference


}

public static void rightAndUp (Point point){ //Pass by reference
  point.setX(point.getX()+1);
  point.setY(point.getY()+1);
  //return point;
}

public static String concatA(String str){
  return str = str + "A";
}

}
