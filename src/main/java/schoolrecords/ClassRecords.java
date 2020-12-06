package schoolrecords;

import java.util.*;

public class ClassRecords {
    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {

        this.className = className;
        this.rnd = rnd;
    }


    public boolean addStudent(Student student) {
        for (Student s : students) {
            if (student.getName().equals(s.getName())) {

                return false;
            }
        }
        students.add(student);
        return true;
    }

    public double calculateClassAverage() {
        if (students.size() == 0) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }

        double sum = 0;
        int j = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).calculateAverage() == 0) {
                throw new ArithmeticException("No marks present, average calculation aborted!");
            } else {
                sum += students.get(i).calculateAverage();
                j++;
            }
        }
        int x = (int) ((double) sum / j * 100);
        return x / 100.0;
    }

    public double calculateClassAverageBySubject(Subject subject) {
        double sum = 0;
        int j = 0;
        for (int i = 0; i < students.size(); i++) {
            double s = students.get(i).calculateSubjectAverage(subject);
            sum += s;
            if (s != 0) j++;
        }
        int x = (int) ((double) sum / j * 100);
        return x / 100.0;
    }

    public Student findStudentByName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.size() == 0) {
            throw new IllegalStateException("No students to search!");
        }
        for (Student student : students) {
            if (name.equals(student.getName())) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! "+name);
    }


    public String listStudentNames() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < students.size(); i++) {
            sb.append(students.get(i).getName() + ", ");

        }
        sb.delete(sb.length() - 2, sb.length() - 1);
        return sb.toString().trim();
    }


    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> resultByNames = new ArrayList<>();
       for(int i=0;i<students.size();i++){
           resultByNames.add(new StudyResultByName(students.get(i).getName(),students.get(i).calculateAverage()));
        }
        return resultByNames;
    }

    public boolean removeStudent(Student student) {
        for (Student s : students) {
            if (student.getName().equals(s.getName())) {
                students.remove(s);
                return true;
            }

        }
        return false;
    }


    public Student repetition() {
        if(students.size()==0){
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(rnd.nextInt(students.size()));

    }


    public String getClassName() {
        return className;
    }
}
