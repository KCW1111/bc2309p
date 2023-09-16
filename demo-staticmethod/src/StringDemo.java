public class StringDemo {

  // Key points:
  // 1. Method Signature: method name + (optinal)parameter(s)
  // 2. Method Signature can be duplicated in a class
  // 3. Method Return Type (Class or primitive or Array...)
  // Within Method Code Block: you should always return a value for all scenario
  // The type of return value should match the return type of the method
  // void -> make sure understand why we need "void" in method return type

  public static void printString(String str){
    System.out.println("str = " + str);
  }

  public static String print(String str){
    return "Hello " + str;
  }

  public static int print2(String str){
    return str.length();
  }

  public static String print(String str1, String str2){
    if (!str1.equals(str2)){
      return str1 + str2;
    }
    return str2; // no need to use else, lesser code, and clean code practice - "early return"
  }
  public static void main(String[] args){
    System.out.println(StringDemo.print("John"));
    StringDemo.printString("abcde");
  }
}
