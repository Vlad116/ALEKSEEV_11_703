import java.util.Scanner;

public class EX10A {
    public static void main(String[]args){
        System.out.println("Введите числа к(k >= 0) и x: ");
        int k, x, m = 0,f = 1;
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
       if ((in.hasNextInt())&(sc.hasNextInt())){
            k = in.nextInt();
            x = sc.nextInt();
           double S = x;
           int    p = -1;
           int    st = 1;
           while (m < k) {
                m++;
                f *= m;
                st *= x * x;
                S = S + (( 1.0 * st) / (f * (2 * m + 1))) * p;
                p = -p;
            }
            System.out.println(S);
        } else {
            System.out.println("Вы ввели не число!");
        }
    }
}