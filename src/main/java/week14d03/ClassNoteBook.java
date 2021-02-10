package week14d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassNoteBook {
    private List<Student> students;

    public ClassNoteBook(List<Student> students) {
        this.students = students;
    }

    public List<Student> sortNoteBook() {
        List<Student> sortedList = new ArrayList<>();
        for (Student s : students) {
            sortedList.add(new Student(s));
        }
        Collections.sort(sortedList);
        return sortedList;
    }

    public List<Student> getStudents() {
        return students;
    }

    public static void main(String[] args) {
        ClassNoteBook cnb = new ClassNoteBook(List.of(new Student("John"),
                new Student("Bill"), new Student("Jane")));
        System.out.println(cnb.sortNoteBook());
        System.out.println(cnb.getStudents());
        cnb.sortNoteBook().get(1).addMarkToSubject("math", 5);
        System.out.println(cnb.getStudents());
    }
}
