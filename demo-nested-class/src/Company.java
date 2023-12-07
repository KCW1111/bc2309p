public class Company {
  private String name;

  public static Employee createEmployee(String employeeName, int employeeId){
    return new Employee(employeeName, employeeId);
  }

  public static class Employee{
    private String employeeName;
    private int employeeId;

    public Employee(String employeeName, int employeeId){
    //private Employee(String employeeName, int employeeId){
      this.employeeName = employeeName;
      this.employeeId = employeeId;
    }

    public void info(){
      System.out.println("Employee Name: " + this.employeeName);
      System.out.println("Employee Id: " + this.employeeId);
    }
  }


  // public static void main(String[] args) {
  //   Company.Employee employee = new Company.Employee("John", 12345);
  // }
}
