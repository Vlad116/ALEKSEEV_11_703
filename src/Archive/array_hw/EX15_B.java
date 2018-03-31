package Archive.array_hw;

import java.util.Arrays;

public class EX15_B {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 8, 4, 3, 5, 4, 3, 1, 7, 3};
        int[] u = new int[a.length];
        int s = a.length, t = 1, k = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] < a[i]) {
                k++;
            } else {
                u[k - 1]++;
                k = 1;
            }
        }
            u[k - 1]++;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(u));
    }
}
