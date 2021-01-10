package week10d05;

import java.util.Arrays;

public class Calculator {
    private static final int LENGTH = 4;

    public int findMinSum(int[] arr) {
        if (arr.length < 4) {
            throw new IllegalArgumentException("Array is short");
        }
        int sum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < LENGTH; i++) {

            sum += arr[i];
        }

        return sum;
    }
}
