public class DemoNullPointer {
  public static void main(String[] args) {
    String s = null;
    charAt(s);
  }

  public static void charAt(String s){
    s.charAt(s.length() -1);
    // error
    //You should fix the program directly
    //Instead of using try catch to handle various scenarios
  }
}
