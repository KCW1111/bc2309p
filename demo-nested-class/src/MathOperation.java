public interface MathOperation {
  int operate(int x, int y);

  public static void main(String[] args) {
    MathOperation addition = (a,b)->{
      return a+b;
    };

    MathOperation subtraction = (a,b)->{
      return a-b;
    };

    System.out.println(addition.operate(2, 3));
    System.out.println(subtraction.operate(3, 2));
  }
}
