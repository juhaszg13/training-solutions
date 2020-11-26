package week05d03;

import java.util.List;

public class ListCounter {
    public int number(List<String> names) {
        int numberOfSpecifiedNames = 0;
        for (int i = 0; i < names.size(); i++) {
            if ("a".equals(names.get(i).substring(0, 1).toLowerCase())) {
                numberOfSpecifiedNames = numberOfSpecifiedNames + 1;
            }
        }
        if (numberOfSpecifiedNames == 0||names.size()==0) {
            return 0;
        } else {
            return numberOfSpecifiedNames;
        }
    }

}
