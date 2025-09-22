import java.util.*;

class Subject {
    String name;
    int marks;

    Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Student {
    String name;
    int rollNo;
    List<Subject> subjects;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.subjects = new ArrayList<>();
    }

    void addSubject(Subject subject) {
        subjects.add(subject);
    }

    List<Subject> getSubjects() {
        return subjects;
    }

    void requestGrade(GradeCalculator calculator) {
        String grade = calculator.calculateGrade(this);
        System.out.println("Student: " + name + ", Grade: " + grade);
    }
}

class GradeCalculator {
    String calculateGrade(Student student) {
        int total = 0;
        for (Subject s : student.getSubjects()) {
            total += s.marks;
        }
        double avg = total / (double) student.getSubjects().size();
        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 50) return "C";
        else return "D";
    }
}

public class SchoolResultsApp {
    public static void main(String[] args) {
        Student s1 = new Student("John", 101);
        Subject sub1 = new Subject("Maths", 90);
        Subject sub2 = new Subject("Science", 85);
        s1.addSubject(sub1);
        s1.addSubject(sub2);
        GradeCalculator gc = new GradeCalculator();
        s1.requestGrade(gc);
    }
}
