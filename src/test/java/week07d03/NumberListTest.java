package week07d03;

import org.junit.jupiter.api.Test;
import week06d05.Biscuit;
import week06d05.BiscuitType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NumberListTest {
    @Test
    public void isIncreasingTest() {
        List<Integer> numbers = Arrays.asList(2, 4, 4, 7, 8);
        assertTrue(new NumberList().isIncreasing(numbers));

        numbers = Arrays.asList(6, 7, 5, 6);
        assertFalse(new NumberList().isIncreasing(numbers));
    }

    @Test
    public void isIncreasingTestWrongList() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new NumberList().isIncreasing(Arrays.asList(1)));
        assertEquals("At least two numbers needed!", ex.getMessage());
    }
}
