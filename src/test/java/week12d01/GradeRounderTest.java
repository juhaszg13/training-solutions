package week12d01;

import org.junit.jupiter.api.Test;
import week10d01.Hiking;

import static org.junit.jupiter.api.Assertions.*;

class GradeRounderTest {
    @Test
    public void roundGradesTest() {

        GradeRounder gradeRounder = new GradeRounder();
        int[] result=gradeRounder.roundGrades(new int[]{ 32, 34, 43, 99, 71 });

        assertEquals(34,result[1]);
        assertEquals(45,result[2]);
        assertEquals(100,result[3]);
        assertEquals(71,result[4]);
        assertEquals(5,result.length);
    }
    @Test
    public void RoundGradesTestWithNoElement(){

        assertThrows(IllegalArgumentException.class, () -> new GradeRounder().roundGrades(new int[]{}));

    }
}