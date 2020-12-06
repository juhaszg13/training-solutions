package week06d04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BudgetTest {
    private Budget budget=new Budget(Arrays.asList(
            new Item(200,2020,2,13,"Apple"),
            new Item(1200,2020,2,21,"Pear"),
            new Item(3000,2020,10,11,"Peach"),
            new Item(800,2020,2,12,"Pear")
            ));
    @Test
    public void getItemsByMonthTest() {
        List<Item> result = budget.getItemsByMonth(2);
        assertEquals(3,result.size());
        assertEquals("Pear",result.get(1).getName());
    }
}
