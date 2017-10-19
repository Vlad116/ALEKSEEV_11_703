package iterproces_HW;

public class NewtonMethodEX30a {
//Метод касательных
    public static void main(String[] args) {
        double eps = 0.0001,x0 = 1.1 ,x1; // a = 1.0, b = 1.1 ( берем значение того конца промежутка при котором f(z)*f(z)'' > 0)
        int n = 1;
        x1 = x0 - (x0 * x0 * x0 * x0 * x0 - x0 - 0.002) / (5 * x0 * x0 * x0 * x0 - 1);
        while (Math.abs(x1 - x0) > eps){
            x0 = x1;
            x1 = x0 - (x0 * x0 * x0 * x0 * x0 - x0 - 0.002) / (5 * x0 * x0 * x0 * x0 - 1);
            n++;
        }
    System.out.println("Искомое значение = " + x1);
    }
}
