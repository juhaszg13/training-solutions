package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {
    public String numberOfDaysAsString() {
        int[] numberOfDays = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public List<String> daysOfWeek() {

        return Arrays.asList("hétfö", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap");
    }

    public String multiplicationTableAsString(int size) {
        int[][] multiplicationTable = new int[size][size];
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable.length; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

    public boolean sameTempValue(double[] day, double[] anotherday) {

        return Arrays.equals(day, anotherday);
    }

    public boolean wonLottery(int[] a, int[] b) {
        int[] copyOfWinner = Arrays.copyOf(a, a.length);
        int[] copyOfStake = Arrays.copyOf(b, b.length);

        Arrays.sort(copyOfWinner);
        Arrays.sort(copyOfStake);
        return Arrays.equals(copyOfWinner, copyOfStake);


    }

    private int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public boolean sameTempValuesDaylight( double[] day, double[] anotherDay){
            //double[] copyOfDay=Arrays.copyOf(day);
            //double[] copyOfAnotherDay=Arrays.copyOf(anotherDay);
            //int dayLength = day.length;
            //int anotherDayLength = anotherDay.length;
            int smallHours = min(day.length, anotherDay.length);
            double[] smallHoursDay = Arrays.copyOfRange(day,0, smallHours);
            double[] smallHoursAnotherDay = Arrays.copyOfRange(anotherDay,0, smallHours);
            return Arrays.equals(smallHoursDay,smallHoursAnotherDay);
        }


    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();
        System.out.println(arraysMain.numberOfDaysAsString());

        System.out.println(arraysMain.daysOfWeek());

        System.out.println(arraysMain.multiplicationTableAsString(10));

        System.out.println(arraysMain.sameTempValue(new double[]{1, 2}, new double[]{1, 2}));
        System.out.println(arraysMain.sameTempValue(new double[]{1, 2}, new double[]{1, 2, 3}));

        System.out.println(arraysMain.wonLottery(new int[]{1, 2}, new int[]{2, 1}));

        int[] winner = new int[]{6, 8, 9, 34, 12};
        int[] stake = new int[]{9, 34, 6, 8, 12};
        System.out.println(arraysMain.wonLottery(winner, stake));
        System.out.println(Arrays.toString(stake));

        System.out.println(arraysMain.sameTempValuesDaylight(new double[]{1,2},new double[]{1,2,3}));
        System.out.println(arraysMain.sameTempValuesDaylight(new double[]{1,2,3,4},new double[]{1,2,4}));
    }
}
