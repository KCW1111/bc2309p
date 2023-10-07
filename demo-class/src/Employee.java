public class Employee {
  private String name;

  private static String x;

  public Employee(String name){
    System.out.println("Constructor");
    this.name = name;
  }

  {
    System.out.println("this is initialisation block when you new an object creation.");
    name = "abc";
  }

  static {
    System.out.println("Static Block runs");
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
