package junit.temperatureconverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    @Test
    public void testConvert(){         //method to verify the conversion is right or wrong
        TemperatureConverter tc = new TemperatureConverter();
         assertEquals(32,tc.cToF(0));
         assertEquals(0, tc.fToC(32));
    }
}
