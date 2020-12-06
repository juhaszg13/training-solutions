package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String name) {
        if ("".equals(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }

        this.name = name;
    }

    public double calculateAverage() {
        int sum = 0;
        int j = 0;
        for (int m = 0; m < marks.size(); m++) {
            sum += marks.get(m).getMarkType().getValue();
            j++;
        }

        int x = (int) ((double) sum / j * 100);
        return x / 100.0;
    }

    public double calculateSubjectAverage(Subject subject) {
        int sum = 0;
        int j = 0;
        for (int m = 0; m < marks.size(); m++) {
            if (subject.getSubjectName().equals(marks.get(m).getSubject().getSubjectName())) {
                sum += marks.get(m).getMarkType().getValue();
                j++;
            }
        }

        int x = (int) ((double) sum / j * 100);
        return x / 100.0;
    }

    public void grading(Mark mark) {
        if(mark==null){
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    private boolean isEmpty(String str) {

        return true;
    }

    public String getName() {

        return name;
    }


    @Override
    public String toString() {
        int i = marks.size() - 1;
        return getName() + " marks: " + marks.get(i).getSubject().getSubjectName() + ": " + marks.get(i).getMarkType().getDescription() + "(" + marks.get(i).getMarkType().getValue() + ")";

    }
}
