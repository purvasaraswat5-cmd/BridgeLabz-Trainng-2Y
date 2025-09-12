import java.util.*;

public class NumberChecker1 {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] digitsArray(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static boolean isDuckNumber(int n) {
        int[] arr = digitsArray(n);
        for (int d : arr) if (d == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int n) {
        int[] arr = digitsArray(n);
        int power = arr.length;
        int sum = 0;
        for (int d : arr) sum += Math.pow(d, power);
        return sum == n;
    }

    public static int[] largestAndSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : arr) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    public static int[] smallestAndSecondSmallest(int[] arr) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : arr) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println("Count of digits: " + countDigits(num));
        int[] digits = digitsArray(num);
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Duck Number: " + isDuckNumber(num));
        System.out.println("Armstrong Number: " + isArmstrong(num));
        int[] largest = largestAndSecondLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);
        int[] smallest = smallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}
