import java.util.Scanner;

public class Matrices {

    // reads matrix values from user
    static int[][] readMatrix(int r, int c, Scanner sc) {

        int[][] matrix = new int[r][c];

        System.out.println("Enter elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }

    // finds transpose of a matrix
    static int[][] transpose(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        int[][] transposed = new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    // determinant for 2x2 matrix
    static int determinant2x2(int[][] m) {

        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // determinant for 3x3 matrix
    static int determinant3x3(int[][] m) {

        int part1 = m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]);
        int part2 = m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]);
        int part3 = m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);

        return part1 - part2 + part3;
    }

    // prints matrix
    static void display(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input size of matrix
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        // reading matrix
        int[][] matrix = readMatrix(r, c, sc);

        System.out.println("Original Matrix:");
        display(matrix);

        System.out.println("Transpose:");
        display(transpose(matrix));

        // determinant check based on size
        if (r == 2 && c == 2) {
            System.out.println("Determinant 2x2: " + determinant2x2(matrix));
        }

        if (r == 3 && c == 3) {
            System.out.println("Determinant 3x3: " + determinant3x3(matrix));
        }

        sc.close();
    }
}
