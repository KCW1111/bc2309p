public class Runner<T extends Animal> {

  T object;

  public Runner(T object){
    this.object = object;
  }

  //This part can move to any classes
  public static <U extends Animal> Runner<U> getRunner(){
    return null;
  }
  //This part

  public static void main(String[] args) {
    Runner<Dog> dogRunner = new Runner<Dog>(new Dog());
    //Runner<Person> personRunner = new Runner<>(new Person());
  }
  
}
