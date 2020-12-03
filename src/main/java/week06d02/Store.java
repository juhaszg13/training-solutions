package week06d02;

import java.util.List;

public class Store {
    private List<Product> products;

    public Store(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getProductByCategoryName(String category){
        int count=0;
        for(Product product:products){
            if(category.equals(product.getCategory())){
                count++;
            }
        }
    return count;
    }

}
