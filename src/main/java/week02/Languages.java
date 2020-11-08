package week02;

import java.util.ArrayList;
import java.util.List;

public class Languages {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        for (int i = 0; i < languages.size(); i++) {
            String language=languages.get(i);
            if (language.length()>5) {
                System.out.println(language);
            }
        }
    }
}