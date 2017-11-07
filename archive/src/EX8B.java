
public class EX8B {
    public static void main(String[] args) {
        int[] a = {1, 0, 1, 0, 0, 1, 0, 0, 0, 0};
        int[] b = {1, 0, 1, 0, 1, 1, 0, 0, 0, 1};
        boolean f = true;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        for (int i = 0; (i < b.length) && (f == true); i++) {
            if (a[i] <= b[i]) {
                f = true;
            } else {
                f = false;
            }
        }
        System.out.println("Множество Т1 принадлежит или равно множеству T2 = " + f);
    }
}