public class ex5b {
    static final double pi = 3.1415926;
    static final double e = 0.0001;
    public static void main(String[]args) {
        double S = 1;
        int k = 1;
        int p = -1;
        while (Math.abs(S - pi/4) >= e){//1 схема обрыва ИП
            k++;
            S = S + (double)p /((2 * k) - 1.0);
            p = -p;
        }
        System.out.println(k);
    }
}

