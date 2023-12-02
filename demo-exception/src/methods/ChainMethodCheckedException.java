package methods;

public class ChainMethodCheckedException {
  
  // main -> A -> B -> C
  // C thorw checked exception
  // A&B do not handle it
  // main handle it by try catch
  
  public static int methodA(int x){
    return methodB(x + 3);
  }

  public static int methodB(int x){
    return methodC(x-2, x-3) + 2;
  }

  public static int methodC(int x, int y){
    return (x + 1)/y; // java.lang.ArithmeticException
  }

  public static void main(String[] args) {
    try{
      System.out.println(methodA(0));
    }catch(ArithmeticException e){
      System.out.println("Exception");
    }
    
  }
}
