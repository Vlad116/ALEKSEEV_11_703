package Archive;

public class MaxMinMatrix {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {1, 2, 0},
                {3, 4, 1},
                {4, 3, 2}
        };

        int max = findMin(matrix[0]);
        for (int i = 1; i < matrix.length; i++) {
            int minI = findMin(matrix[i]);
            if (minI > max) {
                max = minI;
            }
        }
        System.out.println(max);
    }

    public static int findMin(int[] row) {
        int max = row[0];
        for (int i = 1; i < row.length; i++) {
            if (row[i] > max) {
                max = row[i];
            }
        }
        return max;
    }
}
