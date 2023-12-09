package javafunctionalinterface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class DemoSupplier {
  
  public static void main(String[] args) {
    
  // T get();
  Supplier<Person> person = () -> { // Parent class "can receive" children object
    return new Student(1, "John");
  };

  // T -> List<String>
  Supplier<List<String>> linkedlist = () -> {
    return new LinkedList<>();
  };

  Supplier<List<String>> arraylist = () -> {
    return new ArrayList<>();
  };

  List<String> ll = linkedlist.get();
  ll.add("Hello");

  
}
}