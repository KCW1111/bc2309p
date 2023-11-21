import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DemoStack {
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    queue.add("ABC");
    queue.add("IJK");
    queue.add("LMN");
    System.out.println(queue.remove());

    Stack<String> stack = new Stack<>();
    stack.push("Hello");
    stack.push("World");
    stack.push("!!!");

    System.out.println(stack.pop()); // !!!

    stack.add("Test");
    System.out.println(stack.pop()); // Test

    String[] arr = {"123", "456", "789"};

    // loop -> insert data into stack
    // loop -> get the data from stack, place into another array
    
    String[] result = new String[arr.length];

    Stack<String> stack2 = new Stack<>();

    for (String string : arr) {
      stack2.push(string);
    }

    String[] result2 = new String[stack2.size()];

    // int counter = 0;
    // for (String string : stack2) {
    //   result2[counter] = string;
    //   counter++;
    // }

    int idx = 0;
    while(!stack2.isEmpty()){
      result2[idx++] = stack2.pop();
    }

    System.out.println(Arrays.toString(result2));









  }
}
