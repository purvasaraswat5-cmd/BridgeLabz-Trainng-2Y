import java.util.*;

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + calculateSalary());
    }
}

interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateSalary() { return getBaseSalary(); }

    @Override
    public void assignDepartment(String deptName) { this.department = deptName; }

    @Override
    public String getDepartmentDetails() { return department; }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double ratePerHour;
    private String department;

    public PartTimeEmployee(int id, String name, double ratePerHour, int hoursWorked) {
        super(id, name, 0);
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() { return ratePerHour * hoursWorked; }

    @Override
    public void assignDepartment(String deptName) { this.department = deptName; }

    @Override
    public String getDepartmentDetails() { return department; }
}

public class EMSApp {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee e1 = new FullTimeEmployee(101, "Alice", 50000);
        Employee e2 = new PartTimeEmployee(102, "Bob", 200, 80);
        employees.add(e1);
        employees.add(e2);
        for (Employee e : employees) e.displayDetails();
    }
}
