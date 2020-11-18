package finalmodifier;

public class TaxCalculator {
    public static final double TAX = 27;

    public double tax(double price) {
        return price * 27 / 100;
    }

    public double priceWithTax(double price) {
        return (1 + TAX / 100) * price;
    }

    public static void main(String[] args) {
        System.out.println(new TaxCalculator().tax(100));
        System.out.println(new TaxCalculator().priceWithTax(100));
    }
}
