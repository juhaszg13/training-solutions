package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathAlgoritmTest {
    @Test
    void greatestCommonDivisorTest() {
        MathAlgorithm mathAlgorithms=new MathAlgorithm();
        assertEquals(5,mathAlgorithms.greatestCommonDivisor(15,40));
        assertEquals(15,mathAlgorithms.greatestCommonDivisor(15,30));
    }
}
