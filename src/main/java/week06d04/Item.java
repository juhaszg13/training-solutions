package week06d04;

import java.time.LocalDate;

public class Item {
    private int price;
    private String name;
    private LocalDate date;

    public Item(int price, int year, int month, int day, String name) {
        if (price < 0) {
            throw new IllegalArgumentException("This is not a price!");
        }
        this.price = price;
        this.name = name;
        date = LocalDate.of(year, month, day);
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }
}
