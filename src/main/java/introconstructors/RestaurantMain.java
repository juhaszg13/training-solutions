package introconstructors;

import static java.awt.SystemColor.menu;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant=new Restaurant("Kék Duna",15);
        System.out.println("Name: "+restaurant.getName()+", Capacity: "+restaurant.getCapacity()+", Menu: "+restaurant.getMenu());
    }
}
