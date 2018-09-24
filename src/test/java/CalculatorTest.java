import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        int addNumbers = calculator.add(17, 69);
        assertEquals(86, addNumbers);
    }

    @Test
    public void canSubtract(){
        int subtractNumbers = calculator.subtract(47, 39);
        assertEquals(8, subtractNumbers);
    }

    @Test
    public void canMultiply(){
        int multiplyNumbers = calculator.multiply(12, 12);
        assertEquals(144, multiplyNumbers);
    }

    @Test
    public void canDivide(){
        int divideNumbers = calculator.divide(9, 3);
        assertEquals(3, divideNumbers);
    }

}