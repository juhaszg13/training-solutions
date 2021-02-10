package week14d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void createStudentTest() {
        Student s = new Student("John");
        assertEquals("John", s.getName());
        assertEquals(0, s.getSubjectAndMarks().size());
    }

    @Test
    void addMarkToSubject() {
        Student s = new Student("John");
        s.addMarkToSubject("math", 5);
        assertEquals(5, s.getSubjectAndMarks().get("math").get(0));
        assertEquals(1, s.getSubjectAndMarks().size());

        s.addMarkToSubject("math", 4);
        assertEquals(2, s.getSubjectAndMarks().get("math").size());

        s.addMarkToSubject("biology", 4);
        assertEquals(2, s.getSubjectAndMarks().size());
        assertEquals(4, s.getSubjectAndMarks().get("biology").get(0));
    }

    @Test
    void getName() {
    }
}