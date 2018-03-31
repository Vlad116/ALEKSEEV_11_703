package Archive.EX052;

import Archive.EX049.Vector2D;

public class Main {
    public static void main(String[] args) {
        Matrix2x2 A = new Matrix2x2();
        Matrix2x2 B = new Matrix2x2(1);
        double[][] m = {{1, 0},
                        {0, 1}};
        Matrix2x2 C = new Matrix2x2(m);
        Matrix2x2 D = new Matrix2x2(2, 3, 1, 4);
        Vector2D vector2D = B.multVector(new Vector2D(4,2));
        System.out.println(vector2D.toString());
        A = B.add(C);
        A.ShowMatrix();
        A.add2(B);
        A.ShowMatrix();
        A = B.sub(C);
        A.ShowMatrix();
        D.sub2(B);
        D.ShowMatrix();
        A = C.multNumber(3);
        A.ShowMatrix();
        C.multNumber2(2);
        C.ShowMatrix();
        System.out.println("Опрелелитель = " + C.det() + "\n");
        D.Transpon();
        D.ShowMatrix();
        D.InverseMatrix().ShowMatrix();
    }
}