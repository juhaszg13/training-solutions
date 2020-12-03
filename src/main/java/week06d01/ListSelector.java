package week06d01;

import java.util.List;

public class ListSelector {
    List<String> words;

    public ListSelector(List<String> words) {
        this.words = words;
    }

    public List<String> getWords() {
        return words;
    }

    public String selectedWords(List<String> words) {
        if (words == null) {
            throw new IllegalArgumentException("List is not null!");
        }
        StringBuilder result = new StringBuilder();
        if (words.size() != 0) {
            result.append("[");
            for (int i = 0; i < words.size(); i += 2) {

                result.append(words.get(i));

            }
            result.append("]");
        }
        return result.toString();
    }
}
