import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleTest {
  public static void main(String[] args) {
    double d1 = 0.1;
    double d2 = 0.2;
    System.out.println(d1 + d2);
    System.out.println(0.3 - 0.1);

    float f1 = 0.1f;
    float f2 = 0.2f;
    System.out.println(f1 + f2);
    System.out.println(0.2f - 0.1f);

    BigDecimal bd = new BigDecimal(0.3); // the form of storage doesn't matter, it just stores 0.3, that is all, bd is object reference
    BigDecimal bd2 = new BigDecimal(0.1);
    BigDecimal bd3 = BigDecimal.valueOf(0.3);
    BigDecimal bd4 = BigDecimal.valueOf(0.1);
    BigDecimal result = bd.subtract(bd2);
    BigDecimal result2 = bd3.subtract(bd4);
    System.out.println(result);
    System.out.println(result2);

    System.out.println(bd3.add(result2));

    // new or valueof()
    BigDecimal bd5 = BigDecimal.valueOf(10.4567).setScale(2, RoundingMode.UP);
    System.out.println(bd5);
    BigDecimal bd6 = BigDecimal.valueOf(10.4567).setScale(2, RoundingMode.DOWN);
    System.out.println(bd6);

    System.out.print(bd5+"\n");
    System.out.println(bd6);



  }
}
