//package com.basic.demo;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.basic.demo.Calculators;
import com.basic.demo.Staff;

// file name has to be XXXXTest.java or XXXXTests.java
// Otherwise, mvn cannot locate the test files.
@DisplayName("Calculator Test Plan")
public class CalculatorsTests {

  @Test
  @DisplayName("Display the name to test")
  public void testAdd(){
    assertEquals( 7, Calculators.add(3,4));
    assertEquals( -11, Calculators.add(-1,-10));
  }

  @Test
  public void testSort(){
    assertEquals(new ArrayList<>(List.of(1,2,3)),Calculators.sort(new int[] {2,3,1}));
    assertEquals(new ArrayList<>(List.of(-1,1,3)),Calculators.sort(new int[] {-1,3,1}));
    //assertEquals(new ArrayList<>(List.of(-3,-2,-1)),Calculators.sort(new int[] {0}));

    assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});

    //assertEquals(new int[] {1,2,3}, new int[] {1,2,3});  //This statement comparing objects, they are not the same

    

  }

  

  @Test
  public void testBoolean(){
    assertTrue(5>3);
    assertTrue(4<5);

    Staff staff9 = new Staff("Ken", 660);
    assertTrue(staff9.isAdult());
    Staff staff10 = new Staff("Mary", 65);
    assertTrue(staff10.isAdult());
  }

  @Test
  public void testSampleObject(){

    String s = "hello";
    String s2 = "hello";
    assertSame(s, s2);

    String s3 = new String("hello");
    //assertSame(s2, s3); // They are not the same, as s and s2 are from the same literal pool but s3 is a new object
  }


  @Test
  public void testThrow(){
    assertThrows(NullPointerException.class, ()->{
      String nullString = null;
      nullString.length();
    }); // As able to handle the exception, test case passes

    assertDoesNotThrow(()->{
      System.out.println("hello");
    });

    assertTimeout(Duration.ofMillis(2000), ()->{
      Thread.sleep(1500);
    });
  } 


  @Test
  public void testA(){
    assertTrue(10>5);
  }

  @Test
  public void testB(){
    assertEquals(5, "Hello".length());
  }

  @Test
  public void combineTestAAndTestB(){
    assertAll(
      ()-> assertTrue(10>5),
      () -> assertEquals(5, "Hello".length())
      );

    // All assertion in assertAll must be pass.
    // assertAll(
    //   ()-> assertTrue(10>5),
    //   () -> assertEquals(5, "Hellos".length())
    //   );

  }

  
  
}
