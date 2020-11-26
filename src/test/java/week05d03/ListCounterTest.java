package week05d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCounterTest {

    @Test
    void ListCounter() {
        ListCounter listCounter = new ListCounter();
        List<String> names = new ArrayList<>();
        names.add("Ananasz");
        names.add("alma");
        names.add("korte");
        assertEquals(2, listCounter.number(names));
    }
}
