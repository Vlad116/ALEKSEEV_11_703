package OOP;

public class Complecs {
    private double a;
    private double b;

    public Complecs() {
        a = 0;
        b = 0;
    }
    public Complecs(double a, double b) {
    this.a = a;
    this.b = b;
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void init(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public Complecs add(Complecs c) {
        Complecs d = new Complecs();
        d.a = a + c.a;
        d.a = b + c.b;
        return d;
    }
     public  void addVoid (Complecs c){
        a = a + c.a;
        b = b + c.a;
}
}
