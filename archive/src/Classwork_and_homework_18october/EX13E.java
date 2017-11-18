package Classwork_and_homework_18october;

public class EX13E {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 8, 9};
        int s = 0;
        if (x[0] != x[1])
            s++;
        if (x[x.length - 1] != x[x.length - 2]) {
            s++;
        }
        for (int i = 1; i < x.length - 2; i++) {
            if (x[i] != x[i + 1] && x[i] != x[i - 1]) {
                s++;
            }
        }
        System.out.println(s);
    }
}
