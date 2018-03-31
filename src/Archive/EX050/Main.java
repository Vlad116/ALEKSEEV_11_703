package Archive.EX050;
public class Main {
    public static void main(String[] args) {
        RationalFraction A = new RationalFraction();
        RationalFraction B = new RationalFraction(1,2);
        RationalFraction C = new RationalFraction(4,2);
        System.out.println(C.toString());
        C.reduce();
        System.out.println(C.toString());
        System.out.println(C.add(B).toString());
        C.add2(B);
        System.out.println(C.toString());
        System.out.println(A.sub(B).toString());
        A.sub2(B);
        System.out.println(A.toString());
        System.out.println(A.mult(B).toString());
        A.mult2(B);
        System.out.println(A.toString());
        System.out.println(A.div(B).toString());
        A.div2(B);
        System.out.println(A.toString());
        System.out.println(B.value());
        System.out.println(A.equals(B));
        System.out.println(C.numberPart());
    }
}