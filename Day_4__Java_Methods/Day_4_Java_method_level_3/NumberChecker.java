import java.util.*;

public class NumberChecker {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] digitsArray(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int n) {
        int[] arr = digitsArray(n);
        int[] rev = reverseArray(arr);
        return arraysEqual(arr, rev);
    }

    public static boolean isDuckNumber(int n) {
        int[] arr = digitsArray(n);
        for (int d : arr) if (d == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int num = 1221;
        int[] digits = digitsArray(num);
        System.out.println("Count of digits: " + countDigits(num));
        System.out.println("Digits array: " + Arrays.toString(digits));
        int[] rev = reverseArray(digits);
        System.out.println("Reversed array: " + Arrays.toString(rev));
        System.out.println("Arrays Equal: " + arraysEqual(digits, rev));
        System.out.println("Palindrome: " + isPalindrome(num));
        System.out.println("Duck Number: " + isDuckNumber(num));
    }
}
