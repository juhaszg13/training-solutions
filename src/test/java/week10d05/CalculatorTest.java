package week10d05;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void findMinSum() {
        assertEquals(13, new Calculator().findMinSum(new int[]{5, 4, 3, 12, 1}));
    }

    @Test
    void findMinSumFewNumbers() {
        assertThrows(IllegalArgumentException.class, () -> new Calculator().findMinSum(new int[]{1, 2, 3}));
    }
}