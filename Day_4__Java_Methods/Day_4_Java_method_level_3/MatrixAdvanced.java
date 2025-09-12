import java.util.*;

public class MatrixAdvanced {
    public static double[][] createMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }
        return matrix;
    }

    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        double[][] trans = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                trans[j][i] = matrix[i][j];
        return trans;
    }

    public static double determinant(double[][] matrix) {
        int n = matrix.length;
        if (n == 1) return matrix[0][0];
        if (n == 2) return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
        double det = 0;
        for (int col = 0; col < n; col++) {
            det += Math.pow(-1, col) * matrix[0][col] * determinant(minor(matrix, 0, col));
        }
        return det;
    }

    public static double[][] minor(double[][] matrix, int row, int col) {
        int n = matrix.length;
        double[][] result = new double[n-1][n-1];
        int r = 0;
        for (int i = 0; i < n; i++) {
            if (i == row) continue;
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (j == col) continue;
                result[r][c++] = matrix[i][j];
            }
            r++;
        }
        return result;
    }

    public static double[][] inverse(double[][] matrix) {
        int n = matrix.length;
        double det = determinant(matrix);
        if (det == 0) return null;
        double[][] adj = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[j][i] = Math.pow(-1, i+j) * determinant(minor(matrix, i, j));
            }
        }
        double[][] inv = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                inv[i][j] = adj[i][j] / det;
        return inv;
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) System.out.printf("%8.2f", val);
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[][] A = createMatrix(3, 3);
        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("Transpose:");
        printMatrix(transpose(A));
        System.out.println("Determinant: " + determinant(A));
        double[][] inv = inverse(A);
        if (inv != null) {
            System.out.println("Inverse:");
            printMatrix(inv);
        } else {
            System.out.println("Inverse does not exist (determinant = 0)");
        }
    }
}
