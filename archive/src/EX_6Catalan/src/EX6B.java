package EX_6Catalan.src;

public class EX6B {
    static final double e = 0.0001;
    public static void main(String[] args) {
        int n = 0,p = 1;
        double t = 1,s = 0;
        while (Math.abs(t) > e) {
            s += p * t;
            n++;
            t = 1.0 / ((2.0 * n + 1.0) * (2.0 * n + 1.0));
            p = -p;
        }
        System.out.println(s);
    }
}