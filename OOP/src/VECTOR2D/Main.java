package VECTOR2D;

public class Main {
    public static void main(String[] args) {
        Vector2D v = new Vector2D();
        Vector2D vect = new Vector2D(2.0, 4.0);
        Vector2D vect2 = new Vector2D(3.0, 5.0);
        System.out.println(v.add(vect, vect2).toString());
        v.add2(vect);// v = 0,0 + vect = 2.0 , 4.0
        System.out.println(v.sub(vect, vect2).toString());
        v.sub2(vect);// v = 2.0 , 4.0 - vect = 2.0, 4.0
        System.out.println(v.mult(vect, 2.0).toString());
        vect.mult2(2.0);// vect = 2.0 , 4.0 * 2 = 4.0 , 8.0
        System.out.println(vect.length(vect));
        System.out.println(vect.scalarProduct(vect, vect2));
        System.out.println(vect.cos(vect, vect2));
        System.out.println(vect.toString());
        System.out.println(vect.equals(vect2));
    }
}