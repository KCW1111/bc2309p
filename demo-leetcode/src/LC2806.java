public class LC2806 {

  public static int roundedAmount(int purchaseAmount) {


    for (int i=10; i>0; i--){
      int results = Math.abs(i*10 - purchaseAmount);
      if (results<10){
        int results2 = Math.abs((i-1)*10 - purchaseAmount);
        if (results > results2){
          return (i-1)*10;
        }else{
          return i*10;
        }

      }
    }
    return purchaseAmount;
  }

  public static void main(String[] args) {
    int output = 100 - roundedAmount(23);
    System.out.println(output);
  }



}
