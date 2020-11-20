package intromethods;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee=new Employee("Kiss Péter",1975,200000);
        System.out.println(employee.toString());
        employee.setName("Nagy Ákos");
        System.out.println(employee.toString());
        employee.raiseSalary(100000);
        System.out.println(employee.toString());
        System.out.println(employee);
        System.out.println("Name: "+employee.getName());
        System.out.println("Hiring Year: "+employee.getHiringYear());
    }
}
