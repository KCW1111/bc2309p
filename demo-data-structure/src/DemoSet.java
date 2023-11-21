import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class DemoSet {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("hello");
    strings.add("world");
    strings.add("world");

    Set<String> strings2 = new HashSet<>();
    System.out.println(strings2.add("hello"));
    System.out.println(strings2.add("world"));
    System.out.println(strings2.add("world"));
    System.out.println(strings2);

    List<String> strs = List.of("hello", "world", "hello", "hello", "XYZ");

    int count = 0;
    for (String s: strs){
      if (s.equals("hello"))
        count++;
    }

    //List<String> strs = List.of("hello", "world", "hello", "hello", "XYZ");
    // 1. Count duplicated elements
    //System.out.println(countTarget(strs, "XYZ"));

    // 2. Filter out duplicated elements
    List<String> strList = new ArrayList<>(strs); // List.of() is immutable
    filterDuplicated(strList);
    System.out.println(strList);


    
    
  }

  public static void filterDuplicated(List<String> list){

    Set<String> strings = new HashSet<>();

    for (String string : list) {
      strings.add(string);    
    }

    list.clear();

    for (String string : strings) {
      list.add(string);
    }

  }

  public static int countTarget(List<String> list, String target){
    Set<String> strings3 = new HashSet<>();

    for (String string : list) {
      strings3.add(string);    
    }
      return strings3.size(); // the answer is always 3, this is wrong

}

}
