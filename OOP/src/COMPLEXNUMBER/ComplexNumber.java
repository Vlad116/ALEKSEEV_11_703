package COMPLEXNUMBER;

public class ComplexNumber {
    private double a; //вещественная часть
    private double b; //мнимая часть

    public ComplexNumber() {
        a = 0;
        b = 0;
    }

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public ComplexNumber add(ComplexNumber c) {
        ComplexNumber d = new ComplexNumber(this.a + c.a, this.b + c.b);
        return d;
    }

    public void add2(ComplexNumber c) {
        this.a += c.a;
        this.b += c.b;
    }

    public ComplexNumber sub(ComplexNumber c) {
        ComplexNumber d = new ComplexNumber(this.a - c.a, this.b - c.b);
        return d;
    }

    public void sub2(ComplexNumber c) {
        this.a -= c.a;
        this.b -= c.b;
    }

    public ComplexNumber mult(ComplexNumber c) {
        ComplexNumber d = new ComplexNumber();
        d.a = this.a * c.a - this.b * c.b;
        d.b = this.a * c.b + this.b * c.a;
        return d;
    }

    public void mult2(ComplexNumber c) {
        this.a = this.a * c.a - this.b * c.b;
        this.b = this.a * c.b + this.b * c.a;
    }

    public ComplexNumber div(ComplexNumber c) {
        ComplexNumber d = new ComplexNumber();
        d.a = (this.a * c.a + this.b * c.b) / (c.a * c.a + c.b * c.b);
        d.b = (this.b * c.a - this.a * c.b) / (c.a * c.a + c.b * c.b);
        return d;
    }

    public void div2(ComplexNumber c) {
        this.a = (this.a * c.a + this.b * c.b) / (c.a * c.a + c.b * c.b);
        this.b = (this.b * c.a - this.a * c.b) / (c.a * c.a + c.b * c.b);
    }

    public double length() {
        double z = Math.sqrt(this.a * this.a + this.b * this.b);
        return z;
    }

    @Override
    public String toString() {
        if (b >= 0) {
            return a + " + " + b + " * i";
        } else {
            return a + " - " + Math.abs(b) + " * i";
        }
    }

    public double arg() {
        double r;
        r = Math.atan2(b, a);
        // перевод в градусы
        r /= Math.PI * 180;
        return r;
    }

    public ComplexNumber pow(double n) {
        ComplexNumber C = new ComplexNumber();
        double r = Math.pow(length(), n) * (Math.cos(n * arg()) + Math.sin(n * arg()));
        C.b = r;
        return C;
    }

    boolean equals(ComplexNumber c) {
        return (this.a == c.a) && (this.b == c.b);
    }
}
