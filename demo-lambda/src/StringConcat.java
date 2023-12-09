public class StringConcat {
  public static void main(String[] args) {
    Concat concat1 = (x,y)-> x + " and " + y;

    //another approach: //for more than 1 line of code, we use code block
    //Concat concat2 = (x,y)->{
      //......
      //return
    //}
    System.out.println(concat1);

    //execution
    System.out.println(concat1.concat("this is x", "this is y"));
  }
}
