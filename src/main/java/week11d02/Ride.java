package week11d02;

public class Ride {
    int day;
    int numberOfOrder;
    double distance;

    public Ride(int day, int numberOfOrder, double distance) {
        if (day < 1 || day > 7) {
            throw new IllegalArgumentException("Invalid day");
        }
        if (numberOfOrder < 1) {
            throw new IllegalArgumentException("Invalid number of order");
        }
        if(distance<=0.0){
            throw new IllegalArgumentException("Invalid distance");
        }

        this.day = day;
        this.numberOfOrder = numberOfOrder;
        this.distance = distance;
    }

    public int getDay() {
        return day;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public double getDistance() {
        return distance;
    }
}
