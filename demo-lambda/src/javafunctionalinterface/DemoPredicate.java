package javafunctionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DemoPredicate {
  public static void main(String[] args) {
    // Predicate is a boolean formula
    // Function<Integer, Boolean> -> Predicate<Integer>
    Predicate<Integer> isOdd = x -> x % 2 != 0;
    System.out.println(isOdd.test(9));
    System.out.println(isOdd.test(8));

    Predicate<Integer> isPositive = x -> x > 0;
    System.out.println(isPositive.test(1));

    //Combine 2 predicate together, 2 Predicate<T>
    System.out.println(isOdd.and(isPositive).test(-8));
    System.out.println(isOdd.or(isPositive).test(-7));

    BiPredicate<Integer,Integer> isLargerThan = (x,y) -> x>y;
    System.out.println(isLargerThan.test(10,9));
  }
}
