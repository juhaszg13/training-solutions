package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordEraserTest {

    @Test
    public void eraseWordTest() {
        WordEraser we = new WordEraser();
        String original = "alma korte szilva alma cseresznye";
        String result = "korte szilva cseresznye";
        assertEquals(result, we.eraseWord(original, "alma"));
    }

    @Test
    public void eraseWordWithScannerTest() {
        WordEraser we = new WordEraser();
        String original = "alma korte szilva alma cseresznye";
        String result = "korte szilva cseresznye";
        assertEquals(result, we.eraseWordWithScanner(original, "alma"));
    }
}
