package junit.userregistration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import  static org.junit.jupiter.api.Assertions.assertThrows;

public class UserRegistrationTest {
// method to verify that the user is valid or not
    @Test
    public void testValidUser(){
        UserRegistration u = new UserRegistration();

        assertDoesNotThrow(() -> {
            u.registerUser("Saket", "s@test.com", "abc123");
        });
    }
    // method to verify that the user is Invalid or not
    @Test
    public void testInvalidUser(){
        UserRegistration u = new UserRegistration();

        assertThrows(IllegalArgumentException.class, () -> {
            u.registerUser("", "", "12");
        });
    }
}
