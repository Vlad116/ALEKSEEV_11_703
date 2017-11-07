package Classwork_and_homework_18october;

public class EX13A {
    public static void main(String[] args) {
        int[] x = {2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7};
        int s = 1;
        for (int i = 0; i < x.length - 1; i++){
            if (x[i] != x[i+1]){
                s++;
            }
        }
     System.out.println(s);
    }
}
