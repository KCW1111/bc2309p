public class DemoCheckedException {
    public static void main(String[] args) {//throws Exception {
        //System.out.println("Hello, World!");

        // Unchecked Exceptions:
        // 1. ArithmeticException (divded by zero)
        // 2. NullPointerException


        // Checked Exceptions:
        int result = 0;
        try {
          sum(2,4);
        } catch (Exception e) {
          e.printStackTrace(); //or directly handle the exception
          result = -1;
        }

        try{
        String s = null;
        System.out.println(s.length()); //0
        }catch(NullPointerException e){
          
        }
    }

       



public static int sum(int x1, int x2) throws Exception{
  if (x1>=0 && x2 >=0)
    return x1 + x2;
  throw new Exception(); //it forces the class users to aware of the exception highlighted by the class/method creator, and use try-catch to handle the exception, before complie!
}

}
