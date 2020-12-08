package week06d05;

import org.junit.jupiter.api.Test;
import week07d02.DigitSum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BiscuitTest {
    @Test
    public void ofTest() {
        assertEquals(200,Biscuit.of(BiscuitType.CHOCOLATE,200).getGrammAmount());
        assertEquals(BiscuitType.CHOCOLATE,Biscuit.of(BiscuitType.CHOCOLATE,200).getBiscuitType());
    }
    @Test
    public void BiscuitTypeIsNull() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> Biscuit.of(null,200));
        assertEquals("Invalid type.", ex.getMessage());
    }
    @Test
    public void InvalidGrammAmount() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> Biscuit.of(BiscuitType.WHITE,0));
        assertEquals("Amount should bigger than 0.", ex.getMessage());
    }
}
