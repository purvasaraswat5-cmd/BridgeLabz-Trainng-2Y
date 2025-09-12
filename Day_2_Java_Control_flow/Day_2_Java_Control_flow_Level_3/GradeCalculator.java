import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("Enter marks in Maths: ");
        int maths = scanner.nextInt();

        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        System.out.printf("Average Mark: %.2f\n", percentage);

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}
