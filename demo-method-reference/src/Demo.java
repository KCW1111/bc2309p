import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Demo {
  private static List<String> strings = new ArrayList<>(List.of("XYZ","DEF","GHI"));

  public static void main(String[] args) {

    strings.forEach(e-> System.out.println(e)); // Apply only for single parameter method


    // Method Reference -> Lambda Expression
    strings.forEach(System.out::println); // Apply only for single parameter method

    // Function<T,R> Lambda Expression: i -> "hello".charAt(i)
    Function<Integer,Character> charAtFunction = i -> "hello".charAt(i);
    Function<Integer,Character> charAtFunction2 = "hello"::charAt;

    // comparator method reference
    Comparator<String> compareTo = (s1,s2) -> s1.compareToIgnoreCase(s2);
    Comparator<String> compareTo2 = String::compareToIgnoreCase;

    Collections.sort(strings,compareTo2); // List.of cannot be sorted
    System.out.println(strings);

    // ClassName::new
    Function<String,Integer> newInteger = s -> new Integer(s);
    Function<String,Integer> newInteger2 = Integer::new;


  }
}
