package junit.passwordtesting;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {

    @Test
    public void testPassword(){
        PasswordValidator pv = new PasswordValidator();

        assertTrue(pv.isValid("Saket123$"));
    }
}
