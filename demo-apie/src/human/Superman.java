package human;

public class Superman extends Human implements Superpower, Life{

  private String name;

  public Superman(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }
  @Override
  public void fly(){
    System.out.println("I am flying.");
  }

  @Override
  public void run(){
    System.out.println("I am running.");
  }

  public static void main(String[] args) {
    // Polymorphism
    Superman superman = new Superman("Tommy");
    // superman is an object reference
    // this object reference is pointing to an Superman Object

    Human h = new Superman("Mary");
    // Compile time check, whenever red line highlight, it is compile time error
    //h.getName(); // No getName from h, as h is object reference declared by Human

    h.run(); // I am running .... (during runtime, the object performs behaviour)
  }

  @Override
  public int life() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'life'");
  }


  
}
