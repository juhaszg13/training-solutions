package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class LabTest {
    @Test
    public void labCreateWithTitle() {
        Lab lab = new Lab("Task1");
        assertEquals("Task1", lab.getTitle());
        assertFalse(lab.isCompleted());
    }

    @Test
    public void labCreateWithTitleAndDate() {
        Lab lab2 = new Lab("Task2", LocalDateTime.of(2020, 12, 10, 10, 23));
        assertEquals(LocalDateTime.of(2020, 12, 10, 10, 23), lab2.getCompletedAt());
        assertTrue(lab2.isCompleted());
    }

    @Test
    public void completeTestWithDate() {
    Lab lab=new Lab("task1");
        assertTrue(lab.complete(LocalDateTime.of( 2020,12,10,9,13)));
    }
    @Test
    public void completeTestWithoutDate() {
        Lab lab=new Lab("task1");
        assertTrue(lab.complete());
    }
    @Test
    public void completeNowTest(){
        Lab lab=new Lab("Cooking");
        lab.complete();
        assertTrue(lab.isCompleted());
       assertTrue(lab.getCompletedAt().plusSeconds(1).isAfter(LocalDateTime.now()));
       assertTrue(lab.getCompletedAt().minusSeconds(1).isBefore(LocalDateTime.now()));
    }

}
