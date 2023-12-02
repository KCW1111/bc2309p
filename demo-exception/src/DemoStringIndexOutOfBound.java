public class DemoStringIndexOutOfBound {
  public static void main(String[] args) {
    System.out.println(chartAt("hello"));
  }
  // throws exception

  public static char chartAt(String s){
    return s.charAt(s.length());
  }
}
