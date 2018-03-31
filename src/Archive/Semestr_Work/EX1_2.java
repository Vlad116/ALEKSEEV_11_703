package Archive.Semestr_Work;
// к д к
public class EX1_2 {
    public static void main(String[] args) {
        int n = 32, m = 6;
        int[] f = new int[m];
        double h = 2.0, zi;
        double z0 = -0.06;
        double z1 = -3.50;
        double z2;
        for (int i = 0; i < n; i++) {
            z2 = 0.8 + 2 * Math.sin(z0) - 5.5 * Math.sin(z1) * Math.sin(z1);
            z0 = z1;
            z1 = z2;
            for (int j = 1; j <= m; j++) {
                zi = (z2 + 1.5) * (z2 + 1.5);
                if ((zi < j * h) && (zi >= (j - 1) * h)) {
                    f[j - 1]++;
                }
            }
        }
        for (int j = 0; j < m; j++) {
            System.out.print(f[j] + ", ");
        }
    }
}