import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class SumCalculatorTests {
    private SumCalculator calc;
    @BeforeEach
    public void beforeEach(){
        calc= new SumCalculator();
    }
    @Test
    public void testSumCalculatorWork(){
        int actual=calc.sum(3);
        int expected=6;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testSumCalculatorWork2(){
        int actual=calc.sum(1);
        int expected=1;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testSumCalculatorWork3(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            int expectedError=calc.sum(0);
        });

    }
}
