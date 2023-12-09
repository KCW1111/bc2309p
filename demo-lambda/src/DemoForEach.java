import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DemoForEach {
  public static void main(String[] args) {
    String [] strings = new String[]{"abc", "def", "ghi"};

    // For-Each supports 1, array and 2 list
    for (String string : strings) {
      System.out.println(string);
    }

    List<String> list1 = List.of("abc","def","ghi"); // this way is just for read, update. Cannot add or remove
    List<String> list2 = new ArrayList<>(list1);// actually "ArrayList<>()" is a constructor

    for (String string: list2) {
      System.out.println(string);      
    }

    //Consumer means returning nothing, just like for-each loop
    //Consumer: x -> {}
    list2.forEach( x -> {

      System.out.println("hello" + x);

    });

    //original way to use for each for list2
    Consumer<String> consumer = new Sysout();
    list2.forEach(consumer);

    Consumer<String> consumer2 = x -> System.out.println("Hello" + x);
  }
}
