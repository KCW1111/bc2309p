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

  public boolean isAdult(){
    // if (this.age > 18)
    //   return true;
    // else
    //   return false;
    return this.age >= 18;
  }

  public boolean isElderly(){
    return this.age >=65;
  }

  public static boolean isElderly(int age){ // this method is bad, not OO
    return age >=65;
  }

  public boolean isNameValid(){
    return this.name.length() <=10;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static void main(String[] args) {
    Person person = new Person("John", 18);
    System.out.println(person.isAdult());
    Person person2 = new Person("Mary",17);
    System.out.println(person2.isAdult());

    // Approach 1, this approach is fair, should hide the logic inside the method, but not the program, as the definition of adult will change, such as 20.
    if (person.getAge() >=18){
      System.out.println("is adult");
    }

    Person person3 = new Person("abcdefghijk",65);
    System.out.println(person3.isNameValid());//false
    System.out.println(person3.isElderly());// true

    System.out.println(isElderly(person3.getAge()));

  }









}
