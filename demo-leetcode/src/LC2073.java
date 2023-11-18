import java.util.LinkedList;
import java.util.Queue;

public class LC2073 {

  public static int timeRequiredToBuy(int[] tickets, int k){
    // Declare a queue by linkedlist
    Queue<Integer> queue = new LinkedList<>();

    //Array <-> Queue, prepare the queue
    for (int i=0; i < tickets.length; i++){
      queue.add(i); // auto-box: int -> Integer
    } // 0,1,2,3,4,5

    int second = 0;
    int head = 0;

    while (!queue.isEmpty()){
      //poll
      head = queue.poll();
      second++;

      // check if outstanding ticket to buy > 0;

      if (--tickets[head]>0){
        queue.add(head);
        continue;
      }

      // <=0
      if (head == k)
        break;


    }

    return second;
  }


  public static void main(String[] args) {
    int[] newT = new int[1];
    int[] ticketQueue = new int[]{5,1,1,1,};
    System.out.println(timeRequiredToBuy(ticketQueue,0));
  }
  
}
