package animal;

public class Dog2 extends Mammal {

  private String name;

  public Dog2(){
    
  }

  public Dog2(String name, double weight, double height){
    super(height, weight);
    this.name = name;
  }

  //3. Extending abstract class, all abstract methods must be implemented

  @Override //double check annotation, tradition to use parents' methods
  public void sound(){
    System.out.println("barking ....");

  }

  public static void main(String[] args) {
    Dog2 dog2 = new Dog2();
    System.out.println(dog2.getHeight());
  }
  
}
