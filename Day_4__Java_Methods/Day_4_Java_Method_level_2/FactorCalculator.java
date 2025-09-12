import java.util.Scanner;

public class FactorCalculator {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int num : factors) sum += num;
        return sum;
    }

    public static long productFactors(int[] factors) {
        long product = 1;
        for (int num : factors) product *= num;
        return product;
    }

    public static double sumOfSquares(int[] factors) {
        double sum = 0;
        for (int num : factors) sum += Math.pow(num, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] factors = findFactors(number);
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nSum: " + sumFactors(factors));
        System.out.println("Product: " + productFactors(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
    }
}
