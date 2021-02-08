package week13d05;

import java.util.*;

public class Char {
    public int charCounter(String str) {
        Set<Character> characters = new HashSet<>();
        String éoverCaseStr = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (isEnglishLowerCaseCharacter(c)) {
                characters.add(c);
            }
        }
        return characters.size();
    }

    private boolean isEnglishLowerCaseCharacter(char c) {
        return (c >= 'a' && c <= 'z');
    }

    public int letterOfWordCounter(String str) {
        char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
                'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Set<Character> abcSet = new HashSet<>();
        for (char c : abc) {
            abcSet.add(c);
        }
        String strLower = str.toLowerCase();
        char[] strArr = strLower.toCharArray();
        Set<Character> strSet = new HashSet<>();
        for (Character c : strArr) {
            strSet.add(c);

        }
        abcSet.retainAll(strSet);
        return abcSet.size();
    }

    public int counter(String word) {
        Set<Character> sc = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 97 && c <= 120) {
                sc.add(c);

            }
        }
        return sc.size();
    }

    public int easyCounter(String word) {
        int result = 0;
        char[] chars = word.toLowerCase().toCharArray();
        for (char c = 'a'; c <= 'z'; c++) {
            for (char charOfstr : chars) {
                result++;
                break;
            }
        }
        return result;
    }

    public int countLetters(String word) {
        Set<Character> letters = new HashSet<>();
        char[] charArray = word.toLowerCase().toCharArray();
        for (char c : charArray) {
            if (c >= 'a' && c <= 'z') {
                letters.add(c);

            }
        }
        return letters.size();
    }

    public int counterToMap(String word) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.toLowerCase().charAt(i);
            if (result.containsKey(c)) {
                result.put(c, result.get(c) + 1);
            } else {
                result.put(c, 1);
            }
        }
        return result.size();
    }

    public int numberOfDifferentLettersInWord(String word) {
        checkValidWord(word);
        Set<Character> differentLetters = new HashSet<>();
        Character ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.toLowerCase().charAt(i);
            if (isValidCharacter(ch)) {
                differentLetters.add(ch);

            }
        }
        return differentLetters.size();
    }

    private void checkValidWord(String word) {
        if (word == null || word.isBlank()) {
            throw new IllegalArgumentException("no such word");
        }
    }

    private boolean isValidCharacter(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    public int counter2(String word) {
        if (word == null) {
            throw new IllegalArgumentException("No word");
        }
        Set<Character> charSet = new HashSet<>(stringToSet(word.toLowerCase()));
        charSet.retainAll(stringToSet(a_z()));
        return charSet.size();
    }

    private String a_z() {
        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(c);
        }
        return sb.toString();
    }

    private Set<Character> stringToSet(String str) {
        Set<Character> charSet = new HashSet<>();
        for (Character ch : str.toCharArray()) {
            charSet.add(ch);

        }
        return charSet;
    }
}

