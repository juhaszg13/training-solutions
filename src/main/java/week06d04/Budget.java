package week06d04;


import java.util.ArrayList;
import java.util.List;

public class Budget {
    private List<Item> items;


    public Budget(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItemsByMonth(int month) {
        List<Item> itemsByMonth = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (month == items.get(i).getDate().getMonthValue()) {
                itemsByMonth.add(items.get(i));
            }
        }
        return itemsByMonth;
    }

    public List<Item> getItems() {
        return items;
    }
}

