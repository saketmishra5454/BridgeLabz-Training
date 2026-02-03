package junit.numberutil;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven(int num) {

        boolean result = NumberUtil.isEven(num);

        // logic to check the number is Even or not
        if (num % 2 == 0) {
            assertTrue(result);
        } else {
            assertFalse(result);
        }
    }
}
