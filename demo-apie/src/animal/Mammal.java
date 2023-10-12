package animal;

public abstract class Mammal extends Animal2 {

  //4. abstract class can extend abstract class

  public Mammal(){

  }
  
  public Mammal(double weight, double height){
    super(height,weight);

  }

  public abstract void sound();
  
}
