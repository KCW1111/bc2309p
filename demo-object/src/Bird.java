import java.util.Objects;

public class Bird { // implicitly extends Object.class


  private String name;
  //private String size;

  private int age;



  public final String color = "Yellow";

  @Override
  public boolean equals(Object obj){ // override, try to follow the shape of the method of the parent class
    if (this == obj) // check object reference, if object reference is equal, obviously they are the same
      return true;
    if (!(obj instanceof Bird)) // check if the object is Bird's instance
      return false;
    Bird bird = (Bird) obj;
    //return bird.getName().equals(this.name); // Check String by equals()
    return Objects.equals(bird.getName(),this.name) &&
    Objects.equals(bird.getAge(),this.age);
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name,this.age);
  }

  

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public static Bird valueOf(String name){ // static method to new a bird
    return new Bird(name);

  }

  public Bird(String name){ // with the Bird valueOf, the Bird constructor can be private.
    this.name = name;
    //this.size = size;

  }

  public Bird(){

  }


  public String getColor() {
    return this.color;
  }

  public final void fly(){
    System.out.println("this is final fly() method"); // finally method cannot be override
  }

  public String toString(String someString){
    return someString;
  }

  public String toString(){
    return "Bird(name=" + this.name + " color=" + this.color + ")";
  }
  public static void main(String[] args) {
    Bird bird = new Bird();
    System.out.println(bird.toString()); // Bird@7344699f -> Object Reference, if not overriding toString()


    Object object = new Object();
    object = "123";
    System.out.println(object.getClass());
    object = 123;
    System.out.println(object.getClass());
    object = 0.0;
    System.out.println(object.getClass());
    object = bird;
    System.out.println(object.getClass());

    if (object instanceof Bird){ // true
      //downcase?? downcast??
      Bird b = (Bird) object; // downcase from Object.class to Bird.class
      b.fly();
    }else if (object instanceof String){//object.fly -> throws error
      String s = (String) object; // dowcase from Object to String
      System.out.println(s.length());
      
    }else if (object instanceof Integer){
      Integer s = (Integer) object; 
      System.out.println(s.doubleValue());
    }

    Integer i1 = Integer.valueOf(100);
    Integer i2 = new Integer(100);

    Bird b1 = new Bird("John");
    b1.setAge(5);
    Bird b2 = Bird.valueOf("John");
    b2.setAge(5);
    System.out.println(b2);

    System.out.println(b2.equals(b1));

    System.out.println(b1.hashCode());
    System.out.println(b2.hashCode());










  }
}
