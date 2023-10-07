public class LC2000 {

  public static String toString(char[] a)
    {
        // Creating object of String class
        StringBuilder sb = new StringBuilder();
 
        // Creating a string using append() method
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
        }
 
        return sb.toString();
    }

  static String reversePrefix(String word, char ch) {
      char[] charArray = new char[word.length()];
      int flipIndex = -1;
      String result = "";
 
        for (int i = 0; i < word.length(); i++) {
            charArray[i] = word.charAt(i);
            //System.out.println(charArray[i]);
        }

        for (int i = 0; i < charArray.length; i++){
          if (charArray[i] == ch){
            flipIndex = i;
            //System.out.println(flipIndex);
            break;
          }
        }

        int j = 0;
        char[] reverseCharArray = new char[flipIndex+1];
        for (int i = reverseCharArray.length-1; i>=0; i--){
          reverseCharArray[j] = word.charAt(i);
          //System.out.println(word.charAt(i));
          j++;
          }
         //System.out.println(toString(reverseCharArray)); 


        StringBuilder sb = new StringBuilder();

        for (int i=flipIndex+1; i<word.length(); i++){
          sb.append(word.charAt(i));
          //System.out.println(sb);
          result = toString(reverseCharArray) + sb;

        }


        

      return result;
        
    }
  public static void main(String[] args) {

    String word = "abcdefd";
    char ch = 'd';
    System.out.println(reversePrefix(word,ch)); // Answer: dcbaefd

    String word1 = "xyxzxe";
    char ch1 = 'z';
    System.out.println(reversePrefix(word1, ch1)); // Answer: zxyxxe
    
    
  }
}
