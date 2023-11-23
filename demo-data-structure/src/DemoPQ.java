import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPQ {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(new SortByIntegerDesc());
    pq.add(40);
    pq.add(20);
    pq.add(15);
    pq.add(150);

    while (!pq.isEmpty()) {
      System.out.println(pq.poll());
    }



    Queue<String> pq1 = new PriorityQueue<>();
    // pq2.add("test");
    pq1.add("Ada");
    pq1.add("Bob");
    pq1.add("John");
    pq1.add("Dave");

    while (!pq1.isEmpty()) {
      System.out.println(pq1.poll());
    }


    Queue<String> pq2 = new PriorityQueue<>(new SortByStringDesc());
    // pq2.add("test");
    pq2.add("Ada");
    pq2.add("Bob");
    pq2.add("John");
    pq2.add("Dave");

    while (!pq2.isEmpty()) {
      System.out.println(pq2.poll());
    }

  }
}
