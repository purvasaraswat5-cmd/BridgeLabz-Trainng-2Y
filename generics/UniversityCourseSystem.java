import java.util.*;

abstract class CourseType {}
class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}
class ResearchCourse extends CourseType {}

class Course<T extends CourseType> {
    private String name;
    private T type;
    public Course(String name, T type) { this.name = name; this.type = type; }
    public String getName() { return name; }
}

public class UniversityCourseSystem {
    public static void printCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) System.out.println(c.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        List<CourseType> courses = Arrays.asList(new ExamCourse(), new ResearchCourse());
        printCourses(courses);
    }
}
