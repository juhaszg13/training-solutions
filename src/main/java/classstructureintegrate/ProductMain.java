package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Kétem a termék nevét:");
        String name=scanner.nextLine();

        System.out.println("Kétem az árat:");
        int price=scanner.nextInt();
        scanner.nextLine();

        Product product=new Product(name, price);

        System.out.println(product.getName()+" "+product.getPrice());

        product.increasePrice(12);
        System.out.println(product.getName()+" "+product.getPrice());
        product.decreasePrice(6);
        System.out.println(product.getName()+" "+product.getPrice());

    }

}
