import java.util.Arrays;
import java.io.*;

public class DemoArray2 {
  public static void main(String[] args) {
    //
    //int[] arr = new int[]{10,4,2,100,-3};
    int[] arr = new int[]{1,2,3,4,5};
    System.out.println(arr.length);

    long starttime = System.nanoTime();
    boolean swapped = false;
    for (int i=0; i<arr.length-1; i++){
      for (int j=0; j<arr.length-i-1; j++){
        if (arr[j]>arr[j+1]){
          int temp=0;
          temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
          swapped = true;
        }
      }
      if (swapped == false)
        break;
    }
    
    System.out.println(Arrays.toString(arr));
    long endtime = System.nanoTime();
    System.out.println("Time taken: " + (endtime-starttime));

    // Bubble Sort

    
    
  }
}
