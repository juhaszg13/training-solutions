package week11d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {
    Courier courier = new Courier();
    List<Ride> rides=new ArrayList<>();



    @Test
    void addRideTest() {
        rides.add(new Ride(1, 1, 1.0));
        rides.add(new Ride(1, 2, 3.0));
        rides.add(new Ride(3, 1, 5.0));
        courier.setRides(rides);

       courier.addRide(new Ride(3, 2, 12.0));
       assertEquals(4,courier.getRides().size());
    }
    @Test
    void addRideInvalidRideTest() {
        rides.add(new Ride(1, 1, 1.0));
        rides.add(new Ride(1, 2, 3.0));
        rides.add(new Ride(3, 1, 5.0));
        courier.setRides(rides);
        assertThrows(IllegalArgumentException.class,()->courier.addRide(new Ride(2,1,13.0)));
    }

    @Test
    void getFirstDayOffTest() {
        rides.add(new Ride(1, 1, 1.0));
        rides.add(new Ride(1, 2, 3.0));
        rides.add(new Ride(2, 1, 5.0));
        courier.setRides(rides);
        assertEquals(3,courier.getFirstDayOff(courier.getRides()));
    }
}