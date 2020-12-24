package week09d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LKKTTest {
    @Test
    public void lKKTTest(){
        LKKT lkkt=new LKKT();
        assertEquals(143,lkkt.lKKT(11,13));
        assertEquals(15,lkkt.lKKT(5,15));
    }
}
