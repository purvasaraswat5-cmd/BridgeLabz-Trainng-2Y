class Student {
    static String universityName = "GLA University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudent() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName + ", Name: " + name + ", Roll No: " + rollNumber + ", Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ravi", 1, "A");
        Student s2 = new Student("Priya", 2, "B");
        s1.displayStudent();
        s2.displayStudent();
        Student.displayTotalStudents();
    }
}
