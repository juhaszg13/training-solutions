package week10d02;

import java.util.List;

public class MaxTravel {
    public int getMaxIndex(List<Integer> passengers) {
        int[] passengersSum = new int[30];
        int maxValue = 0;
        int maxIndex = 0;
        for (int item : passengers) {
            passengersSum[item]++;
        }
        for (int i = 0; i < passengersSum.length; i++) {
            if (passengersSum[i] > maxValue) {
                maxValue = passengersSum[i];
                maxIndex = i;
            }
        }

        return maxIndex;

    }
}
