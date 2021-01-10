package week10d01;

import java.util.*;

public class Hiking {
    private List<Double> hights;


    public double getPlusElevation(List<Double> hights) {

        if (hights == null) {
            throw new IllegalArgumentException("No list");
        }
        double sum = 0;
        if (hights.size() > 1) {
            for (int i = 1; i < hights.size(); i++) {
                if (hights.get(i) > hights.get(i - 1)) {
                    sum += hights.get(i) - hights.get(i - 1);
                }
            }
        }
        return sum;
    }
}