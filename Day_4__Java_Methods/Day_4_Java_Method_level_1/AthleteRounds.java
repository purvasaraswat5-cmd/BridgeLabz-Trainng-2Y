import java.util.Scanner;

public class AthleteRounds {
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000;
        return (int)Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 of triangle: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 of triangle: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 of triangle: ");
        double side3 = sc.nextDouble();

        int rounds = calculateRounds(side1, side2, side3);
        System.out.println("Number of rounds to complete 5 km: " + rounds);
    }
}
