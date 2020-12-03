package week06d03;

public class WordEraser {
    public String eraseWord(String words, String word) {
        StringBuilder sb = new StringBuilder();
        String[] temp = words.split(" ");
        for (int i = 0; i < temp.length; i++) {
            if (!word.equals(temp[i])) {
                sb.append(temp[i]+" ");
            }
        }
    return sb.toString().trim();
    }
}
