package MassiveTask;

public class Task1 {
    public static void main(String[] args) {
        int[][] M = {{9, 3, 6, 3, 4, 4},
                     {8, 3, 4, 2, 1, 5},
                     {7, 3, 2, 2, 4, 5},
                     {4, 2, 2, 3, 1, 4},
                     {3, 2, 5, 8, 9, 4},
                     {0, 0, 0, 0, 0, 0}};
        int[] B = {6, 3, 1, 6, 3, 7};
        int[][] N = Finding(M, B);
        ShowMatrix(N);
    }

    private static int[][] Finding(int[][] a, int[] b) {
        for (int i = 0; i < a.length; i++) {   //You can set the flag to no longer search
            if ((b[0] < a[i][0]) && (b[0] >= a[i + 1][0])) {
                for (int j = a.length - 1; j > i + 1; j--) {
                    for (int k = 0; k < a[0].length; k++) {
                        a[j][k] = a[j - 1][k];
                    }
                }
                for (int n = 0; n < a[i + 1].length; n++) {
                    a[i + 1][n] = b[n];
                }
            }
        }
        return a;
    }

    private static void ShowMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
