package week06d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListSelectorTest {
    ListSelector ls = new ListSelector(Arrays.asList("körte","kóla","pálinka"));

    @Test

    public void selectedWordTest() {
        ListSelector ls = new ListSelector(Arrays.asList("körte","kóla","pálinka"));
        assertEquals("[körtepálinka]", ls.selectedWords(ls.getWords()));
    }

    @Test

    public void listIsNotNull(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> ls.selectedWords(null));
        assertEquals("List is not null!", ex.getMessage());
    }
}
