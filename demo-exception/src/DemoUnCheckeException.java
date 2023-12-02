public class DemoUnCheckeException {
  public static void main(String[] args) {
    
    int result = 0;
    
    // Example 1:
    System.out.println(divide(9,3)); // 3
    System.out.println(divide(9,0)); // java.lang.ArithmeticException

    try{
      // Since divide3 would throw a check excpetion,
      // so the method caller has to handle the method call by try catch
      result = divide3(9,3);
    }catch(BusinessException e){
      result = -1;
    }

    // Example 2:
    arrayIndexOutOfBound(new int[10]);




  }


  public static int divide(int x, int y){
    int result = x/y;
    return result;
  }

  public static int divide2(int x, int y){
    int result;
    try{
      result = x/y;
    }catch(ArithmeticException e){ // Not a must to catch ArithmeticException
      result = 0;

    }
    return result;
  }

  // The method signature need to "throws exception" if the logic threw checked exception
  public static int divide3(int x, int y) throws BusinessException{
    int result;
    try{
      result = x/y;
    }catch (ArithmeticException e){ // Convert uncheck exception to checked exception
      throw new BusinessException();
    }
    return result;
  }


  public static void arrayIndexOutOfBound(int[] arr){
    arr[arr.length] = 1;
  }
}
