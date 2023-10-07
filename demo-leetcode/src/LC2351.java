public class LC2351 {

  static char repeatedCharacter(String s) {
    //char[] charArray = new char[s.length()];
 
        // for (int i = 0; i < s.length(); i++) {
        //     charArray[i] = s.charAt(i);
        // }
        char result = '?';
        //int target = -1;
        int[] chars = new int[26]; //index 0-25
        for (int i=0; i< s.length(); i++){
          chars[s.charAt(i)-'a']++; // important technique, i.e. 'z' - 'a' ->25 (in ascii), a=97
          if (chars[s.charAt(i)-'a'] == 2){
            result = s.charAt(i);
            break;
          }
        }
        return result;



        
    }


  public static void main(String[] args) {

    String test1 = "abccbaacz"; // answer: c
    System.out.println(repeatedCharacter(test1));
    String test2 = "abcdd"; // answer: d
    System.out.println(repeatedCharacter(test2));
    
  }
}
