package box;

public class StringBox {
  private char[] arr;
  //private int length;

  // Constructor, do not use "new" to generate new object, to encapsulate constructor
  public static StringBox valueOf(String s){
    return new StringBox(s);
  }

  public StringBox(String s){
    arr = new char[s.length()];
    for (int i=0; i<s.length(); i++){
      arr[i] = s.charAt(i);
      //System.out.println(arr[i]);
    }
  }

  @Override
  public String toString(){
    return String.valueOf(this.arr); // change type
  }

  public StringBox append(String s){
    // array size
    // new a new char array
    // put the old and new stuff to a new array

    char[] newArr = new char[this.arr.length + s.length()];
    //int length = this.arr.length + s.length();
    //arr = new char[length];
    int pos = 0;
    for (int i=0; i<this.arr.length; i++){
      newArr[i] = this.arr[i];
      pos = i;
    }
    for (int i=0; i<s.length(); i++){
      newArr[++pos] = s.charAt(i);
      
    }
    // this.arr (object reference -> char[] "sample")
    // newArr (object reference -> char[] "samplesample")
    this.arr = newArr;
    return this;
  }

  public StringBox substring(int fromIndex, int toIndex){
    StringBuilder str = new StringBuilder("");
    for (int i = fromIndex; i < toIndex; i++){
      str.append(this.arr[i]);
    }

    return new StringBox(str.toString()); // dont want to change the original StringBox, this original one is with "sample"
  }

  public int length(){
    return this.arr.length;
  }

  public char charAt(int index){
    return this.arr[index];
  }


  public static void main(String[] args) {
    StringBox stringBox = new StringBox("sample");
    System.out.println(stringBox.length()); // 6
    System.out.println(stringBox.charAt(2)); // m

    System.out.println(stringBox.substring(1,3).toString());//am

    System.out.println(stringBox.append("append"));

    StringBox stringBox2 = StringBox.valueOf("hello world");
    StringBox stringBox3 = stringBox2.substring(2, 4);
    stringBox3.append("!!!!");


    System.out.println(StringBox.valueOf("hello world").substring(2, 4).append("!!!!").toString());
  }
}
