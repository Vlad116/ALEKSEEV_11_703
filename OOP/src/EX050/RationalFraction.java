package EX050;

public class RationalFraction {
    int x;
    int y;

    RationalFraction() {
        x = 1;
        y = 1;
    }

    RationalFraction(int a, int b) {
        this.x = a;
        this.y = b;
    }

    void reduce() {
        double c = this.x / this.y;   //very strange function
    }

    RationalFraction add(RationalFraction a) {
        RationalFraction c = new RationalFraction((this.x + a.x), (this.y + a.y));
        return c;
    }

    void add2(RationalFraction a) {
        this.x += a.x;
        this.y += a.y;
        System.out.println(this.x + "/" + this.y);
    }

    RationalFraction sub(RationalFraction a) {
        RationalFraction c = new RationalFraction((this.x - a.x), (this.y - a.y));
        return c;
    }

    void sub2(RationalFraction a) {
        this.x -= a.x;
        this.y -= a.y;
        System.out.println(this.x + "/" + this.y);
    }

    RationalFraction mult(RationalFraction a) {
        RationalFraction c = new RationalFraction((this.x * a.x), (this.y * a.y));
        return c;
    }

    void mult2(RationalFraction a) {
        this.x *= a.x;
        this.y *= a.y;
        System.out.println(this.x + "/" + this.y);  //it's not a good idea, we get the code duplication
    }

    RationalFraction div(RationalFraction a) {
        RationalFraction c = new RationalFraction((this.x * a.y), (this.y * a.x));
        return c;
    }

    void div2(RationalFraction a) {
        this.x = this.x * a.y;
        this.y = this.y * a.x;
        System.out.println(this.x + "/" + this.y);   //!
    }

    @Override
    public String toString() {
        return "RationalFraction = " +
                x + "/" + y;
    }

    double value() {
        double z = this.x / this.y;
        return z;
    }

    boolean eguals(RationalFraction a) {
        double z = this.x / this.y;
        double w = a.x / a.y;
        return z == w;       //This is wrong
    }

    int numberPart() {
        int c = this.x / this.y;
        return c;
    }
}
