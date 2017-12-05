package EX053;

import EX050.RationalFraction;

public class RationalVector2D {
    private RationalFraction x;
    private RationalFraction y;

    RationalVector2D() {
        x = new RationalFraction();
        y = new RationalFraction();
    }

    RationalVector2D(RationalFraction x, RationalFraction y) {
        this.x = x;
        this.y = y;
    }

    RationalVector2D add(RationalVector2D rationalVector2D) {
        RationalFraction a = this.x.add(rationalVector2D.x);
        RationalFraction b = this.y.add(rationalVector2D.y);
        RationalVector2D summ = new RationalVector2D(a, b);
        return summ;
    }

    @Override
    public String toString() {
        return "RationalVector2D: " + "x = " + x + ", y = " + y;
    }

    public double length() {
        return Math.sqrt(x.mult(x).add(y.mult(y)).value());
    }

    public boolean equals(RationalVector2D a) {
        return this.x.eguals(a.x) && this.y.eguals(a.y);
    }
}