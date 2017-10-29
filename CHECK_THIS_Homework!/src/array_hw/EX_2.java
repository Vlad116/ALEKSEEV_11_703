package array_hw;

public class EX_2 {
    public static void main(String[] args) {
        int[] a = {5, 1, 3, 2, 4, 6, 5, 7, 8, 9};
        int min = a[0], max = a[0], m = 0, n = 0, sum = 0, z, t;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                m = i;
            }
            if (a[i] < min) {
                min = a[i];
                n = i;
            }
        }
        if (m > n) {
            z = n;
            t = m;
        } else {
            z = m;
            t = n;
        }
        for (int i = z + 1; i < t; i++) {
            sum += a[i];
        }
        System.out.println("Сумма элементов между max и min = " + sum);
    }
}