package javafunctionalinterface;

import java.util.function.Consumer;

public class DemoConsumer {
  public static void main(String[] args) {
    // void accept (T t)
    // Using Java built-in funcitonal interface
    Consumer<Person> c = (p) -> {
      System.out.println(p.getName());
    };

    // We can skip the () if there is only one parameter
    Consumer<Person> printName = p ->{
      System.out.println(p.getName());
    };

    printName.accept(new Person("John"));
  }
}
