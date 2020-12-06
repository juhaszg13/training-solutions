package week06d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    Store store = new Store(Arrays.asList(
            new Product("peach", "fruits", 1200),
                new Product("apple","fruits",800),
                new Product("vodka","beverages",4500),
                new Product("banana","fruits",1500)
        ));

    @Test
    public void getProductByCategoryNameTest() {
        assertEquals(3,store.getProductByCategoryName("fruits"));
    }
}
