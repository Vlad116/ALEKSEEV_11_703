public class merger {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 10, 11, 12, 13};
        int[] b = {1, 2, 6, 7, 8};
        int[] c = new int[a.length + b.length];
        int k, j, l;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        k = 0;
        j = 0;
        l = 0;
        while (k < a.length && j < b.length) {
            if (a[k] < b[j]) {
                c[l] = a[k];
                k++;
            } else {
                c[l] = b[j];
                j++;
            }
            l++;
        }
        if (k == a.length) {
            for (int i = j; i < b.length; i++) {
                c[l] = b[i];
                l++;
            }
        } else {
            for (int i = k; i < a.length; i++) {
                c[l] = a[i];
                l++;
            }
        }
        System.out.println();
        for (int x : c) {
            System.out.print(x + " ");
        }
    }
}
