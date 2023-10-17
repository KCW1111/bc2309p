package transportation;

public interface Movable {//a contract

  // implicitly "public static final"
  //public final String name = "";

  String name = "Car";
  
  // all methods 
  public Movable move(); // or public Object move(); Using Movable move() is a kind of polymorphism
  //method signature

  public void accelerate();

  //static staticPrintWinner("Bus");


}
