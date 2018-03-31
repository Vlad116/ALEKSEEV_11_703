package Archive.array_hw;

import java.util.Arrays;

public class EX13_4 {
    public static void main(String[] args) {
        int[] x = {2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7};
        int[] u = new int[x.length];
        int l = 1, j = 0;
        for (int i = 1; i < x.length; i++) {
            if (x[i] == x[i - 1]) {
                l++;
            } else {
                u[j] = l;
                l = 1;
                j++;
            }
        }
        u[j] = l;
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(u));
    }
}