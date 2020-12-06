package week06d03;

import java.util.Scanner;

public class WordEraser {
    public String eraseWord(String words, String word) {
        StringBuilder sb = new StringBuilder();
        String[] temp = words.split(" ");
        for (int i = 0; i < temp.length; i++) {
            if (!word.equals(temp[i])) {
                sb.append(temp[i] + " ");
            }
        }
        return sb.toString().trim();
    }

    public String eraseWordWithScanner(String words, String word) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(words);

        while (scanner.hasNext()) {
            String s=scanner.next();
            if (!word.equals(s)) {
                sb.append(s).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
