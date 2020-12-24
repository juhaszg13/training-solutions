package week09d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    void setPresentTest(){
        Person person=new Person("John Doe",15);
        assertEquals(Present.DECORATION,person.setPresent());
    }
}
