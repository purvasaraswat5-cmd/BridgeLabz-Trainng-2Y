class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    void display() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    String team;

    Manager(String employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    void displayManager() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + getSalary() + ", Team: " + team);
    }

    public static void main(String[] args) {
        Manager m = new Manager("E101", "IT", 75000, "Development");
        m.displayManager();
        m.setSalary(80000);
        m.displayManager();
    }
}
