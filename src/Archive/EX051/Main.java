package Archive.EX051;

public class Main {
    public static void main(String[] args) {
        ComplexNumber A = new ComplexNumber();
        ComplexNumber B = new ComplexNumber(2, -3);
        ComplexNumber C = new ComplexNumber(1.5, 1);
        System.out.println(A.add(B).toString());
        A.add2(B);
        System.out.println(A.toString());
        System.out.println(B.sub(C).toString());
        B.sub2(C);
        System.out.println(B.toString());
        System.out.println(C.mult(B).toString());
        C.mult2(B);
        System.out.println(C.toString());
        System.out.println(B.div(C).toString());
        B.div2(C);
        System.out.println(B.toString());
        System.out.println("Модуль комплексного числа B = " + B.length());
        System.out.println("Аргумент комплексного числа С = " + C.arg());
        System.out.println(B.pow(3).toString());
        System.out.println(A.equals(B));
    }
}
