package timesheet;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Company {

    private final InputStream employeesFile;
    private final InputStream projectsFile;
    private List<Employee> employees = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();
    private List<TimeSheetItem> timeSheetItems = new ArrayList<>();

    public Company(InputStream employeesFile, InputStream projectsFile) {
        this.employeesFile = employeesFile;
        this.projectsFile = projectsFile;
        addEmployee();
        addProject();
    }

    public void addTimeSheetItem(Employee employee, Project project, LocalDateTime beginDate, LocalDateTime endDate) {

        timeSheetItems.add(new TimeSheetItem(employee, project, beginDate, endDate));

    }

    public List<ReportLine> calculateProjectByNameYearMonth(String employeeName, int year, int month) {
        if (!isEmployeeName(employeeName)) {
            throw new IllegalArgumentException("Wrong name");
        }
        List<ReportLine> calculator = new ArrayList<>();
        long[] tmp = new long[projects.size()];
        for (TimeSheetItem item : timeSheetItems) {
            if (employeeName.equals(item.getEmployee().getName()) && item.getBeginDate().getYear() == year &&
                    item.getBeginDate().getMonthValue() == month) {

                for (int i = 0; i < projects.size(); i++) {
                    if (item.getProject().getName().equals(projects.get(i).getName())) {
                        tmp[i] += item.hoursBetweenDates();
                    }
                }
            }

        }

        for (int i = 0; i < projects.size(); i++) {
            calculator.add(new ReportLine(projects.get(i), tmp[i]));
        }
        return calculator;

    }

    public boolean isEmployeeName(String employeeName) {
        List<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        if (names.contains(employeeName)) {
            return true;
        } else {
            return false;
        }
    }

    public void printToFile(String employeeName, int year, int month, Path file) {

        try {
            String firstLine;
            firstLine = employeeName + "\t" + year + "-" + String.format("%02d", month) + "\t" + calculateAllProjectsFullTime(employeeName, year, month);
            Files.writeString(file, firstLine + "\n");
            String solvedProject = "";
            for (int i = 0; i < projects.size(); i++) {
                if (calculateProjectByNameYearMonth(employeeName, year, month).get(i).getTime() != 0) {
                    solvedProject = calculateProjectByNameYearMonth(employeeName, year, month).get(i).getProject().getName() + "\t" + calculateProjectByNameYearMonth(employeeName, year, month).get(i).getTime();
                    Files.writeString(file, solvedProject + "\n", StandardOpenOption.APPEND);
                }
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot open file", ioe);
        }
    }


    public long calculateAllProjectsFullTime(String employeeName, int year, int month) {
        long sum = 0;
        for (int i = 0; i < projects.size(); i++) {
            sum += calculateProjectByNameYearMonth(employeeName, year, month).get(i).getTime();
        }
        return sum;
    }


    public void addEmployee() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(employeesFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tmp = line.split(" ");
                employees.add(new Employee(tmp[0], tmp[1]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public List<Employee> getEmployees() {

        return employees;
    }

    public void addProject() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(projectsFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                projects.add(new Project(line));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not open file", ioe);
        }
    }

    public List<Project> getProjects() {

        return projects;

    }

    public static void main(String[] args) {
        Company company = new Company(
                Company.class.getResourceAsStream("employees.txt"),
                Company.class.getResourceAsStream("projects.txt"));

        System.out.println(company.getProjects().toString());

        System.out.println(company.getEmployees().toString());


    }


}
