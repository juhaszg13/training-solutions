package week11d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    @Test
    void wordsWithCharTest() {
        WordFilter wordFilter=new WordFilter();
        List<String> words=new ArrayList<>();
        words.add("egy");
        words.add("ketto");
        words.add("harom");
        assertEquals(2,wordFilter.wordsWithChar(words,'e').size());
        assertEquals("ketto",wordFilter.wordsWithChar(words,'e').get(1));

        assertEquals(2,wordFilter.wordsWithChar2(words,'e').size());
        assertEquals("ketto",wordFilter.wordsWithChar2(words,'e').get(1));

        assertEquals(2,wordFilter.wordsWithChar3(words,'e').size());
        assertEquals("ketto",wordFilter.wordsWithChar3(words,'e').get(1));
    }
}