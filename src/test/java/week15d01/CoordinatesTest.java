package week15d01;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CoordinatesTest {

    @Test
    void maxCoordinates() {
        Coordinates coordinates=new Coordinates();
        Map<Double,Double> function=new HashMap<>();
        function.put(1.5,13.0);
        function.put(1.5,15.0);
        function.put(1.5,11.0);
        function.put(-8.0,16.0);
        Map.Entry<Double,Double> result= coordinates.maxCoordinates(function);
        assertEquals(-8.0,result.getKey());
        assertEquals(16.0,result.getValue());
    }
}