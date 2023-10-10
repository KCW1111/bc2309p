public class Student extends Person{ // Child class, parent class is Person.java

  private String studentID;

  public Student(){

  }
//p127
  // All-args constructor
  public Student(String studentID){
    super();// to call parents' constructor (empty)
    this.studentID = studentID;
    //this.age = age; //Child class doesn't inherite constructor and private variable, but by using 'super()', the empty constructor will be called.
    
    //this.name = name;
  }

  public Student(String name, int age, String studentID){
    super(name,age);
    this.studentID = studentID;
  }

  public String getStudentID() {
    return studentID;
  }

  public void setStudentID(String studentID) {
    this.studentID = studentID;
  }
  
  public static void main(String[] args) {
    Student student1 = new Student();
    //student1.age = 10;
    student1.setAge(20);
    student1.setName("John");
    student1.setStudentID("A0001");
    //System.out.println(student1.age);

    Person person = new Person();
    person.setAge(40);
    person.setName("Mary");


    Student student2 = new Student("john", 13, "1234");
    System.out.println(student2.studentID);
    System.out.println(student2.getAge());
    System.out.println(student2.getName());

    System.out.println(Person.x); // The best way to call
    System.out.println(Student.x); // legal, but not normal
    System.out.println(student2.x);// class variable can be called, is legal but not recommended

    System.out.println(Person.getY());
    System.out.println(Student.getY());
    System.out.println(person.getY());
    System.out.println(student2.getY());



    


  }
  
}
