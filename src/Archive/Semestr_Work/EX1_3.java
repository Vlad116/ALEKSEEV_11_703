package Archive.Semestr_Work;
// а к з з
public class EX1_3 {
    public static void main(String[] args) {
        int n = 13, j;
        double eps = 2.5,F;
        double[] A = new double[n];
        double[] B = new double[n];
        A[0] = 1.50;
        B[0] = -0.14;
        boolean f = false;
        for (int i = 1; i < n; i++) {
            A[i] = (1 - A[i - 1] / 1 + B[i - 1] * B[i - 1]) * Math.sin(A[i - 1] * A[i - 1] + A[i - 1] * B[i - 1] + 2);
            B[i] = 0.8 + 2 * Math.sin(B[i - 1]) - 5.5 * Math.sin(A[i - 1]) * Math.sin(A[i - 1]);
        }
        for (j = 1; j < n - 1; j++) {
            for (int i = 1; i < n && !f; i++) {
                F = A[j] * A[j] - B[i] * B[i];
                if (F < eps) {
                    f = true;
                }
            }
            if (f) {
                System.out.println(A[j]);
                f = false;
            }
        }
    }
}