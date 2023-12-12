import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream{
  public static void main(String[] args) {
    // Predicate
    // Consumer
    // Stream = Predicate + Consumer

    List<String> strings = new ArrayList<>();
    strings.add("ABC");
    strings.add("ABFxxx");
    strings.add("ABE");
    strings.add("ABGxxx");

    int total = 0;

    for (String string : strings) {
      if (string.length() <=3){
        System.out.println(string);
        total += string.length(); // *********this is the characterisitics of for loop, work with total*********
      }
    }

    // after Java 8
    strings.stream()//retrun from List<String> to Stream<String>
    .filter(string -> string.length() <=3) // intermediate operation (anytime output boolean), -> boolean output
    .forEach(string -> System.out.println(string)); // terminate operation (anytime output void)
    //***********.forEach(string -> total += string.length()); // this is illegal, that is not the idea of stream, not for changing or accumulating outside scope variable ************
    //Predicate<Integer> overSomethingFormula = num -> num > 20; // new an objec there (an object reference)

    Stream<String> ss = strings.stream()
    .filter(string -> string.charAt(2) == 'F'); // as intermediate operation will always output boolean value
    System.out.println(strings.size());//3
    System.out.println(ss.count());//1, things inside stream is not observable

    // Convert data structure (the main purpose of Stream)
    Set<String> s1 = new HashSet<>();
    // without stream, from list to set is painful
    // using stream:
    
    Set<String> s2 = strings.stream()//
    .filter(string -> string.length()>3)
    .collect(Collectors.toSet());// HashSet Object

    s2.stream().forEach(string->System.out.println(string));
    System.out.println(s2.getClass());

    //things under collections can use stream

    List<String> ns = strings.stream()//
    .filter(string->string.length()>3) // intermediate
    .map(string->string.concat("hello")) //intermediate (in this part, you can have string modified)
    .collect(Collectors.toList()); //terminate

    System.out.println(ns.getClass());









  }
}