public class Bird { // implicitly extends Object.class


  private String name;

  public final String color = "Yellow";

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
    return "Bird(name=" + this.name + ")";
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
    }
    //object.fly -> throws error





  }
}
