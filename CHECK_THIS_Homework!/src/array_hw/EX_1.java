package array_hw;

public class EX_1 {
    public static void main(String[] args) {
        int[] a = {12, 53, 5, 9, 8, 7, 5, 42, 5, 5};
        int min = a[0], u = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == min) {
                u++;
            }
            if (a[i] < min) {
                min = a[i];
                u = 1;
            }
        }
        System.out.print("кол-во элементов массива равных его минимальному элементу = " + u);
    }
}
