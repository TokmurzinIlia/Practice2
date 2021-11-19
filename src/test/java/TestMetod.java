import com.it_academy.practice.junit_basics.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

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
        @Test(expected = Exception.class)
    public void divideZero() {
            Calculator calculator = new Calculator(3, 0);
            char operation = '/';
            float result = calculator.calculate(operation);
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



