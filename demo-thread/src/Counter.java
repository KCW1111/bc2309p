public class Counter {

  public static int counter = 0; // class variable

  public static void main(String[] args) {
    // as runnable is functional interface, so it is okay to be written in Lambda
    Thread t1 = new Thread(()->counter++); // counter++
    t1.start();
    Thread t2 = new Thread(()->counter++); // counter++
    t2.start();
    
    System.out.println("counter = " + counter);
    System.out.println("main() ends");



  }
}
