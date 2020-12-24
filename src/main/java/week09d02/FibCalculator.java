package week09d02;

import java.util.ArrayList;
import java.util.List;

public class FibCalculator {
    public long sumEvens(int bound) {
        int sum = 0;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(1);
        int i = 2;
        while (numbers.get(i) < bound) {
            i++;
            numbers.add(numbers.get(i - 1) + numbers.get(i - 2));
            if(numbers.get(i)%2==0){
                sum+=numbers.get(i);

            }
        }
        return sum;
    }

}

