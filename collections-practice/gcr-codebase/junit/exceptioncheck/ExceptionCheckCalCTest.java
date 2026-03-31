package junit.exceptioncheck;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionCheckCalCTest {

    @Test
    public void testDivideByZero(){
        ExceptionCheckCalC ex = new ExceptionCheckCalC();

        //checking exception
        assertThrows(ArithmeticException.class, () ->{
            ex.divide(10,0);
        });
    }
}
