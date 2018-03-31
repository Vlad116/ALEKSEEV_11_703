package Archive;

public class EX7 {
    static final double pi = 3.1415926;
    static final double e = 0.0001;
    public static void main(String[]args) {
        double R = 1;
        int k = 0;
        while (Math.abs(R - pi/2) >= e){// 1 схема обрыва ИП
            k++;
            R *= (( 4.0 * (k * k))/(4.0 * (k * k) - 1.0));
        }
        System.out.println(k - 1);
    }
}
