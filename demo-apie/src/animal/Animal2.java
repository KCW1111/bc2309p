package animal;

public abstract class Animal2 {

  public abstract void sound(); // 2. abstract class can be with abstract method or normal method
  // but class does not have abstract method.

  private double height;
  private double weight;

  public Animal2(){

  }

  public Animal2(double height, double weight){
    this.weight = weight;
    this.height = height;
  }

  public void sound2(){
    System.out.println("ABC");
  }

  public double getHeight(){
    return this.height;
  }

  public double getWeight(){
    return this.weight;
  }
  

  public static void main(String[] args) {
    Animal animal = new Animal(12.0, 20.3);
    //Animal2 animal2 = new Animal2(); // 1. Abstract class cannot be new
  }
}
