package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringLists {
    public List<String> stringListsUnion(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < first.size(); i++) {
            result.add(first.get(i));
        }
        for (int i = 0; i < second.size(); i++) {
            if (isItemOfSecondInList(second.get(i), result)) {
                result.add(second.get(i));
            }
        }

        return result;
    }

    public boolean isItemOfSecondInList(String item, List<String> myList) {
        for (int j = 0; j < myList.size(); j++) {
            if (item.equals(myList.get(j))) {
                return false;
            }
        }
        return true;
    }

    public List<String> stringListsUnionBestSolution(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>(first);
        for (String i : second) {
            if (!result.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
