package classstructureconstructors;

public class Store {
    private String product;
    private int store;

    public Store(String product) {
        this.product = product;
    }

    public void store(int items){
        store=store+items;
    }
    public void dispatch(int items){
        store-=items;
    }
    public String getProduct() {
        return product;
    }

    public int getStore() {
        return store;
    }
}
