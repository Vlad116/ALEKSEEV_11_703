package EX053;

import EX050.RationalFraction;

public class Main {
    public static void main(String[] args) {
        RationalFraction x = new RationalFraction(2, 3);
        RationalFraction y = new RationalFraction(5, 4);
        RationalFraction z = new RationalFraction(3, 5);
        RationalVector2D a = new RationalVector2D();
        RationalVector2D b = new RationalVector2D(x, y);
        RationalVector2D c = new RationalVector2D(x, z);
        System.out.println("Рациональный вектор с :");
        System.out.println(c.toString());
        System.out.println(b.add(c).toString());
        //System.out.println(b.length(b));
        //System.out.println(a.scalarProduct(a,b));
        System.out.println(c.equals(b));
    }
}