import java.util.*;
public class CourseRegistrationSystem1 {
    public static void main(String[] args) {
        Map<String,Integer> course = new HashMap<>();

        course.put("CS101",45);
        course.put("CS102",5);
        course.put("CS103",52);
        course.put("CS104",2);
        course.put("CS105",60);

        course.put("CS102", course.get("CS102") + 3);
        course.put("CS104", Math.max(0, course.get("CS104") - 1));

        for (String k : course.keySet())
            if (course.get(k) >= 50) System.out.println(k);

        for (String k : course.keySet())
            if (course.get(k) < 5) System.out.println(k);
    }
}
