import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NUnit {

    // ================== Bank Account Class ==================
    static class Program {

        private int balance;

        // Constructor
        public Program(int balance) {
            this.balance = balance;
        }

        // Deposit method
        public void deposit(int amount) throws Exception {

            if (amount <= 0) {
                throw new Exception("Invalid deposit amount");
            }

            balance += amount;
        }

        // Withdraw method
        public void withdraw(int amount) throws Exception {

            if (amount > balance) {
                throw new Exception("Insufficient balance");
            }

            balance -= amount;
        }

        // Getter
        public int getBalance() {
            return balance;
        }
    }

    // ================== Unit Test Cases ==================

    // Test for valid deposit
    @Test
    void testDepositValidAmount() throws Exception {

        // Arrange
        Program account = new Program(1000);

        // Act
        account.deposit(500);

        // Assert
        assertEquals(1500, account.getBalance());
    }

    // Test for negative deposit
    @Test
    void testDepositNegativeAmount() {

        // Arrange
        Program account = new Program(1000);

        // Act & Assert
        assertThrows(Exception.class, () -> {
            account.deposit(-200);
        });
    }

    // Test for valid withdrawal
    @Test
    void testWithdrawValidAmount() throws Exception {

        // Arrange
        Program account = new Program(1000);

        // Act
        account.withdraw(400);

        // Assert
        assertEquals(600, account.getBalance());
    }

    // Test for insufficient funds
    @Test
    void testWithdrawInsufficientFunds() {

        // Arrange
        Program account = new Program(500);

        // Act & Assert
        assertThrows(Exception.class, () -> {
            account.withdraw(1000);
        });
    }
}
