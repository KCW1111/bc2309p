package com.basic.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Calculators {
  public static int add(int x, int y){
    // we need to define the method signature before defining the test cases
    return x+y;
  }

  public static List<Integer> sort(int[] arr){
    // arr -> list
    // list -> sort?
    List<Integer> result = Arrays.stream(arr).boxed().collect(Collectors.toList());
    Collections.sort(result);
    return result;
    
  }
  
  
}
