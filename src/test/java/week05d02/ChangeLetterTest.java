package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {
    @Test
    void testChangeLdetters() {
        assertEquals("d*n*ldtr*mp", new ChangeLetter().changeVowels("donaldtrump"));
    }
}
