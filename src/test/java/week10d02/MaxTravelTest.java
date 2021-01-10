package week10d02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxTravelTest {

    @Test
    void getMaxIndex() {
        assertEquals(15, new MaxTravel().getMaxIndex(List.of(3, 3, 3, 15, 15, 15, 15, 0, 2)));
    }
}