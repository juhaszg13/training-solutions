package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DevisorFinderTest {

    @Test
    void findDivisors() {
        assertEquals(2,new DevisorFinder().findDivisors(36));
        assertEquals(0,new DevisorFinder().findDivisors(38));
    }

    @Test
    void isDevisor() {
        assertEquals(true,new DevisorFinder().isDevisor(18,3));
        assertEquals(false,new DevisorFinder().isDevisor(18,4));

    }
}