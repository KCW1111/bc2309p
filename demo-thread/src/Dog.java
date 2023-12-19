public class Dog {
  private String name;
  private static int age;

  public Dog(String name){
    this.name = name;
  }

  // public void setAge(int age) {
  //   this.age = age;
  // }

  public synchronized void setName(String s) {
    this.name = this.name.concat(s);
  }

  public static synchronized void addAge(){
    //code....
    Dog.age++;
  }

  public static void main(String[] args) throws InterruptedException {
    long starttime = System.nanoTime();
    Runnable task = () -> {
      for (int i = 0; i< 10000; i++){
        addAge();
      }
      
    };

    Thread t1 = new Thread(task);
    Thread t2 = new Thread(task);

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println(Dog.age);
    long endtime = System.nanoTime();
    System.out.println(endtime - starttime);
    //System.out.println(endtime);

  }
}
