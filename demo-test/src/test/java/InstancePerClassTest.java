
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;


  @TestInstance(TestInstance.Lifecycle.PER_CLASS)
  //@TestMethodOrder(OrderAnnotation.class)
  public class InstancePerClassTest{
    private int x;
    @BeforeAll // initialise the object once only
    void init(){
      this.x = 10;
    }

    @AfterAll // usage?????
    void afterallTest(){

      System.out.println("hello .... afterall");

    }


    @Test
    @Order(1)
    public void testA(){
      this.x++;
      assertEquals(11,this.x);
    }

    @Test
    @Order(2)
    public void testB(){
      this.x++;
      assertEquals(12,this.x);
    }

    public static void main(String[] args){
      InstancePerClassTest instancePerClassTest = new InstancePerClassTest();
      instancePerClassTest.testA();
      instancePerClassTest.testB();
    }
  }

