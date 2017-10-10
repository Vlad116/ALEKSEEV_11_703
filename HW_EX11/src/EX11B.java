import java.util.Scanner;
public class EX11B {
    public static void main(String[] args) {
        System.out.println("Введите число i (i >= 0):");
        Scanner in = new Scanner(System.in);
        int i,k = 0;
        double t;// t - сумма
        if (in.hasNextInt()) {
            i = in.nextInt();
            double cs = Math.cos(1);
            double sn = Math.sin(1);
            t = cs / sn;
            while (k < i){
                k++;
                cs = cs + Math.cos(k);
                sn = sn + Math.sin(k);
                t = cs / sn;
            }
            System.out.println(t);
        } else {
            System.out.println("Вы ввели не число!");
        }
    }
}
//Подозреваю , что не верно. Переделаю...