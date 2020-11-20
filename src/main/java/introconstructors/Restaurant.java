package introconstructors;

import java.util.Arrays;
import java.util.List;

public class Restaurant {
    public static final int SEATS = 4;
    List<String> menu;
    String name;
    int capacity;
    int numberOfTables;


    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        this.capacity = numberOfTables * SEATS;
        this.menu = generateMenu();
    }

    public List<String> generateMenu() {
        return Arrays.asList("Baked fish", "Smoked fish", "Tortilla");
    }

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfTables() {
        return numberOfTables;
    }
}
