public class Operator{
  public static void main(String[] args){
    // + - * /
    // ++
    // -- 
    int i = 0;
    i = i - 1; // -1
    i -= 1; // -2

    // ++,-- precedence
    int x = 0;
    int result = x++;
    System.out.println("result=" + result); //0
    System.out.println("x=" + x); // x=1
    //**  Becareful with the situation with precedence and assignment are together
    
    int y = 0;
    int result2 = ++y;
    System.out.println("result2=" + result2);
    System.out.println("y=" + y);

    // %, the remainder of 5/2
    int r = 5 % 2; // 1
    System.out.println(r);

    int w = 10 % 6 + 4 * 8;
    System.out.println(w); // 36

    // && - And
    boolean b = true && true; // true
    boolean b2 = true && false; // false
    boolean b3 = false && true; // false
    boolean b4 = false && false; // false

    //  || - Or
    boolean b5 = true || true; // true
    boolean b6 = true || false; // true
    boolean b7 = false || true; // true
    boolean b8 = false || false; // false

    boolean combine = true || false && true; // true

    // ! -> Not
    boolean b9 = !false; // true
    int h = (1+2) * 10; //30
    boolean b10 = !(true && false); // true

    // int h2 = [10-(1+2)] * 4;
    int h2 = (10 - (1+2)) * 4;
    System.out.println(h2);

    // >, <, >=, <=
    boolean g = 5 > 3; // true
    boolean g2 = 5 >= 6; // false
    boolean g3 = -1 > 1; // true
    boolean g4 = -2 <= -3; // false

    boolean combine2 = (4+3) > 5 || (10*2) %3 == 2; // true
    boolean combine3 = !(5%2 ==1) && 10*3 !=20; // false

    // *=, /=, %=
    int a = 2;
    a *= 3; // a = a * 3;
    System.out.println(a); // 6
    int f = 3;
    f /=1 ; // f = f /1;
    System.out.println(f); // 3
    int e = 10;
    e %= 3;
    System.out.println(e); // 1







  }
}