package week09d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SantaClausTest {
    @Test
    public void TestChimneys() {
        List<Person> people = List.of(new Person("John Doe", 15));
        SantaClaus santaClaus = new SantaClaus(people);
        assertEquals(1,santaClaus.getPersons().size());
    }
}
