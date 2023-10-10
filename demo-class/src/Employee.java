public class Employee {
  private String name;

  private static String x = genX(); // can call method here, but must be static method

  public static final int HOURS_PER_HOUR = 24; // using all capital letter for final variable (=constant)
  public static final double PI = Math.PI;

  public static String genX(){
    System.out.println("Step 1: This is genX block.");
    return "1234";
  }

  public Employee(String name){
    System.out.println("Step 4: Constructor");
    this.name = name;
  }

  {
    System.out.println("Step 3: this is initialisation block when you new an object creation.");
    name = "abc";
  } // instance block, but not commonly use

  static {
    System.out.println("Step 2: Static Block runs");
    x="Static variable is assigned";
    // System.out.println(x);
  }

  

  public String getName(){
    return this.name;
  }

  public static void main(String[] args) {
    
    System.out.println("start");

    System.out.println(Employee.x);
    Employee employee = new Employee("John");
    System.out.println("end");
  }
}
