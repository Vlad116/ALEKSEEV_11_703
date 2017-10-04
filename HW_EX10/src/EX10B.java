import java.util.Scanner;

public class EX10B {
        public static void main(String[]args){
            System.out.println("Введите числа к(k >= 0) и x: ");
            double S;
            int k,x,m = 0,fct = 1;
            Scanner in = new Scanner(System.in);
            Scanner sn = new Scanner(System.in);
            if ((in.hasNextInt())&(sn.hasNextInt())){
                k = in.nextInt();
                x = sn.nextInt();
                S = x;
                int    st = 1;
                int    p = -1;
                while (m < k) {
                    m++;
                    fct = (2 * m) * (2 * m - 1) * fct;
                    st *= x * x * x * x;
                    S = S + ((1.0 * st) / (fct * (4 * m + 1))) * p;
                    p = -p;
                }
                System.out.println(S);
            } else {
                System.out.println("Вы ввели не число!");
            }
        }
     }
