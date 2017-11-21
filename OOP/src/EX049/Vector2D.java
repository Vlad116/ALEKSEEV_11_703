/**
 * @author Vladislav Alekseev
 * 11-703
 * 049
 */
package EX049;

public class Vector2D {
    double x;
    double y;

    Vector2D() {
        x = 0;
        y = 0;
    }

    Vector2D(double a, double b) {
        this.x = a;
        this.y = b;
    }

    public Vector2D add(Vector2D a, Vector2D b) {
        Vector2D summ = new Vector2D((a.x + b.x), (a.y + b.y));
        return summ;
    }

    public void add2(Vector2D b) {
        this.x += b.x;
        this.y += b.y;
        System.out.println(this.x + " " + this.y);
    }

    public Vector2D sub(Vector2D a, Vector2D b) {
        Vector2D c = new Vector2D((a.x - b.x), (a.y - b.y));
        return c;
    }


    public void sub2(Vector2D b) {
        this.x -= b.x;
        this.y -= b.y;
        System.out.println(this.x + " " + this.y);
    }

    public Vector2D mult(Vector2D a, double b) {
        Vector2D c = new Vector2D((a.x * b), (a.y * b));
        return c;
    }

    public void mult2(double b) {
        this.x *= b;
        this.y *= b;
        System.out.println(this.x + " " + this.y);
    }

    public String toString() {
        return "Vector2D{" +
                "x = " + x +
                ", y = " + y +
                '}';
    }

    public double length(Vector2D a) {
        return Math.sqrt(a.x * a.x + a.y * a.y);
    }

    public double scalarProduct(Vector2D a, Vector2D b) {
        return a.x * b.x + a.y * b.y;
    }

    public double cos(Vector2D a, Vector2D b) {
        return (scalarProduct(a, b) / (length(a) * length(b)));
    }

    public boolean equals(Vector2D a) {
        return this.x == a.x && this.y == a.y;
    }
}