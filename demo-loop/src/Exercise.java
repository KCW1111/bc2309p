public class Exercise{
  public static void main(String[] args){
    // sum of 1,2,3,...,10
    int sum = 0;
    for (int i=0; i<11; i++){
      sum = sum + 5; // or sum += i , when i start with 1
      System.out.println("sum now is: " +sum);
    }

    //sum of 2,4,6,8,10
    int sum2 = 0;
    for (int i = 1; i <6 ; i++){
      sum2 += i*2;
      System.out.println("sum now is: " +sum2);
    }

    // sum of 1-1000, 
    //from 1-299, add even numbers
    // from 300-699, add all odd numbers
    // from 700-1000, add all numbers can be divided by 3

    int sum3 = 0;
    for (int i=1; i<1001; i++){
      if (i<300){
        if (i%2==0){
          sum3 += i;
        }
      }else if(i>=300 && i<700){
        if(i%2 ==1){
          sum3 +=i;
        }
      }else{
        if(i%3 ==0){
          sum3 +=i;
        }
      }
      System.out.println("sum now is: "+ sum3);
    }

    
  }
}