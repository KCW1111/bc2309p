public class Person {

  private String name; // almost always using private

  private int age;

  public static String x = "hello";

  public static int getY(){
    return 10;
  }

  public Person(){

  }


  public Person(String name, int age){

    this.name = name;
    this.age = age;

  }

  //in Java, a class should be designed, so that it can be reused (extend)
  //Such as making 2 classes, one is Student.java, another one is Teacher.java
  //But they can be further abstracted to be Person.java
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }









}
