package PrePlacementTraning.DSaAssingnment6;

import java.util.Arrays;

public class Que7 {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int rowStart = 0, rowEnd = n - 1;
        int colStart = 0, colEnd = n - 1;

        while (num <= n * n) {
            // Fill top row
            for (int col = colStart; col <= colEnd; col++) {
                matrix[rowStart][col] = num++;
            }
            rowStart++;

            // Fill rightmost column
            for (int row = rowStart; row <= rowEnd; row++) {
                matrix[row][colEnd] = num++;
            }
            colEnd--;

            if (num <= n * n) {
                // Fill bottom row
                for (int col = colEnd; col >= colStart; col--) {
                    matrix[rowEnd][col] = num++;
                }
                rowEnd--;
            }

            if (num <= n * n) {
                // Fill leftmost column
                for (int row = rowEnd; row >= rowStart; row--) {
                    matrix[row][colStart] = num++;
                }
                colStart++;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = generateMatrix(n);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}

