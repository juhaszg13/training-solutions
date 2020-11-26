package week05d03;

import java.util.List;

public class ListCounter {
    public int number(List<String> names) {
        int numberOfSpecifiedNames = 0;
        for (String i : names) {
            if (i.toLowerCase().startsWith("a")) {
                numberOfSpecifiedNames++;
            }
        }
        return numberOfSpecifiedNames;
    }
}
