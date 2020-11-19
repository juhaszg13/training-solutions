package math.rounding;

import java.util.Random;

public class RoundingAnomaly {
    Random rnd = new Random();

    private double[] randomNumbers(int size, double max, int scale) {
        double[] numbers = new double[size];
        for (int i = 0; i < size; i++) {
            double factor = Math.pow(10, scale);
            numbers[i] = Math.round(rnd.nextDouble() * max * factor) / factor;
        }
        return numbers;
    }

    private double roundAfterSum(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return Math.round(sum);
    }

    private double sumAfterRound(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.round(numbers[i]);
        }
        return sum;
    }

    private double difference(int size, double max, int scale) {
        double[] numbers = randomNumbers(size, max, scale);
        double resultAfterSum = roundAfterSum(numbers);
        double resultAfterRound = sumAfterRound(numbers);
        return Math.abs(resultAfterRound - resultAfterSum);
    }

    public static void main(String[] args) {
        RoundingAnomaly roundingAnomaly=new RoundingAnomaly();
        int count=100;
        double sum=0;
        for(int i=0;i<count;i++){
            double diff=roundingAnomaly.difference(100,1000_000,5);
           sum+=diff;
            System.out.println("Diff: "+diff);
        }
        System.out.println(sum/count);
    }
}
