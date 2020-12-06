package week05d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {
    @Test
    public void getFullNameTestWithoutMistakes() {
        User user = new User("Gábor", "Juhász", "juhasz@freemail.hu");

        assertEquals("Gábor Juhász", user.getFullName(user.getFirstName(), user.getLastName()));

    }

    @Test
    public void getFullNameTestWrongEmailStructure() {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new User("Gábor", "Juhász", "juhasz@gabor"));
        assertEquals("Hibás email cím! '@' vagy '.' hiányzik!", ex.getMessage());
    }
}


