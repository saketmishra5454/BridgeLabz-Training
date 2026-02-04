package junit.bankingtransactions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

   // method to verify the deposit
    @Test
    public void testDeposit() {
        BankAccount ba = new BankAccount();
        ba.deposit(1000);
        assertEquals(1000, ba.getBalance());
    }

    //method to verify the withdraw
    @Test
    public void testWithdraw(){
        BankAccount ba = new BankAccount();

        assertThrows(IllegalArgumentException.class, () -> {
            ba.withdraw(500);
        });
    }
}
