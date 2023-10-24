package box;

public class StringBox {
  private char[] arr;
  private int length;

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public StringBox(String s){
    arr = new char[s.length()];
    for (int i=0; i<s.length(); i++){
      arr[i] = s.charAt(i);
      System.out.println(arr[i]);
    }
  }

  public int length(){
    return this.getLength();
  }

  public char charAt(int num){
    return this.charAt(num);
  }


  public static void main(String[] args) {
    StringBox stringBox = new StringBox("sample");
    System.out.println(stringBox.length()); // 6
    //System.out.println(stringBox.charAt(2)); // m
  }
}
