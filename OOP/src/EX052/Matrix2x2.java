package EX052;

import EX049.Vector2D;

public class Matrix2x2 {
    private double[][] matrix = new double[2][2];

    public Matrix2x2() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public Matrix2x2(double m) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                this.matrix[i][j] = m;
            }
        }
    }

    public Matrix2x2(double[][] M) {// this.matrix = M - то же самое или же нет?
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                this.matrix[i][j] = M[i][j];
            }
        }
    }

    public Matrix2x2(double a, double b, double c, double d) {
        matrix[0][0] = a;
        matrix[0][1] = b;
        matrix[1][0] = c;
        matrix[1][1] = d;
    }

    public void ShowMatrix() {
        System.out.println(" Матрица 2х2 :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public Matrix2x2 add(Matrix2x2 M) {
        Matrix2x2 sum = new Matrix2x2();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum.matrix[i][j] = this.matrix[i][j] + M.matrix[i][j];
            }
        }
        return sum;
    }

    public void add2(Matrix2x2 M) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                this.matrix[i][j] += M.matrix[i][j];
            }
        }
    }

    public Matrix2x2 sub(Matrix2x2 m) {
        Matrix2x2 sub = new Matrix2x2();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sub.matrix[i][j] = this.matrix[i][j] - m.matrix[i][j];
            }
        }
        return sub;
    }

    public void sub2(Matrix2x2 M) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                this.matrix[i][j] -= M.matrix[i][j];
            }
        }
    }

    public Matrix2x2 multNumber(double m) {
        Matrix2x2 mult = new Matrix2x2();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                mult.matrix[i][j] = this.matrix[i][j] * m;
            }
        }
        return mult;
    }

    public void multNumber2(double m) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                this.matrix[i][j] *= m;
            }
        }
    }

    public double det() {// для матрицы 2х2 произведение главной диагонали - произведение побочной
        double det = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        return det;
    }
    // Опять же частный случай для 2x2 ...
    public void Transpon() {
                double t = matrix[0][1];
                matrix[0][1] = matrix[1][0];
                matrix[1][0] = t;
    }

    public Matrix2x2 InverseMatrix() {
        double det = det();// находим определитель , сравниваем с нулем.
        if (det == 0) {
            System.out.println("Нахождение обратной матрицы не возможно, так как det = 0 !");
            return new Matrix2x2();
        }
        /*Получим союзную матрицу.(Знаю что не совсем коректно,но сделаем пока для частного случая 2x2
        т.к. нахождение определителя для было написано для частного случая)*/
        double a = matrix[0][0];
        matrix[0][0] = matrix[1][1];
        matrix[1][1] = a;
        double b = matrix[0][1];
        matrix[0][1] = matrix[1][0];
        matrix[1][0] = b;
        Transpon();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] /= det;
            }
        }
        Matrix2x2 IRmatrix = new Matrix2x2(matrix);
        return IRmatrix;
    }

    /*
    // т.е привести к треугольному виду?
    Matrix2x2 equivalentDiagonal(){
        if (matrix[1][0] == 0){
        }
    }*/
    public Vector2D multVector(Vector2D a) {
        double[] InVector = {a.getX(), a.getY()};
        double[] OutVector = {0, 0};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                OutVector[i] += matrix[i][j] * InVector[j];
            }

        }
        return new Vector2D(OutVector[0], OutVector[1]);
    }
}