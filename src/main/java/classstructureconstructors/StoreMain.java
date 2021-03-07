package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store store=new Store("Alma");
        Store anotherStore=new Store("Körte");
        store.store(15);
        store.dispatch(3);
        anotherStore.store(24);
        anotherStore.dispatch(10);
        System.out.println(store.getProduct());
        System.out.println(store.getStore());
        System.out.println(anotherStore.getProduct());
        System.out.println(anotherStore.getStore());
    }
}
