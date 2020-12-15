package week07d05;

public class Vehicle {
    TransmissionType transmissionType;
    public static final int NUMBEROFGEARS=5;

    public int getNumberOfGears() {
        return NUMBEROFGEARS;
    }

    public TransmissionType getTransmissionType() {
        return TransmissionType.MANUAL;
    }
}
