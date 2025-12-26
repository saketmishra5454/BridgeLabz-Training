import java.util.Scanner;

public class MatrixOperation {

    // reads matrix input
    public static int[][] readMatrix(Scanner sc, int rows, int cols, String name) {

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter values for " + name + " (" + rows + "x" + cols + "):");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }

    // adds two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }

    // subtracts two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }

        return result;
    }

    // multiplies two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {

        int r1 = A.length;
        int c1 = A[0].length;
        int c2 = B[0].length;

        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    // prints matrix
    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input matrices
        int[][] A = readMatrix(sc, 2, 3, "Matrix A");
        int[][] B = readMatrix(sc, 3, 2, "Matrix B");

        System.out.println("Multiplication of A x B:");
        printMatrix(multiplyMatrices(A, B));

        sc.close();
    }
}
