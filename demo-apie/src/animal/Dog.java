package animal;

public class Dog extends Animal{

  private String name;

  public Dog(){

  }

  public Dog(double age, double weight, String name){
    super(age,weight); // this call must be done first before pass the below lines
    this.name = name;
  }
  
  public String sound(){
    return "WO WO";
  }

  // public String toString(){

    
  //   return 
    
  //   //return super.weight + ", height=" + this.height; as weight and height are private, cannot call by this method
  // }

  public String toString(){
    return "Dog(name=" + this.name + ", Animal(" + super.toString() + "))";
  }

  public static void main(String[] args) {
    Dog dog1 = new Dog(11.0, 22.0, "Dolly");
    System.out.println(dog1);
  }
}
