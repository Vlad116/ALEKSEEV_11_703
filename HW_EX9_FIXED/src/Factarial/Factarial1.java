package Factarial;
import java.util.Scanner;
//нахождение фактариала...
public class Factarial1 {
    /*public static int fac(int x) {
        int fac = 1,k=1; // функция вычисления фактариала
        while (k < x){
            k++;
            fac *= k;}
        return fac;
}*/
    /*int m=2, k=1, n=0; // для (2k)!!
        if (in.hasNextInt()) {
            n = in.nextInt();
            while (k < n){
                k++;
                m *= k * 2;
            }
            System.out.println(m);*/
    /*private static int fct2k(int x) {
        int fct = 1, k = 1;// для (2К)!
        while (k < x) {
            k++;
            fct = (2 * k) * (2 * k - 1) * fct;
        }
        return fct;
    }*/
    public static void main(String[] args) {
        // m = n!
        System.out.println("Введите число n:");
        Scanner in = new Scanner(System.in);
        int m=1, k=1, n;
        if (in.hasNextInt()) {
            n = in.nextInt();
            while (k < n){
                k++;
                m *= k;
            }
            System.out.println(m);
        } else {
            System.out.println("Вы ввели не число!");
        }
    }
}