public class LC1160 {

  public static int countCharacters(String[] words, String character) {
    
    int total = 0;
    for (int i =0; i< words.length; i++){
      System.out.println(words[i]);
      int length = 0;
      String chars = character;
      for (int j=0; j<words[i].length(); j++){
        if (chars.contains(String.valueOf(words[i].charAt(j)))){
          chars = replace(chars,words[i].charAt(j));
          length++;
        }

      if (words[i].length() == length)
        total += length;
      }
    }
    return total;

    }

    public static String replace(String chars, char c){
      for (int i=0; i<chars.length(); i++) {
        if (chars.charAt(i) == c){
          char[] charArrayTemp = chars.toCharArray();
          charArrayTemp[i] = '@';
          chars = String.valueOf(charArrayTemp);
          return chars;
        }

      }
      return chars;

    }

    public static void main(String[] args) {

      //words = ["hello","world","leetcode"], chars = "welldonehoneyr"
      String [] words = {"hello","world","leetcode"};
      String chars = "welldonehoneyr";
      System.out.println(LC1160.countCharacters(words, chars));
    }
}


// Example 1:

// Input: words = ["cat","bt","hat","tree"], chars = "atach"
// Output: 6
// Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
// Example 2:

// Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
// Output: 10
// Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
