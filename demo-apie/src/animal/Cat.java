package animal;

public class Cat extends Animal{

  private int legs;
  private int age;
  private String tail;
  private double weight;
  private double height;

  public Cat(int legs, int age, String tail, double weight, double height){
    super(weight, height);
    this.legs = legs;
    this.age = age;
    this.tail = tail;
  }

  public String sound(){
    return "Meow";
  }

  public String toString(){
    return "Cat(name=" + this.age + ", Animal(" + super.toString() +"))";
  }
  
}
