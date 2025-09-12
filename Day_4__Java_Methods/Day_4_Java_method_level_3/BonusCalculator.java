import java.util.*;

public class BonusCalculator {
    public static int[][] generateEmployeeData(int n) {
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 11);
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double bonusRate = data[i][1] > 5 ? 0.05 : 0.02;
            double bonus = data[i][0] * bonusRate;
            double newSalary = data[i][0] + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    public static void displayResults(int[][] data, double[][] result) {
        double sumOld = 0, sumNew = 0, sumBonus = 0;
        System.out.printf("%-5s %-10s %-10s %-10s %-10s%n", "Emp", "Salary", "Years", "Bonus", "NewSalary");
        for (int i = 0; i < data.length; i++) {
            sumOld += data[i][0];
            sumBonus += result[i][0];
            sumNew += result[i][1];
            System.out.printf("%-5d %-10d %-10d %-10.2f %-10.2f%n", 
                              i+1, data[i][0], data[i][1], result[i][0], result[i][1]);
        }
        System.out.println("------------------------------------------------------");
        System.out.printf("Total  %-10.2f %-10s %-10.2f %-10.2f%n", sumOld, "", sumBonus, sumNew);
    }

    public static void main(String[] args) {
        int[][] data = generateEmployeeData(10);
        double[][] result = calculateBonusAndNewSalary(data);
        displayResults(data, result);
    }
}
