public class Task2 implements Runnable {

  @Override
    public void run() {
        for (int i = 0; i < 1; i++){
            try {
              Thread.sleep(500);
            } catch (Exception e) {
              // TODO: handle exception
            }
        }

        System.out.println("Task 2 is completed");
    }
  
}
