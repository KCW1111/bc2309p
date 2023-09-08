public class TestContinue{
  public static void main(String[] args){
    // for loop 10 times
    System.out.println("for loop 10 times");
    for (int i = 0; i<10; i++){
      if (i>=2){
        continue; // go to i++
      }
      System.out.println("i=" + i);
    }

    // print 2,3,..10, must use continue
    System.out.println("Print 2,4,6,....10, must use continue");
    for (int i = 0; i< 11; i++){ // or use i<=10
      if (i%2==1||i==0){
        continue; // It is meaningless if no lines under continue
      }
      System.out.println("i=" + i);
    }

    //CharAt, for loop. Print a, b, c and d
    System.out.println("//CharAt, for loop. Print a,b,c and d in 4 lines");
    String s = "abcd";
    for (int i = 0; i < 4; i++){ //s.length() returns 4
      System.out.println(s.charAt(i));
    }

    //What is the position of c? -> 2
    System.out.println("//What is the position of c? -> 2");
    for (int i = 0; i<s.length(); i++){
      if (s.charAt(i) == 'c'){
        System.out.println(i);
      }

    }

    System.out.println("Find the char 'x', and print the next character of x, if not found, print -1");
    String s2 = "ijkxyz";
    for (int i =0; i<s2.length(); i++){
      if (s2.charAt(i)=='x'){
        System.out.println(s2.charAt(i+1));
      }else{
        System.out.println("-1");
      }
    }

    System.out.println("Demo:");
    boolean found = false;
    char target = ' ';
    for (int i = 0; i < s2.length(); i++){
      if (s2.charAt(i) == 'x'){
        target = s2.charAt(i +1); //assign 'y' to variable target
        found = true;
        break; //if you want the program run fast, use break when the value is found, rather than let it loop
      }
      //target
      //found
    }
    if (found){
      System.out.println(target);
    }else{
      System.out.println(-1);
    }
      
  }
}