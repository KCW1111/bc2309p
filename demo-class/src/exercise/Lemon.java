package exercise;

import exercise2.Apple;

public class Lemon {
  Apple apple = new Apple();
  //apple.name;
  // because the attribute "name" is protected, so it is not accessable from other package (folder)
  // Lemom.java and Apple.java are in different package

  // Cat cat = new Cat();
  // This is not working as Cat.java is package-private

  private String shape;
  private double weight;

  public String getShape() {
    return shape;
  }

  public void setShape(String shapePara) {
    shape = shapePara;

    
  }

  public static void main(String[] args) {
    Lemon lemon = new Lemon();
    lemon.setShape("round");
    System.out.println(lemon.getShape());

  }

  
}
