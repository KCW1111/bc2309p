public class Calculator {
  int x;
  int y;

  public void setX(int x){
    this.x = x;
  }

  public int getX(){
    return this.x;
  }

  public void setY(int x){
    this.x = x;
  }

  public int getY(){
    return this.x;
  }

  public int add(){
    return this.x + this.y;
  }

  public static int add(int x, int y){
    return x + y;
  }

  public char grade(){
    if (this.x > 150){
      return 'A';
    }
    return 'F';
  }


  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.setX(100);
    calculator.setY(300);
    System.out.println(calculator.add());
    System.out.println(calculator.grade());

  }
}
