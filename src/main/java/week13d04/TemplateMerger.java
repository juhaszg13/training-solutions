package week13d04;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TemplateMerger {

    public String merge(Path file, List<Employee> employees) {

        String template = loadFile(file);
        return createResult(template, employees);
    }

    private String loadFile(Path file) {
        String template;
        try (BufferedReader bufferedReader = Files.newBufferedReader(file)) {
            template = bufferedReader.readLine();
            return template;
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot open file", ioe);
        }
    }

    private String createResult(String template, List<Employee> employees) {
        StringBuilder sb = new StringBuilder();

        for (Employee employee : employees) {
            String line = createLine(template, employee);
            sb.append(line).append("\n");
        }

        return sb.toString();
    }

    private String createLine(String template, Employee employee) {
        String name = employee.getName();
        int yearOfBirth = employee.getYearOfBirth();
        String line = template.replace("{nev}", name).replace("{ev}", Integer.toString(yearOfBirth));
        return line;
    }

    public static void main(String[] args) {
        TemplateMerger tm=new TemplateMerger();
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Jane Doe",1976));
        employees.add(new Employee("Jack Doe",1975));
        Path path=Path.of("src/main/resources/week13d04/template.txt");
        System.out.println(tm.merge(path,employees));
    }
}
