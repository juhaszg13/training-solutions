package week14d03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student implements Comparable<Student> {
    private String name;
    private Map<String, List<Integer>> subjectAndMarks = new HashMap<>();

    public Student(String name) {

        this.name = name;
    }

    public Student(Student s) {
        name = s.name;
        subjectAndMarks = new HashMap<>(s.subjectAndMarks);
    }

    public void addMarkToSubject(String subject, int mark) {
        if (!subjectAndMarks.containsKey(subject)) {
            subjectAndMarks.put(subject, new ArrayList<>());

        }
        subjectAndMarks.get(subject).add(mark);
    }

    public String getName() {
        return name;
    }

    public Map<String, List<Integer>> getSubjectAndMarks() {
        return subjectAndMarks;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subjectAndMarks=" + subjectAndMarks +
                '}';
    }
}
