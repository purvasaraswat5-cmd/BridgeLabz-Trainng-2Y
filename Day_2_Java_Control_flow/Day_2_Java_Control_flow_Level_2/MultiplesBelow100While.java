import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number less than 100: ");
        int number = scanner.nextInt();
        if (number > 0 && number < 100) {
            int counter = 1;
            while (counter < 100) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        } else {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}
