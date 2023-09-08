public class TestString2 {
  public static void main(String[] args){
    String str1 = "abcd";
    String str2 = "xcyz";
    System.out.println("Check if 2 strings have common characters.");
    for (int i = 0; i < str1.length(); i++){
      for (int j = 0; j<str2.length(); j++){
        if (str1.charAt(i) == str2.charAt(j)){
          System.out.println("They have common characters.");
        }else{
          System.out.println("They have no common characters.");
        }
      }
    }


    System.out.println("Demo");
    boolean common = false;
    outerLoop: for (int i = 0; i < str1.length(); i++){
      for (int j = 0; j < str2.length(); j++){
        if (str1.charAt(i) == str2.charAt(j)){
          common = true;
          break outerLoop; //'break', break inner loop only, but 'break outerLoop' break at the labelled loop
        }
      }
    }
    System.out.println(common);
  }
  
}
