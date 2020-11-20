package attributes.bill;

import java.util.ArrayList;
import java.util.List;

public class BillMain {
    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.addItem((new Item("kifli", 3, 30)));
        bill.addItem((new Item("zsömle", 2, 30)));
        bill.addItem((new Item("kenyér", 1, 300)));
        System.out.println(bill.calculateTotalPrice());

        }
    }
