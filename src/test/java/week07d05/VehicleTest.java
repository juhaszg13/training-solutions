package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {
    @Test
    public void allTest() {
        Vehicle vehicle = new Car();
        Car car = new Truck();
        Truck truck = new MotorCycle();
        assertEquals(TransmissionType.AUTOMATIC, vehicle.getTransmissionType());
        assertEquals(TransmissionType.SEQUENTIAL, truck.getTransmissionType());
        assertEquals(5, truck.NUMBEROFGEARS);
        assertEquals(5, vehicle.NUMBEROFGEARS);
        assertEquals(5, car.NUMBEROFGEARS);



    }
}

