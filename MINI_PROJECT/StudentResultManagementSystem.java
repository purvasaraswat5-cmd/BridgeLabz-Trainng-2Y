import java.sql.*;
import java.util.*;
import java.sql.Connection;


class Student {
    private int studentId;
    private String name;
    private int courseId;
    private String email;

    public Student(int studentId, String name, int courseId, String email) {
        this.studentId = studentId;
        this.name = name;
        this.courseId = courseId;
        this.email = email;
    }

    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getCourseId() { return courseId; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return studentId + " | " + name + " | Course ID: " + courseId + " | " + email;
    }
}


class Course {
    private int courseId;
    private String courseName;
    private String duration;
    private double fees;

    public Course(int courseId, String courseName, String duration, double fees) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
        this.fees = fees;
    }

    public int getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }
    public String getDuration() { return duration; }
    public double getFees() { return fees; }

    @Override
    public String toString() {
        return courseId + " | " + courseName + " | " + duration + " | ₹" + fees;
    }
}


class Result {
    int s1, s2, s3;
    private int studentId;
    private int total;
    private String grade;

    public Result(int studentId, int s1, int s2, int s3) {
        this.studentId = studentId;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.total = s1 + s2 + s3;
        this.grade = calculateGrade();
    }

    private String calculateGrade() {
        if (total >= 250) return "A";
        else if (total >= 200) return "B";
        else return "C";
    }

    public int getStudentId() { return studentId; }
    public int getTotal() { return total; }
    public String getGrade() { return grade; }
}


class DatabaseManager {

    private static final String URL = "jdbc:mysql://localhost:3306/studentRecord";
    private static final String USER = "root";
    private static final String PASS = "Purva@0809";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    
    public static void insertCourse(Course c) {
        try (Connection con = getConnection()) {
            String q = "INSERT INTO course VALUES (?, ?, ?, ?)";
            java.sql.PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, c.getCourseId());
            ps.setString(2, c.getCourseName());
            ps.setString(3, c.getDuration());
            ps.setDouble(4, c.getFees());
            ps.executeUpdate();
            System.out.println("Course Added!");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

   
    public static void viewCourses() {
        try (Connection con = getConnection()) {
            String q = "SELECT * FROM course";
            java.sql.PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();

            System.out.println("\n--- Course List ---");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("courseId") + " | " +
                    rs.getString("courseName") + " | " +
                    rs.getString("duration") + " | ₹" +
                    rs.getDouble("fees")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

 
    public static void insertStudent(Student st) {
        try (Connection con = getConnection()) {
            String q = "INSERT INTO student VALUES (?, ?, ?, ?)";
            java.sql.PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, st.getStudentId());
            ps.setString(2, st.getName());
            ps.setInt(3, st.getCourseId());
            ps.setString(4, st.getEmail());
            ps.executeUpdate();
            System.out.println("Student Added!");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

   
    public static void insertResult(Result r) {
        try (Connection con = getConnection()) {
            String q = "INSERT INTO result VALUES (?, ?, ?, ?, ?, ?)";
            java.sql.PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, r.getStudentId());
            ps.setInt(2, r.s1);
            ps.setInt(3, r.s2);
            ps.setInt(4, r.s3);
            ps.setInt(5, r.getTotal());
            ps.setString(6, r.getGrade());
            ps.executeUpdate();
            System.out.println("Result Added!");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


public class StudentResultManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Student Result Management System =====");
            System.out.println("1. Add Course");
            System.out.println("2. View Courses");
            System.out.println("3. Add Student");
            System.out.println("4. Add Result");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Course ID: ");
                    int cid = sc.nextInt(); sc.nextLine();
                    System.out.print("Course Name: ");
                    String cname = sc.nextLine();
                    System.out.print("Duration: ");
                    String dur = sc.nextLine();
                    System.out.print("Fees: ");
                    double fees = sc.nextDouble();
                    DatabaseManager.insertCourse(new Course(cid, cname, dur, fees));
                    break;

                case 2:
                    DatabaseManager.viewCourses();
                    break;

                case 3:
                    System.out.print("Student ID: ");
                    int sid = sc.nextInt(); sc.nextLine();
                    System.out.print("Student Name: ");
                    String sname = sc.nextLine();
                    System.out.print("Course ID: ");
                    int scid = sc.nextInt(); sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    DatabaseManager.insertStudent(new Student(sid, sname, scid, email));
                    break;

                case 4:
                    System.out.print("Student ID: ");
                    int rsid = sc.nextInt();
                    System.out.print("Subject 1 Marks: ");
                    int s1 = sc.nextInt();
                    System.out.print("Subject 2 Marks: ");
                    int s2 = sc.nextInt();
                    System.out.print("Subject 3 Marks: ");
                    int s3 = sc.nextInt();
                    DatabaseManager.insertResult(new Result(rsid, s1, s2, s3));
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
