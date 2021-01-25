package week07d01;

import org.junit.jupiter.api.Test;
import week07d02.DigitSum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathAlgorithmsTest {
    @Test
    public void isPrimeTest(){
        assertEquals(true,MathAlgorithms.isPrime(11).isPrime());
    }
    @Test
    public void isPrimeTestInvalidNumber() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> MathAlgorithms.isPrime(1).isPrime());
        assertEquals("Invalid number", ex.getMessage());
    }
}
