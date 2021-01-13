package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {


    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        if (rides.size() == 0 && ride.getNumberOfOrder() == 1) {
            rides.add(ride);
            return;
        }
        if (rides.size() == 0 && ride.getNumberOfOrder() > 1) {
            throw new IllegalArgumentException("Invalid Ride");
        }

        if (isValidRide(rides, ride)) {
            this.rides.add(ride);
        } else {
            throw new IllegalArgumentException("Invalid Ride");
        }

    }


        public boolean isValidRide(List<Ride> rides,Ride ride) {
            int a = rides.size();
            if (rides.get(a - 1).getDay() < ride.getDay() && ride.getNumberOfOrder() == 1) {
                return true;
            }
            if (rides.get(a - 1).getDay() == ride.getDay() &&
                    rides.get(a - 1).getNumberOfOrder() == ride.getNumberOfOrder() - 1) {
                return true;
            }

            return false;
        }

    public int getFirstDayOff(List<Ride> rides) {
        boolean[] temp = new boolean[7];
        for (Ride ride : rides) {
            temp[ride.getDay() - 1] = true;
        }
        for (int i = 0; i < 7; i++) {
            if (temp[i] == false) {
                return i + 1;
            }
        }
        return 0;
    }

    public List<Ride> getRides() {
        return rides;
    }

    public void setRides(List<Ride> rides) {
        this.rides = rides;
    }
}
