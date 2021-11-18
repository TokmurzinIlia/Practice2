import com.it_academy.practice.junit_basics.Calculator;
import org.junit.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@RunWith(JUnitPlatform.class)

public class TestMetod {


    @Test
    public void add() {
        Calculator calculator = new Calculator(2, 3);
        char operation = '+';
        float result = calculator.calculate(operation);
        float expected = 5;
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void divide() {
            Calculator calculator = new Calculator(3, 3);
            char operation = '/';
            float result = calculator.calculate(operation);
            float expected = 2;
            assertEquals(expected, result, 0.001);
        }

    @Test
    public void subtract() {
            Calculator calculator = new Calculator(3, 3);
            char operation = '-';
            float result = calculator.calculate(operation);
            float expected = 0;
            assertEquals(expected, result, 0.001);
        }

}



