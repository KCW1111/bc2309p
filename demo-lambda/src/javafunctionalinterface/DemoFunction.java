package javafunctionalinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoFunction {

  public static void main(String[] args) {

  //R apply (T t)
  Function<Integer, String> convertFunction = x ->{
    return String.valueOf(x);
  };


  System.out.println(convertFunction.apply(10));

  BiFunction<String, String, String> concatFunction = (x,y) ->{
    return x + y;
    //return x.concat(y);
  };

  System.out.println(concatFunction.apply("Hello", "World"));

  //Some situation lambda has to be used, that is the parameter no longer is just a value, but a formula/function

  Map<String, Integer> nameLengthMap = new HashMap<>();
  nameLengthMap.put("John", 10);
  nameLengthMap.put("Mary", 20);

  
  System.out.println(nameLengthMap.get("Tommy")); // null

  // put("Tommy"),length
  System.out.println(nameLengthMap.computeIfAbsent("Tommy",k-> k.length())); //5

  System.out.println(nameLengthMap.size());//3, the new entry is put in the map

  System.out.println(nameLengthMap.get("Mary"));
  System.out.println(nameLengthMap.computeIfAbsent("Mary", s->s.length()));

  System.out.println(nameLengthMap.size());

  System.out.println(nameLengthMap.merge("John", 4, (t,u)->{
    return t * u;
  }));
  

  //nameLengthMap.put("Jenny", null);
  System.out.println(nameLengthMap.merge("Jenny", 7, (t,u)->{
    return t * u;
  }));

  System.out.println(nameLengthMap.get("Jenny"));






  }
}
