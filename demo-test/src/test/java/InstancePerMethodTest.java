import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


@TestInstance(TestInstance.Lifecycle.PER_METHOD) // by default, this may not be required
public class InstancePerMethodTest {
  private int x;

  @BeforeEach // Per Method Test Case
  void init(){
    this.x = 20;
  }

  @Test
  void testMethod1(){
    this.x++;
    System.out.println(this);
    assertEquals(21,x);
  }

  @Test
  void testMethod2(){
    this.x++;
    System.out.println(this);
    assertEquals(21, this.x);
  }


  public static void main(String[] args) {
    InstancePerMethodTest t1 = new InstancePerMethodTest();
    t1.testMethod1();
    InstancePerMethodTest t2 = new InstancePerMethodTest();
    t2.testMethod1();
  }
}
