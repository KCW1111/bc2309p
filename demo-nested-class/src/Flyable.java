@FunctionalInterface //This part can be omitted
public interface Flyable { // If interface has just a function, that is called functional interface
  void fly();



  public static void main(String[] args) {
    Flyable f = new Superman();

    //Chapter27 - Annonymous Inner Class
    Flyable f2 = new Flyable() {
      @Override
      public void fly(){
        System.out.println("I am flying in the interface Flyable.");
      }
    };

    //Lamda demo, "()->" just like "new"
    Flyable f3 = ()-> { // As this part has no parameters and no return value
      System.out.println("I am flying in Lambda.");
    };
    //The condition abot when should Lambda be used: Functional Interface, i.e. one-method interface.
    //For case more than one function is needed, create more Functional Interface

    Readable r3 = ()->{
      System.out.println("I am reading in Lambda");
    };
    


    f.fly();
    f2.fly();
    f3.fly();
  }
}
