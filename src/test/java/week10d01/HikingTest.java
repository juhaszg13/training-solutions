package week10d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HikingTest {

    @Test
    public void getPlusElevationTest() {
        assertEquals(13, new Hiking().getPlusElevation(List.of(10.0, 20.0, 15.0, 18.0)));
    }

    @Test
    public void getPlusElevationListIsEmptyTest() {
        assertEquals(0.0, new Hiking().getPlusElevation(List.of()));
    }

    @Test
    public void getPlusElevationListWithOneElementTest() {
        assertEquals(0.0, new Hiking().getPlusElevation(List.of(10.0)));
    }

    @Test
    public void getPlusElevationListIsNullTest() {
        assertThrows(IllegalArgumentException.class, () -> new Hiking().getPlusElevation(null));
    }
}
