package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Teacher {
    private Path path;

    public Teacher(Path path) {
        this.path = path;
    }

    public int hoursPerWeekByTeacher(String name) {
        int numberOfHours = 0;
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                if (name.equals(line)) {
                    br.readLine();
                    br.readLine();
                    numberOfHours += Integer.parseInt(br.readLine());
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
        return numberOfHours;
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher(Path.of("src/main/resources/week13d03/beosztas.txt"));
        System.out.println(teacher.hoursPerWeekByTeacher("Szarvas Szamanta"));
    }
}