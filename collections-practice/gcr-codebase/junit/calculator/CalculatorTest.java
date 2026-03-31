package junit.calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }
    @Test
    public void testAdd() {

        assertEquals(183,calculator.add(83,100));
    }
    @Test
    public void testSubtract() {
        assertEquals(15,calculator.subtract(100,85));
    }
    @Test
    public void testMultiply() {
        assertEquals(86,calculator.multiply(43,2));
    }
    @Test
    public void testDivide() {
        assertEquals(5,calculator.divide(10,2));
    }
    @Test
    public void devideByZero(){
        assertThrows(ArithmeticException.class, () -> calculator.divide(20,0));
    }

}
