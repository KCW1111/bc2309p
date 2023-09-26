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

    // Integer: valueOf vs new
    Integer i5 = 5;
    Integer i6 = new Integer(5); //diff, as Java always new, so, no need to new
    Integer i7 = Integer.valueOf(5); //diff
    Integer i8 = Integer.valueOf(5); // i8 will resue the object of i7

    Long l1 = 3L; // auto box
    Long l2 = Long.valueOf(3); // upcast, int-> long -> Long

    Short s1 = Short.valueOf("3");
    Short s2 = Short.valueOf((short)3);

    double d1 = Double.valueOf(3.4f); // float -> double -> Double
    float f1 = Float.valueOf((float)3.5d);




  }
}
