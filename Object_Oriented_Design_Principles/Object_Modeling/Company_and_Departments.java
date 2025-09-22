import java.util.*;

class Employee {
    String name;
    String designation;

    Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    void displayEmployee() {
        System.out.println("Employee: " + name + ", Designation: " + designation);
    }
}

class Department {
    String deptName;
    List<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    void addEmployee(String name, String designation) {
        employees.add(new Employee(name, designation));
    }

    void displayDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}

class Company {
    String companyName;
    List<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void displayCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.displayDepartment();
        }
    }

    public static void main(String[] args) {
        Company comp = new Company("TechCorp");

        Department d1 = new Department("IT");
        d1.addEmployee("Alice", "Developer");
        d1.addEmployee("Bob", "Tester");

        Department d2 = new Department("HR");
        d2.addEmployee("Charlie", "HR Manager");

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.displayCompany();
    }
}
