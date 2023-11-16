import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) {
    // If Linkedlist (Class) has 100 methods
    // If Queue (Interface) has 60 methods
    // If List (Interface) has 40 methods
    Queue<String> strings = new LinkedList<>();
    strings.add("ABC");
    strings.add("IJK");
    strings.add("DEF");
    //System.out.println(strings);
    String pooledString = strings.poll();
    //System.out.println(pooledString);

    //System.out.println(strings.isEmpty());


    

    int counter = 2;
    // IJKIJKIJK, DEFDEFDEF

    while (!strings.isEmpty() && counter>0){ // standard way to use isEmpty() with while
      String temp = strings.poll();
      String qTemp = "";
      for (int i =0; i<3; i++){
        qTemp += temp;
      }
      strings.add(qTemp);
      //System.out.println(strings.poll());
      System.out.println(strings.size());
      counter--;
    }

    System.out.println(strings);

    System.out.println(strings.peek());// Just look up the value of the head of the queue -> IJK



    strings.addAll(List.of("XYZ","MNO"));
    System.out.println(strings);

    

    //strings.clear();

    System.out.println(strings.contains("MNO")); // true

    for (String s : strings){
      System.out.println(s); // this queue of strings can be printted bcos queue has "toString" implemented from some implement up top
    }

    //strings.re

    List<String> strs = List.of("A","B");
    //strs.add("C");
    //System.out.println(strs); // List.of has NO methods

    //System.out.println(strings.poll());
    //System.out.println(strings);
    // Compile-time: obj-ref strings can only call 60 methods in Queue
    // strings.indexOf() -> this is method from LinkedList, but not Queue Interface
    List<String> strings2 = new LinkedList<>();

  }
}
