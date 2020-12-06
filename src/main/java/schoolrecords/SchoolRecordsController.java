package schoolrecords;

import java.util.*;

public class SchoolRecordsController {
    public void printMenu() {
        System.out.println("    1. Diákok nevének listázása\n" +
                "    2. Diák név alapján keresése\n" +
                "    3. Diák létrehozása\n" +
                "    4. Diák név alapján törlése\n" +
                "    5. Diák feleltetése\n" +
                "    6. Osztályátlag kiszámolása\n" +
                "    7. Tantárgyi átlag kiszámolása\n" +
                "    8. Diákok átlagának megjelenítése\n" +
                "    9. Diák átlagának kiírása\n" +
                "    10. Diák tantárgyhoz tartozó átlagának kiírása\n" +
                "    11. Kilépés");
    }


    public static void main(String[] args) {
        ClassRecords classRecords;
        Tutor tutor = new Tutor("Nagy Csilla",
                Arrays.asList(new Subject("földrajz"),
                        new Subject("matematika"),
                        new Subject("biológia"),
                        new Subject("zene"),
                        new Subject("fizika"),
                        new Subject("kémia")));

        classRecords = new ClassRecords("Fourth Grade A", new Random(5));
        Student firstStudent = new Student("Kovács Rita");
        Student secondStudent = new Student("Nagy Béla");
        Student thirdStudent = new Student("Varga Márton");
        firstStudent.grading(new Mark(MarkType.A, new Subject("földrajz"), tutor));
        firstStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        firstStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));
        secondStudent.grading(new Mark(MarkType.A, new Subject("biológia"), tutor));
        secondStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        secondStudent.grading(new Mark(MarkType.D, new Subject("zene"), tutor));
        thirdStudent.grading(new Mark(MarkType.A, new Subject("fizika"), tutor));
        thirdStudent.grading(new Mark(MarkType.C, new Subject("kémia"), tutor));
        thirdStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));
        classRecords.addStudent(firstStudent);
        classRecords.addStudent(secondStudent);
        classRecords.addStudent(thirdStudent);

        SchoolRecordsController schoolRecordsController = new SchoolRecordsController();
        Scanner scanner = new Scanner(System.in);

        int menuPoint;
        do {
            schoolRecordsController.printMenu();
            menuPoint = scanner.nextInt();
            scanner.nextLine();
            if (menuPoint == 1) {
                System.out.println(classRecords.listStudentNames());

            }
            if (menuPoint == 2) {
                System.out.println("Kérem a tanuló nevét!");
                String name = scanner.nextLine();
                System.out.println("Van ilyen tanuló: " + classRecords.findStudentByName(name).getName());
            }
            if (menuPoint == 3) {
                System.out.println("Kérem a diák nevét: ");
                String name = scanner.nextLine();
                if (classRecords.addStudent(new Student(name))) {
                    classRecords.addStudent(new Student(name));
                    System.out.println("Diák neve hozzáadva!");
                } else {
                    System.out.println("Van már ilyen nevű diák!");
                }
            }
            if (menuPoint == 4) {
                System.out.println("Kérem a diák nevét: ");
                String name = scanner.nextLine();
                if (classRecords.removeStudent(new Student(name))) {
                    classRecords.removeStudent(new Student(name));
                    System.out.println("Diák neve törölve!");
                } else {
                    System.out.println("Nincs ilyen név!");
                }
            }
            if (menuPoint == 5) {
                System.out.println("A következő diák fog felelni: " + classRecords.repetition().getName());
            }
            if (menuPoint == 6) {
                System.out.println(classRecords.calculateClassAverage());
            }
            if (menuPoint == 7) {
                System.out.println("A tantárgy neve: ");
                String subject = scanner.nextLine();
                System.out.println(classRecords.calculateClassAverageBySubject(new Subject(subject)));
            }
            if (menuPoint == 8) {
                List<StudyResultByName> studyResultByNames = classRecords.listStudyResults();
                for (int i = 0; i < studyResultByNames.size(); i++) {

                    System.out.println(studyResultByNames.get(i).getStudentName() + ": " + studyResultByNames.get(i).getStudyAverage());
                }
            }
            if (menuPoint == 9) {
                System.out.println("Kérem a diák nevét: ");
                String name = scanner.nextLine();
                Student student = classRecords.findStudentByName(name);
                System.out.println(student.calculateAverage());
            }
            if (menuPoint == 10) {
                System.out.println("Kérem a diák nevét: ");
                String name = scanner.nextLine();
                System.out.println("Kérem a tantárgy nevét: ");
                String subject = scanner.nextLine();
                Student student = classRecords.findStudentByName(name); ;
                System.out.println(student.calculateSubjectAverage(new Subject(subject)));
            }

        } while (menuPoint != 11);
    }
}
