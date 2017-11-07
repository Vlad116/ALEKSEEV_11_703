package array_hw;

import java.util.Arrays;

public class EX15_B {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 8, 4, 3, 5, 4, 3, 1, 7, 2};
        int[] u = new int[a.length];
        int s = 100000000, t = 1, k = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] < a[i]) {
                k++;
            } else {
                u[k - 1]++;
                k = 1;
            }
        }
        if (a[a.length - 2] < a[a.length - 1]) {
            u[k - 1]++;
        } else {
            u[0]++;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(u));
    }
}