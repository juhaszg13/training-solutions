package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c) {
        List<String> newWords = new ArrayList<>();
        for (String s : words) {
            if (isInWord(s, c)) {
                newWords.add(s);
            }
        }
        return newWords;
    }

    public boolean isInWord(String word, char c) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }
    public List<String> wordsWithChar2(List<String> words, char c) {
        List<String> newWords = new ArrayList<>();
        for (String s : words) {
            if (s.indexOf(c)>=0) {
                newWords.add(s);
            }
        }
        return newWords;
    }
    public List<String> wordsWithChar3(List<String> words, char c) {
        List<String> newWords = new ArrayList<>();
        for (String s : words) {
            if (s.contains(String.valueOf(c))) {
                newWords.add(s);
            }
        }
        return newWords;
    }
}