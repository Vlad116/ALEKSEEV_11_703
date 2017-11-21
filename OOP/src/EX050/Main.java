package EX050;
// не доделал исправлю и залью завтра!
public class Main {
    public static void main(String[] args) {
        RationalFraction A = new RationalFraction();
        RationalFraction B = new RationalFraction(1,2);
        RationalFraction C = new RationalFraction(3,2);
        // readuce
        System.out.println(A.add(B).toString());
        A.add2(B);
        System.out.println(A.sub(B).toString());
        A.sub2(B);
        System.out.println(A.mult(B).toString());
        A.mult2(B);
        System.out.println(A.div(B).toString());
        A.div2(B);
        System.out.println(B.toString());
        System.out.println(B.value());
        System.out.println(A.equals(B));
        System.out.println(B.numberPart());
    }
}