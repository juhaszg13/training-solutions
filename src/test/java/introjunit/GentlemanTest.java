package introjunit;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {
    @Test
    public void testcreate(){
        Gentleman gentleman=new Gentleman();
        String name="John Doe";
        String greeting= gentleman.sayHello(name);
        assertEquals("Hello John Doe",greeting);
    }
}
