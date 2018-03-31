package Archive.EX050;

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

    public void reduce() {
        for (int i = 1; i <= Math.abs(x); i++) {
            if (x % i == 0) {
                if (y % i == 0) {
                    this.x /= i;
                    this.y /= i;
                }
            }
        }
    }

    public RationalFraction add(RationalFraction a) {
        RationalFraction c = new RationalFraction((this.x * a.y + a.x * this.y), (this.y * a.y));
        c.reduce();
        return c;
    }

    public void add2(RationalFraction a) {
        this.x = this.x * a.y + a.x * this.y;
        this.y *= a.y;
        this.reduce();
    }

    public RationalFraction sub(RationalFraction a) {
        RationalFraction c = new RationalFraction((this.x * a.y - a.x * this.y), (this.y * a.y));
        c.reduce();
        return c;
    }

    public void sub2(RationalFraction a) {
        this.x = this.x * a.y - a.x * this.y;
        this.y *= a.y;
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
        this.reduce();
    }

    public RationalFraction div(RationalFraction a) {
        RationalFraction c = new RationalFraction((this.x * a.y), (this.y * a.x));
        c.reduce();
        return c;
    }

    public void div2(RationalFraction a) {
        this.x = this.x * a.y;
        this.y = this.y * a.x;
        this.reduce();
    }

    @Override
    public String toString() {
        return x + "/" + y;
    }

    public double value() {
        return (double) this.x / this.y;
    }

    public boolean eguals(RationalFraction a) {
        this.reduce();
        a.reduce();
        return (this.x == a.x) && (this.y == a.y) && (this.value() == a.value());
    }

    public int numberPart() {
        return this.x / this.y;
    }
}