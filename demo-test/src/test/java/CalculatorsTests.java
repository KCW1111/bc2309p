//package com.basic.demo;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.basic.demo.Calculators;

// file name has to be XXXXTest.java or XXXXTests.java
// Otherwise, mvn cannot locate the test files.
public class CalculatorsTests {

  @Test
  public void testAdd(){
    Assertions.assertEquals( 7, Calculators.add(3,4));
    Assertions.assertEquals( -11, Calculators.add(-1,-10));
  }

  @Test
  public void testSort(){
    Assertions.assertEquals(new ArrayList<>(List.of(1,2,3)),Calculators.sort(new int[] {2,3,1}));
    Assertions.assertEquals(new ArrayList<>(List.of(-1,1,3)),Calculators.sort(new int[] {-1,3,1}));
    Assertions.assertEquals(new ArrayList<>(List.of(-3,-2,-1)),Calculators.sort(new int[] {-2,-3,-1}));
  }
  
}
