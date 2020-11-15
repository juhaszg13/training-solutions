package debug.employees;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Clint Eastwood", 1931);
        Employee employee2 = new Employee("Jane Eastwood", 1933);
        Employee employee3 = new Employee("Peter Eastwood", 1935);

        Company company = new Company(new ArrayList<>());
        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);

        Employee clint = company.findEmployeeByName("Clint Eastwood");
        System.out.println(clint.getName() + " " + clint.getYearOfBirth());



        System.out.println(company.listEmployeeNames());

    }
}
