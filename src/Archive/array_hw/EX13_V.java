package Archive.array_hw;

import java.util.Arrays;

public class EX13_V {
    public static void main(String[] args) {
        int[] x = {2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7};
        int[] v = new int[x.length];
        int l = 1;
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] == x[i + 1]) {
                l++;
            } else {
                v[l - 1]++;
                l = 1;
            }
        }
        v[l - 1]++;
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(v));
    }
}

