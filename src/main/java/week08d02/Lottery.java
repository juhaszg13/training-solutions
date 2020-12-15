package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {


    public List<Integer> getNumbers(int interval, int numbers) {
        List<Integer> result = new ArrayList<>(numbers);
        for (int i = 0; i < numbers; i++) {
            result.add(generateNumberNotInList(result, interval));
        }
        return result;
    }

    private int generateNumberNotInList(List<Integer> myList, int interval) {
        Random rnd = new Random(5);
        int number = rnd.nextInt(interval) + 1;
        while (myList.contains(number)) {
            number = rnd.nextInt(interval) + 1;
        }
        return number;
    }

    public static void main(String[] args) {
       Lottery lottery=new Lottery();
        System.out.println(lottery.getNumbers(90,5));
    }
}
