package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public void risePrice(int percent) {
        price = (int)(price * (1 + percent / 100.0));
    }

    public int comparePricePerCapacity(Pendrive pd) {
        if ((double)pd.price / pd.capacity > (double)price / this.capacity) {
            return -1;
        }
        if ((double)pd.price / pd.capacity < (double)price / this.capacity) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean cheaperThan(Pendrive pd) {
        if (this.price < pd.getPrice()) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "PenDrives{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }

}
