import java.util.List;

public class Demo{
  public static void main(String[] args) {
    // "s" is an object reference
    // "String" is reference type
    // "hello" is a string object

    String s = "hello";

    //var
    // During the compile time -> "var" -> "String"
    var s2 = "hello"; //
    //s2 = 10; // We cannot re-assign the int value to s2, because s2 is in String type during compile time

    List<String> strings = List.of("abc","def");
    for (String string : args) {
      System.out.println(string.charAt(1));
      
    }

  }

  public static int add(int x, int y){
    return x + y;
  }

  public static double add(double x, double y){
    return x + y;
  }
}