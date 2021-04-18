package week02d03;

public class Product {
    public String name;
    public String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public boolean areTheyEqual(Product product) {
        String productName = product.getName();
        String productCode = product.getCode();
        if (name.equals(productName) && (productCode.length() >= code.length() - 1) &&
                (productCode.length() <= code.length() + 1)) {
            return true;
        }else{
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public static void main(String[] args) {
        Product product=new Product("alma","123456");
        boolean b=product.areTheyEqual(new Product("alma","1234567"));
        System.out.println(b);
    }
}
