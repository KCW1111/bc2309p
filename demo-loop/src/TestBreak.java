public class TestBreak{
  public static void main(String[] args){

    //Step 1: i = 0;
    //Step 2: check if i < 10;
    //Step 3: check if i > 3;
    //Step 4: i++
    //Step 5: Check if i < 10
    //Step 6: Check if i > 3
    //Step 7: i++ -> i = 2
    //Step 8: Check if i < 10
    //Step 9: Check if i > 3
    //Step 10: i++ .> i = 3
    //Step 11: Check if i < 10
    //Step 12: Check if i > 2 -> true -> break the loop
    for (int i=0;i<10;i++){
      System.out.println(i);
      if (i>2){
        break;
      }

    }
  }
}