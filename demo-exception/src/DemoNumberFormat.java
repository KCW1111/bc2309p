public class DemoNumberFormat {
  
  public static void main(String[] args) {
    int num = parseInt("1s");
    System.out.println("num = " + num);
  }

  public static int parseInt(String s){
    return Integer.parseInt(s);
  }
}
