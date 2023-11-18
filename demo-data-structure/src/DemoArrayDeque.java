import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoArrayDeque {
  public static void main(String[] args) {
    Queue<String> queue = new ArrayDeque<>();

    for (int i = 0; i<1000000; i++){
      queue.add("test");
    }

    long start = System.currentTimeMillis();
    //System.out.println(start);

    for (int i = 0; i<1000000; i++){
      queue.poll();
    }
    long stop = System.currentTimeMillis();

    System.out.println("Time taken: " + (stop - start) + "ms");



    // Deque<String> deque = new ArrayDeque<>();

    // for (int i = 0; i<1000000; i++){
    //   deque.add("test");
    // }

    // start = System.currentTimeMillis();
    // //System.out.println(start);

    // for (int i = 0; i<1000000; i++){
    //   deque.poll();
    // }
    // stop = System.currentTimeMillis();

    // System.out.println("Time taken: " + (stop - start) + "ms");

    // arrayDeque.poll()
    Queue<String> linkedListQueue = new LinkedList<>();
    //.....

    Queue<String> arrayDeque = new ArrayDeque<>();

    // Deque / Queue.. object reference

    Deque<String> deque = (Deque) arrayDeque;
    // 1. No new object.
    // 2. Two object references (Deque & Queue) to the ame object (new ArrayDeque)
    // 3. During Run-Time, JVM will check if the object fulfill the object reference's type
    // Potentially, there could be runtime error

    // Typincal type-safety checking, that's why there is no type-safety warning
    if (arrayDeque instanceof Deque<?>){
      deque = (Deque<String>) arrayDeque;
    }

    Deque<Integer> dequeIntegers = new LinkedList<>();
    Queue<Integer> queueIntegers = dequeIntegers;
    // Because Deque (dequeIntegers) is a child of Queue, compiler ensure queueIntegers can hold the object


    // Deque<String> deque = new ArrayDeque<>();

  }
}
