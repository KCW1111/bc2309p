public class Maths {
  public static void main(String[] args) {
    System.out.println(Math.min(19,7));
    System.out.println(Math.max(4,7));
    System.out.println(Math.abs(-7));
    System.out.println((int)Math.pow(2,10)); // pow returns double, but knowing that integer power will always give integer, so downcast should be ok
    System.out.println(Math.sqrt(9));// sqrt returns double, 
    System.out.println(Math.floor(9.9));
    System.out.println(Math.ceil(9.2));
    System.out.println(pow(2,3));
    System.out.println(min2(4,3));

    System.out.println(Math.round(5.5));
    System.out.println(Math.random()); // the output will be between 0(inclusive)-1(exclusive), so, if 3-digit random number is required, x1000 after the return.
  }

  public static double pow(double base, int power){
    double result = base;
    for (int i=2; i<=power; i++){
      result *= base;
    }
    return result;
  }

  

  public static int min(int a, int b){
    int result = -1;
    if (a == b)
      return a;
    if (a - b > 0)
      return b;
    return a;
  }

  public static int min2(int a, int b){
    int result = -1;
    return a > b ? b : a;
  }




}
