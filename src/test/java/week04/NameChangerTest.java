package week04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameChangerTest {
    @Test
    public void changeNameTest() {
        NameChanger nameChanger = new NameChanger("Douglas Michael");
        nameChanger.changeFirstName("Kirk");
        assertEquals("Douglas Kirk",nameChanger.getFullName());
    }


}
