import java.util.*;

abstract class JobRole {}
class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}
class ProductManager extends JobRole {}

class Resume<T extends JobRole> {
    private T role;
    public Resume(T role) { this.role = role; }
    public T getRole() { return role; }
}

public class ResumeScreeningSystem {
    public static void processResumes(List<? extends JobRole> roles) {
        for (JobRole r : roles) System.out.println("Processing: " + r.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        List<JobRole> roles = Arrays.asList(new SoftwareEngineer(), new DataScientist());
        processResumes(roles);
    }
}
