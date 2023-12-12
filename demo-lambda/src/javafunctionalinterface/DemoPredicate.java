package javafunctionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
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


    // Approach 1
    int x = 100;
    boolean isOverSomething = x > 20;

    // Approach 2, by interface and direct output an object, skipped 2 steps
    Predicate<Integer> overSomethingFormula = num -> num > 20; // new an objec there (an object reference)
    System.out.println(overSomethingFormula.test(x));


    //BiFunction<Input,Input,Output>
    BiFunction<Integer,Integer,String> convertFunction = (a,b) -> {
      return String.valueOf(a).concat(String.valueOf(b));
    };
    System.out.println(convertFunction.apply(3, 4));

    //Consumer
    //Consumer<things to be consumed> variable = ....
    Consumer<List<Student>> printAllStudents = students -> {
      for (Student string : students) {
        System.out.println(students.getClass());
      }
    };

    Student std1 = new Student(123, "ABC");
    Student std2 = new Student(124, "BCD");
    
    printAllStudents.accept(List.of(std1,std2));

  }

  // Approach 3, by static function
  public static boolean test(int x){
    return x>20;
  }

  // Function
  public static String convert(int x, int y){
    return String.valueOf(x).concat(String.valueOf(y));
  }
}
