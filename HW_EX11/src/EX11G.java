import java.util.Scanner;
public class EX11G {
    public static void main(String[] args) {
        System.out.println("Введите число i (i >= 0):");
        Scanner in = new Scanner(System.in);
        int i, k = 1;
        double v; // v - произведение
        if (in.hasNextInt()) {
            i = in.nextInt();
            double sn = Math.sin(1);
            double cs = Math.cos(1);
            v = sn / cs;
            while (k < i){
                k++;
                sn = sn * Math.sin(k);
                cs = cs * Math.cos(k);
                v = sn / cs;
            }
            System.out.println(v);
        } else {
            System.out.println("Вы ввели не число!");
        }
    }
}