package week04d05;

import java.util.ArrayList;
import java.util.List;

public class CharOperations {
    public List<Integer> getPositionOfChars(String base, String part) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < base.length() - part.length()+1; i++) {
            if (base.substring(i).startsWith(part)) {
                indexes.add(i);
            }

        }
        return indexes;
    }

    public static void main(String[] args) {
        CharOperations co=new CharOperations();
        System.out.println(co.getPositionOfChars("almafa","a"));
    }
}
