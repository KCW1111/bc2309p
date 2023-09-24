public class Calculator {
  private int x;
  private int y;
  private  int z;

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

  public int bmi(){
    return this.x + this.y + this.z;
  }

  public int subtract(){ 
    // Calculator c = new Calculator; 
    // c.setX(100);
    // c.setY(90);
    // c.substract() -> 10
    // Calculator c2 = new Calculator;
    // c2.setX(12);
    // c2.setY(10);
    // c2.substract() -> 2
    return this.x - this.y;
  }

  // For static method, usually we have parameters(s). Also static method is not for object to call. 
  public static int subtract (int x, int y){
    return x - y;
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

    calculator.setX(100);
    calculator.x = 100;

  }
}
