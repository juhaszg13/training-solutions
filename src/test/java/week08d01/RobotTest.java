package week08d01;

import org.junit.jupiter.api.Test;
import week07d03.NumberList;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RobotTest {
    @Test
    void moveTest() {
        Robot robot = new Robot();
        robot.move("LLLFJJJJB");
        assertEquals(3, robot.getPosition().getX());
        assertEquals(-2, robot.getPosition().getY());
    }
    @Test
    public void moveTestWithInvalidPosition() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Robot().move("LD"));
        assertEquals("Unknown movement!", ex.getMessage());
    }
}
