import java.util.Random;

public class RandomStats {
    public static int[] generate4DigitRandomArray(int size) {
        Random r = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + r.nextInt(9000);
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] nums = generate4DigitRandomArray(5);
        for (int n : nums) System.out.print(n + " ");
        System.out.println();
        double[] result = findAverageMinMax(nums);
        System.out.println("Average: " + result[0] + ", Min: " + result[1] + ", Max: " + result[2]);
    }
}
