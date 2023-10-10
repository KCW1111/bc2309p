package animal;

public class Animal {
  
  private double weight;
  private double height;

  public double getHeight() {
    return height;
  }
  public void setHeight(double height) {
    this.height = height;
  }
  public double getWeight() {
    return weight;
  }
  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String toString(){
    return "weight=" + this.weight + ",height=" + this.height;
  }

  public Animal(){

  }

  public Animal(double weight, double height){
    this.weight = weight;
    this.height = height;
  }

}
