public class LC2810 {
  public static String finalString(String s) {

    //demo, can use StringBuilder and sb.reverse();
    
    char [] charArr = new char[s.length()];
    int pos = -1;

    for (int i =0; i<s.length(); i++){
      if (s.charAt(i)=='i'){
        pos = i;
        char [] charArrReverse = new char[i];
        for (int j=0; j<i; j++){
          charArrReverse[j] = s.charAt(--pos);
          System.out.println(charArrReverse[j]);
        }
        //combine with the rest character and do it all over again
        
      }
      //charArr[i] = s.charAt(i);
      //System.out.println(charArr[i]);
    }

    return null;
        
  }

  public static void main(String[] args) {
    finalString("coming");
  }
}
