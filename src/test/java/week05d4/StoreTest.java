package week05d4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreTest {
    @Test
    public void addProductTest() {
        List<Product> testList=new ArrayList<>();
        Store store = new Store(testList);
        assertFalse(store.addProduct(new Product("milk", 2020, 11, 25)));
        assertTrue(store.addProduct(new Product("milk", 2020, 11, 27)));
        assertFalse(store.addProduct(new Product("milk", 2020, 12, 27)));

    }
}
