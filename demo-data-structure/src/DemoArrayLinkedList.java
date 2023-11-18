import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoArrayLinkedList {
  public static void main(String[] args) {
    

    List<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i<1000000; i++){
      arrayList.add(i);
    }

    long start = System.currentTimeMillis();
    System.out.println(start);

    for (int i = 0; i<1000000; i++){
      arrayList.remove(0);
    }

    // for (int i = 0; i < 1000000; i++){

    // }



    long stop = System.currentTimeMillis();
    System.out.println(stop);

    long alTime = stop - start;

    System.out.println("Execution Time = " + (alTime));

    

    List<Integer> linkedList = new LinkedList<>();
    for (int i = 0; i<1000000; i++){
      linkedList.add(i);
    }

    start = System.currentTimeMillis();
    System.out.println(start);

    for (int i = 0; i<1000000; i++){
      linkedList.remove(0);
    }

    // for (int i = 0; i < 1000000; i++){

    // }



    stop = System.currentTimeMillis();
    System.out.println(stop);

    long llTime = stop - start;

    System.out.println("Execution Time = " + (llTime));

    System.out.println("Ratio: " + alTime/llTime);







  }
}
