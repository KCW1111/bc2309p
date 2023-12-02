public class DemoArrayIndexOutOfBound {
  public static void main(String[] args) {

    arrayIndexOutOfBound(new int[10]);
    
  }

  public static void arrayIndexOutOfBound(int[] arr){
    arr[arr.length] = 1; // error
    //You should fix the program directly
    //Instead of using try catch to handle various scenarios
  }
}
