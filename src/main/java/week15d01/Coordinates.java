package week15d01;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import static java.lang.Long.MIN_VALUE;


public class Coordinates {
    public Map.Entry<Double, Double> maxCoordinates(Map<Double, Double> coordinates) {
        if(coordinates.isEmpty()||coordinates.containsValue(Double.MIN_VALUE)){
            throw new IllegalStateException("Wrong parameters");
        }
        Map.Entry<Double, Double> maxElement = null;
        double maxValue=Double.MIN_VALUE;

        for (Map.Entry<Double,Double> actual : coordinates.entrySet()) {
            if (maxValue<actual.getValue()) {
            maxElement=actual;
            maxValue=actual.getValue();
            }
        }
        return maxElement;
    }
    public Map.Entry<Double, Double> maxCoordinates2(Map<Double, Double> coordinates) {
        if(coordinates.isEmpty()||coordinates.containsValue(Double.MIN_VALUE)){
            throw new IllegalStateException("Wrong parameters");
        }
        Map.Entry<Double, Double> maxElement = null;


        for (Map.Entry<Double,Double> actual : coordinates.entrySet()) {
            if (maxElement==null||(maxElement.getValue()<actual.getValue())){
                maxElement=actual;

            }
        }
        return maxElement;
    }
}
