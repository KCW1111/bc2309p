public class TestNestedLoop {
  public static void main(String[] args){
    for (int i = 0; i < 5; i++){
      for (int j = 0; j < 5; j++){
        System.out.println(i);
      }
    }

    // i between 1-10, j between 11-20, print i and j when are both even numbers
    System.out.println("When i between 1-10, j between 11-20, print i and j when are even numbers");
    System.out.println("One more condition: j<10");
    for (int i =1; i<=10; i++){
      if (i%2 ==0){
        for (int j = 11; j<=20; j++){
          if (j%2 == 0 && j<15){
            System.out.println("i=" + i + " , j=" + j);
          }
        }
      }
    }

    //Approach 2a:
    System.out.println("Approach 2a, use break to stop unnecessary looping.");
    for (int i =1; i<=10; i++){
      for (int j = 11; j<=20; j++){
        if (j >= 15){
          break; // break thhe inner loop
        }
        if (i%2 == 0 && j %2 == 0){
          System.out.println("i=" + i + ", j=" +j);
        }
      }
    }

    //Approach 2b:
    System.out.println("Approach 2b, condition sequence, the most strict condition put in the front");
    for (int i =1; i<=10; i++){
      for (int j = 11; j<=20; j++){
        if (j < 15 && i%2 == 0 && j %2 == 0){
          System.out.println("i=" + i + ", j=" +j);
        }
      }
    }





  }
}
