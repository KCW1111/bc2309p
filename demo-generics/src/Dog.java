public class Dog extends Animal{

  private int age;

  public static <T extends Animal>void makeSound(Printer<T> animals){

  }

  // public static void makeSound(Printer<Dog> animals){

  // }

  public static void main(String[] args) {
    Printer<Animal> animalPrinter = new Printer<>();
    Printer<Dog> dogPrinter = new Printer<>();

    //animalPrinter = dogPrinter; // cannot be polymorthism

    Printer<String> stringPrinter = new Printer<>();
    //Dog.makeSound(stringPrinter); // not ok, T shoudl be in Animal Range
    Printer<Dog> dogPrinter2 = new Printer<>();
    Dog.makeSound(dogPrinter2); // ok, as T is animal or below class
    Dog.makeSound(dogPrinter); // ok, as T is animal or below class

    

    
  }
}
