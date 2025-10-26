import college.student.Student;
import college.faculty.Faculty;

public class MainApp {
    public static void main(String[] args) {
        Student student = new Student("Ravi Kumar", 101);
        Faculty faculty = new Faculty("Dr. Sharma", "Computer Science");

        student.displayDetails();
        System.out.println();
        faculty.displayDetails();
    }
}
