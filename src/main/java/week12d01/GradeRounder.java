package week12d01;

import java.util.Arrays;

public class GradeRounder {
    public int[] roundGrades(int[] grades) {
        int[] result = new int[grades.length];
        if (result.length == 0) {
            throw new IllegalArgumentException("No grades");
        }
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > 40 && (grades[i] % 5 == 3 || grades[i] % 5 == 4)) {
                result[i] = grades[i] + (5 - (grades[i] % 5));
            } else {
                result[i] = grades[i];
            }
        }
        return result;
    }

    public int[] roundGrades2(int[] grades) {
        for (int i = 0; i < grades.length;i++) {
            if(grades[i]>40) {
                int floor = grades[i] / 5;
                int next = (floor + 1) * 5;
                if ((next - grades[i]) < 3) {
                    grades[i] = next;
                }
            }
        }
        return grades;
    }



    public static void main(String[] args) {
        int[] result=new GradeRounder().roundGrades2(new int[]{34,81,84});
        System.out.println(Arrays.toString(result));
    }
}
