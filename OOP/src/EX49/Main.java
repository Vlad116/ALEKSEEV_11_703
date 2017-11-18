package EX49;

public class Main {
    public static void main(String[] args) {
        Vector2D v = new Vector2D();
        Vector2D vect = new Vector2D(2.0, 4.0);
        Vector2D vect2 = new Vector2D(3.0, 5.0);
        v.add(vect, vect2);
        v.add2(vect);
        v.sub(vect, vect2);
        v.sub2(vect);
        vect.mult(vect, 2.0);
        vect.mult2(2.0);
        vect.length(vect);
        vect.scalarProduct(vect, vect2);
        vect.cos(vect, vect2);
        System.out.println(vect.toString());
        System.out.println(vect.equals(vect2));
    }
}