import java.sql.Array;

public class Square {

  public static int area(int length){
    int area = length * length;
    return area; // return a variable , which type should match the method return
  }

  public static int area2(int length){
    return length * length;
  }

  public static short area3(int length){
    return (short) (length * length); // precision loss
  }

  public static double area4(int length){ // 2 * 2 -> 4.0
    return Math.pow(length,2);
  }

  public static int max(int[] arr){
    int max = arr[0];
    for (int i=1; i<arr.length; i++){
      if (arr[i]>max){
        max = arr[i];
        //System.out.println("The max number is:  + " + temp);
      }
    }
    return max;
    //can try Math.max(arr[i],tempMax)
  }

  //Try to design 2 methods A&B.
  //You have to call method A, and the method A will reply on Method B for calculation
  public static String caller(String str1, int int1){
    String str2 = Square.listener();
    int calculation = Square.listener2(int1);
    return "Hi " + str2 + ",I am " + str1 + " .The area of a square with length " + int1 + " is: " + calculation;
  }

  public static String listener(){
    return "Peter";

  }

  public static int listener2(int number){
    int results = number * number;
    return results;
  }


  public static void main(String[] args){
    System.out.println(Square.area2(10));
    System.out.println(Square.area2(7));
    int[] arr = new int[]{1,2,3,4,5};
    System.out.println(Square.max(arr));
    System.out.println(Square.caller("John",10));
  }
}
