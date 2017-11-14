package array_hw;

import java.util.Arrays;

public class EX15_A {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 8, 4, 3, 5, 4, 3, 1, 7, 2};
        int s = 100000000, t = 1, l = 1;  // хватило бы s = a.length
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i - 1] < a[i]) {
                l++;
            } else {
                l = 1;
            }
            if (l > t) {
                t = l;
            } else if (l < s) {
                s = l;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Длина самой короткой из неубывающих цепочек (s) = " + s);
        System.out.println("Длина самой длинной из неубывающих цепочек (t) = " + t);
    }
}
