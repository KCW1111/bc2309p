public class Teacher extends Person { // Child class, parrent class is Person.java
  
  public static void main(String[] args) {
    Teacher teacher = new Teacher();
    teacher.setAge(10);
    teacher.setName("Peter");
    System.out.println(teacher.toString());

    System.out.println(teacher.getAge());
    System.out.println(teacher.getName());
  }
}
