package Methods;
import java.util.Random;
import java.util.Scanner;
public class MatrixOperations2 {
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static int determinant2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix is not 2x2.");
        }
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    public static int determinant3x3(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix is not 3x3.");
        }
        int a = matrix[0][0], b = matrix[0][1], c = matrix[0][2];
        int det = a * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - b * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + c * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return det;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns for a random matrix:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] randomMatrix = createRandomMatrix(rows, cols);
        System.out.println("Random Matrix:");
        printMatrix(randomMatrix);

        System.out.println("\nTranspose of Matrix:");
        int[][] transpose = transposeMatrix(randomMatrix);
        printMatrix(transpose);

        if (rows == 2 && cols == 2) {
            System.out.println("\nDeterminant of 2x2 Matrix: " + determinant2x2(randomMatrix));
        } else if (rows == 3 && cols == 3) {
            System.out.println("\nDeterminant of 3x3 Matrix: " + determinant3x3(randomMatrix));
        } else {
            System.out.println("\nDeterminant calculation only supported for 2x2 or 3x3 matrices.");
        }

        sc.close();
    }
}