import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.basic.demo.Calculators;
import com.basic.demo.RealCalculator;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
  
  @Mock
  private Calculators calculator; // new?


  // @InjectMocks means calling the constructor "RealCalculator(Calculators calculator)"
  // by passing @Mock calculator
  @InjectMocks
  private RealCalculator realCalculator;


  @Test
  void testCalculateMethod(){
    // when someone call "calculator.addition(10,5), assume return 3 always."
    Mockito.when(calculator.addition(10,5)).thenReturn(3);

    // Call the targeted test method
    // Calculators realcalculator = new Calculators();
    // realCalculator.calculate(10);

    // Call the targeted test method
    RealCalculator realCalculator = new RealCalculator(calculator);
    assertThat(realCalculator.calculate(10),is(17)); // 3 + p(=10) + 4 = 17


    // Another case
    Mockito.when(calculator.addition(82,41)).thenReturn(1000);
    assertThat(realCalculator.calculate(82),is(1086)); // 1000 + p(=82) + 4 = 1086

  }

  @Test
  void testSleep(){
    Mockito.when(calculator.addition(20,10)).thenReturn(1000);

    RealCalculator realCalculator = new RealCalculator(calculator);

    assertThat(realCalculator.sleep(20),is(1020)); // 150 + 20 = 170


    Mockito.verify(calculator,times(1)).addition(20,10);
    Mockito.verify(calculator,times(0)).addition(20,20);

  }

  @Test
  void testSleep2(){
    Mockito.when(calculator.addition(50,25)).thenReturn(2);
    assertThat(this.realCalculator.sleep(50),is(22)); // 2+ 20 // this, mock injected object
  }


}
