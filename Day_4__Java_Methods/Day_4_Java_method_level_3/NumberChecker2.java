import java.util.*;

public class NumberChecker2 {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] digitsArray(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static int sumOfDigits(int[] arr) {
        int sum = 0;
        for (int d : arr) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int d : arr) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int n) {
        int[] arr = digitsArray(n);
        int sum = sumOfDigits(arr);
        return n % sum == 0;
    }

    public static int[][] digitFrequency(int[] arr) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int d : arr) freq[d][1]++;
        return freq;
    }

    public static void main(String[] args) {
        int num = 1729;
        int[] digits = digitsArray(num);
        System.out.println("Count of digits: " + countDigits(num));
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Harshad Number: " + isHarshad(num));
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println(freq[i][0] + " -> " + freq[i][1]);
            }
        }
    }
}
