package HomeWork.Sniper;

public class Shot {
    private int a;
    private int b;

    public Shot(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double calcRadius(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
