package junit.dateformatter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateFormatterTest {
    @Test
    public void testDate(){          //method to verify that the given date is in same format or not
        DateFormatter d = new DateFormatter();
        assertEquals("13-02-2005", d.formatDate("2005-02-13"));
    }
    @Test
    public void InvalidDate(){        //method for verify that the given date is invalid
        DateFormatter d = new DateFormatter();

        assertThrows(IllegalArgumentException.class, () ->{
            d.formatDate("13/02/2005");
        });
    }
}
