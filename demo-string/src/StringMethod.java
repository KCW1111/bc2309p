public class StringMethod {
  public static void main(String[] args) {
    String s1 = "hello world";
    System.out.println(s1.substring(1, 7));
    System.out.println(s1.substring(2));

    String s2 = "";
    String s3 = " ";
    String s4 = "hello";
    if (!s2.isBlank())
      System.out.println("s2 is not blank");
    if (!s3.isBlank())
      System.out.println("s3 is not blank");
    if (!s4.isBlank())
      System.out.println("s4 is not blank");

    String[] strings = new String[]{"Hello","HELLO","hello", " hello ","world"," hello! "};
    // a for loop to find, how many "hello" here? ignore case and ignore space
    int counter = 0;
    for (int i = 0; i<strings.length-1; i++){
      if (strings[i].trim().equals("hello"))
        counter++;
    }
    System.out.println("The total number of 'hello' is: " + counter);

    //Demo
    int count = 0;
    for (String s: strings){
      if(s.trim().toLowerCase().equals("hello"))
        count++;
    }
    System.out.println("count=" + count);
  }
}
