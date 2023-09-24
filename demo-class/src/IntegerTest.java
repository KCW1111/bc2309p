public class IntegerTest {
  public static void main(String[] args) {
    Integer i1 = 127; // auto-box
    System.out.println(i1.equals(127)); //if you want compare the value of i1
    System.out.println(i1 == 127); // true

    Integer i2 = 128;
    System.out.println(i2 ==128); // true

    Integer i3 = 127;
    System.out.println(i1 == i3);

    Integer i4 = 128;
    System.out.println(i2 == i4);

    // Internal Cache (Byte, Short, Integer, Long), -128 to 127 (from some frequently used values, they will be cached)
    // If the value is out of range, new object will be used

    String str1 = "hello";
    System.out.println(str1 == "hello");// true, checking if they are the same object
  }
}
