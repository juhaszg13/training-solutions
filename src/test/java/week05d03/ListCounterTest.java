package week05d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCounterTest {

    @Test
    void listCounterEmptyList() {
        ListCounter listCounter = new ListCounter();
        List<String> names = new ArrayList<>();
        assertEquals(0, listCounter.number(names));
    }

    @Test
    void listCounterNamesWithoutA() {
        ListCounter listCounter = new ListCounter();
        List<String> names = new ArrayList<>();
        names.add("Geza");
        names.add("Misa");
        assertEquals(0, listCounter.number(names));
    }

    @Test
    void listCounter() {
        ListCounter listCounter = new ListCounter();
        List<String> names = new ArrayList<>();
        names.add("Ananasz");
        names.add("alma");
        names.add("korte");
        assertEquals(2, listCounter.number(names));
    }
}
