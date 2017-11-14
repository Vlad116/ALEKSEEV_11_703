package array_hw;

import java.util.Arrays;

public class EX13_4 {
    public static void main(String[] args) {
        int[] x = {2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7};
        int[] u = new int[x.length];
        int l = 1, j = 0;
        for (int i = 1; i < x.length; i++) {
            if (x[i] == x[i - 1]) {
                l++;
            }
            if (x[i] != x[i - 1]) {   //почему проверки независимые?
                u[j] = l;
                l = 1;
                j++;
            }
            if (i == x.length - 1) {
                if (x[i] == x[i - 1]) {
                    u[j] = l;
                } else {
                    u[j] = l;       //вы не видите бессмысленность этих проверок? i у вас очевидно достигло x.length - 1,
                    //иначе вы бы не вышли из цикла. u[j] = l выполняется независимо от вашего условия. Зачем городить огород?
                }
            }
        }
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(u));
    }
}
