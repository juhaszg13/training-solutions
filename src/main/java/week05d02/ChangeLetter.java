package week05d02;

public class ChangeLetter {

    private static final String VOWELS = "aeiou";
    private static final String REPLACE_CHAR = "*";

    public String changeVowels(String word) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            String c = word.substring(i, i + 1);
            if (VOWELS.contains(c)) {
                builder.append(REPLACE_CHAR);
            }
            else{
                builder.append(c);
            }

        }
    return builder.toString();
    }
}