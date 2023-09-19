import java.util.Arrays;

public class TestString2 {
  public static void main(String[] args) {
    int spaceIndex = -1;
    int j = -1;
    String temp = "";
    String str = "hello world"; // [hello], [world]
    String[] strs = new String[100];
    for (int i = 0; i < str.length(); i++){
      System.out.println(str.length());
      if (str.charAt(i) == ' '){
        strs[++j] = temp;
        temp = "";
        continue;
      }
      temp += str.charAt(i);
    }


    // split()
    String[] results = str.split(" ");
    System.out.println(Arrays.toString(results));

    //replace()
    System.out.println(str.replace(" ", "_"));

    String str1 = "String";
    String str2 = "String2";
    String output = compute(str1, str2);
    System.out.println(output);

    



  }


  public static String compute(String str1, String str2){
      //if str1's length is longer than str2's length, return str1 + str2, otherwise, str2
      if (str1.length() > str2.length())
        return str1 + str2; // can use str1.concat(str2)
      return str2;
    }
}
