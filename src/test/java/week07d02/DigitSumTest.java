package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DigitSumTest {
    @Test
    public void sumOfDigitsTest() {
       DigitSum digitSum=new DigitSum();
        assertEquals(6,new DigitSum().sumOfDigits(123));
    }

    @Test
    public void sumOfDigitsInvalidNumber() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new DigitSum().sumOfDigits(012));
        assertEquals("Invalid number", ex.getMessage());
    }

    @Test
    public void sumOfDigitsWithTest() {
        DigitSum digitSum=new DigitSum();
        assertEquals(6,new DigitSum().sumOfDigitsWith(123));
    }

}
