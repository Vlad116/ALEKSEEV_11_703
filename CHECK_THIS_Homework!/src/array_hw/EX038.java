package array_hw;

//Приводим матрицу n x n к треугольному виду (НЕДОДЕЛАНО)
public class EX038 {
    public static void main(String[] args) {
        int[][] matrix = {{3, 2, 3, 4},
                {4, 4, 3, 2},
                {1, 4, 4, 3},
                {2, 3, 1, 1}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                double kf = matrix[j][i] / matrix[i][i];
                for (int k = i; k < matrix.length - 1; k++) {
                    matrix[j][k] -= matrix[i][k] * kf;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
