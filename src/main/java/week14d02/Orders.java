package week14d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Orders {
    private Map<String, TreeSet<String>> ordersMap = new HashMap<>();

    public void readFiles() {
        InputStreamReader is = new InputStreamReader(week14d02.Orders.class.getResourceAsStream("orders.txt"));
        try (BufferedReader reader = new BufferedReader(is)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] splitLine = line.split(" ");
                TreeSet<String> products = new TreeSet<>();
                Collections.addAll(products, splitLine[1].split(","));
                ordersMap.put(splitLine[0], products);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

    public TreeSet<String> getProductsOrderByID(String id) {
        return ordersMap.get(id);
    }

    public Map<String, Integer> getProductsMap() {
        Map<String, Integer> productsMap = new HashMap<>();
        for (TreeSet<String> set : ordersMap.values()) {
            for (String item : set) {
                if (!productsMap.containsKey(item)) {
                    productsMap.put(item, 1);
                } else {
                    productsMap.put(item, productsMap.get(item) + 1);
                }
            }
        }
        return productsMap;
    }
    public int getNumberOfOrderedProducts(String product){
        return getProductsMap().get(product);
    }
    public int getNumberByOderedID(String id){
        return getProductsOrderByID(id).size();
    }


    public static void main(String[] args) {
        Orders orders = new Orders();
        orders.readFiles();
        System.out.println(orders.ordersMap);
        System.out.println(orders.getProductsOrderByID("W34111"));
        System.out.println(orders.getProductsMap());
        System.out.println(orders.getNumberOfOrderedProducts("passata"));
    }

}

