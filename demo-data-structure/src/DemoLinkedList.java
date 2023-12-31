import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
  public static void main(String[] args) {
    LinkedList<String> strings = new LinkedList<>();
    strings.add("hello");
    strings.add("world");
    System.out.println(strings.contains("world"));


    // List<String> strings2 = new LinkedList<>();
    List<String> strings2 = DemoLinkedList.getEmptyList(0); // return object (ArrayList or LinkedList)
    strings.add("hello");
    strings.add("world");
    System.out.println(strings.contains("world"));





  }

  public static List<String> getEmptyList(int value){
    if (value == 0)
      return new ArrayList<>();
    return new LinkedList<>();
  }


}
