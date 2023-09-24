import java.util.Arrays;

public class LC1859 {

  public static String sortSentence(String s){
    // split()
    String[] strings = s.split(" ");
    String temp = "";
    for (int j =0; j<strings.length-1; j++){
      for (int i=0; i<strings.length-1; i++){
        if (strings[i].charAt(strings[i].length()-1) > strings[i+1].charAt(strings[i+1].length()-1)){

          temp = strings[i+1];
          strings[i+1] = strings[i];
          strings[i] = temp;
        }
      }
    }

    String results = Arrays.toString(strings);
    return results;
    
}

public static void main(String[] args) {
  System.out.println(sortSentence("Oh5 test4 is2 a3 This1"));
}
}
