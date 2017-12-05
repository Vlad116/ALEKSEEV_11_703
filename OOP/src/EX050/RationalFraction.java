package EX050;

import EX053.RationalVector2D;

public class RationalFraction {
    private int x;
    private int y;

    public RationalFraction() {
        x = 0;
        y = 1;
    }

    public RationalFraction(int a, int b) {
        this.x = a;
        this.y = b;
    }

<<<<<<< HEAD

    public void reduce() {
        for (int i = 1; i <= Math.abs(x); i++) {
            if (x % i == 0) {
                if (y % i == 0) {
                    this.x /= i;
                    this.y /= i;
                }
            }
        }
=======
    void reduce() {
        double c = this.x / this.y;   //very strange function
>>>>>>> 46823cc5730d41ce8e4bf4bb8ff0a437715cbba2
    }

    public RationalFraction add(RationalFraction a) {
        RationalFraction c = new RationalFraction((this.x + a.x), (this.y + a.y));
        c.reduce();
        return c;
    }

    public void add2(RationalFraction a) {
        this.x += a.x;
        this.y += a.y;
        this.reduce();
    }

    public RationalFraction sub(RationalFraction a) {
        RationalFraction c = new RationalFraction((this.x - a.x), (this.y - a.y));
        c.reduce();
        return c;
    }

    public void sub2(RationalFraction a) {
        this.x -= a.x;
        this.y -= a.y;
        this.reduce();
    }

    public RationalFraction mult(RationalFraction a) {
        RationalFraction c = new RationalFraction((this.x * a.x), (this.y * a.y));
        c.reduce();
        return c;
    }

    public void mult2(RationalFraction a) {
        this.x *= a.x;
        this.y *= a.y;
<<<<<<< HEAD
        this.reduce();
=======
        System.out.println(this.x + "/" + this.y);  //it's not a good idea, we get the code duplication
>>>>>>> 46823cc5730d41ce8e4bf4bb8ff0a437715cbba2
    }

    public RationalFraction div(RationalFraction a) {
        RationalFraction c = new RationalFraction((this.x * a.y), (this.y * a.x));
        c.reduce();
        return c;
    }

    public void div2(RationalFraction a) {
        this.x = this.x * a.y;
        this.y = this.y * a.x;
<<<<<<< HEAD
        this.reduce();
=======
        System.out.println(this.x + "/" + this.y);   //!
>>>>>>> 46823cc5730d41ce8e4bf4bb8ff0a437715cbba2
    }

    @Override
    public String toString() {
        return "RationalFraction = " + x + "/" + y;
    }

    public double value() {
        double z = this.x / this.y;
        return z;
    }

<<<<<<< HEAD
    public boolean eguals(RationalFraction a) {
        this.reduce();
        a.reduce();
        return (this.x == a.x) && (this.y == a.y) && (this.value() == a.value());
=======
    boolean eguals(RationalFraction a) {
        double z = this.x / this.y;
        double w = a.x / a.y;
        return z == w;       //This is wrong
>>>>>>> 46823cc5730d41ce8e4bf4bb8ff0a437715cbba2
    }

    public int numberPart() {
        int c = this.x / this.y;
        return c;
    }
}
