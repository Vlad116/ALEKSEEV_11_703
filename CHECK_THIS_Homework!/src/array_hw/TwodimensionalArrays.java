package array_hw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Классная работа:
1) Счиатать два числа - N и M
2) Создать матрицу размерности N на M
3) Заполнить матрицу числами
4) Вывести минимальный элемент каждого столбца матрицы
5) Сформировать новый массив, состоящий из минимальных элементов матрицы -> через функцию
public static int[] findMinsInColumns(int matrix[][])

Домашняя работа:
 ДЗ 1:
Отсортировать каждую строку матрицы методом пузырька
 ДЗ 2:
Обнулить элементы ниже главной диагонали
 ДЗ 3:
Единицами заполнить элементы выше побочной диагонали
 ДЗ 4:
Транспонировать матрицу
 ДЗ 5:
Проверить, является ли матрица магическим квадратом

пример магического квадрата:
 2 	 7 	 6 	→  15
 9 	 5 	 1 	→ 	15
 4 	 3 	 8  ->  15
*/
//Прим. что бы работали функции из ДЗ № 2-5 нужно вводить квадратную матрицу!
public class TwodimensionalArrays {
    public static void main(String[] args) {
        // создаем и заполняем двумерный массив N на M
        System.out.println("Введите размерность матрицы N и M: ");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("N = ");
        int M = sc.nextInt();
        System.out.print("M = ");
        int N = sc.nextInt();
        int min = 1000000;
        int[][] A = new int[N][M];
        // 3) Заполним матрицу числами
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = rand.nextInt(10);
            }
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // 4) вывод минимумов в столбцах
        for (int j = 0; j < M; j++) {
            min = A[0][j];
            for (int i = 1; i < N; i++) {
                if (A[i][j] < min) {
                    min = A[i][j];
                }
            }
            System.out.print(j + 1 + "-й столбец минимум = " + min);
            System.out.println();
        }
        // 5) Вывод массива минимумов через функцию
        System.out.println();
        int[] NEW = findMinsInColumns(A);
        System.out.println(Arrays.toString(NEW));
        // Сортировка пузырьком каждой строки массива(ДЗ №1)
        System.out.println();
        System.out.println("Каждая строка матрицы отсортирована пузырьком:");
        int[][] SORT = BubleSort(A);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(SORT[i][j] + " ");
            }
            System.out.println();
        }
        //Обнулить элементы ниже главной диагонали (ДЗ №2)
        System.out.println();
        System.out.println("Обнулили все элементы матрицы ниже главной диагонали:");
        int[][] Null = SetToZero(A);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(Null[i][j] + " ");
            }
            System.out.println();
        }
        // ДЗ №3
        System.out.println();
        System.out.println("Присвоили единицу всем элементам матрицы выше побочной диагонали:");
        int[][] fist = SetToOne(A);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(fist[i][j] + " ");
            }
            System.out.println();
        }
        //ДЗ №4
        System.out.println();
        System.out.println("Транспонировали матрицу:");
        System.out.println();
        int[][] T = Transpose(A);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Проверим является ли матрица магическим квадратом");
        System.out.println();
        MagicSquare(A);
    }

    private static int[] findMinsInColumns(int matrix[][]) {
        int min;
        int MIN[] = new int[matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
            min = matrix[0][j];
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            MIN[j] = min;
        }
        return MIN;
    }

    // ДЗ №1
    private static int[][] BubleSort(int matrix[][]) {
        int t;
        for (int k = 0; k < matrix.length; k++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int i = matrix[0].length - 1; i > j; i--) {
                    if (matrix[k][i] < matrix[k][i - 1]) {
                        t = matrix[k][i];
                        matrix[k][i] = matrix[k][i - 1];
                        matrix[k][i - 1] = t;
                    }
                }
            }
        }
        return matrix;
    }

    // ДЗ №2
    private static int[][] SetToZero(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                matrix[j][i] = 0;
            }
        }
        return matrix;
    }

    // ДЗ №3
    private static int[][] SetToOne(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i + 1) + (j + 1) < matrix.length + 1)
                    matrix[i][j] = 1;
            }
        }
        return matrix;
    }

    // ДЗ №4
    private static int[][] Transpose(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        return matrix;
    }

    // ДЗ №5 , проверка на магический квадрат
    private static boolean MagicSquare(int matrix[][]) {
        int[] SumS = new int[matrix.length];
        int[] SumC = new int[matrix.length];
        boolean f = true;
        int SumGl = 0;
        for (int i = 0; i < matrix.length; i++) {
            SumGl += matrix[i][i];
        }
        int SumPb = 0;
        for (int i = 0; i < matrix.length; i++) {
            SumPb += matrix[i][matrix.length - i - 1];
        }
        for (int i = 0; i < matrix.length; i++) {
            int SumStr = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                SumStr += matrix[i][j];
            }
            System.out.println("Суммма " + (i + 1) + "-ой строки = " + SumStr);
            SumS[i] = SumStr;
        }
        System.out.println();
        for (int i = 0; i < matrix[0].length; i++) {
            int SumColomn = 0;
            for (int j = 0; j < matrix.length; j++) {
                SumColomn += matrix[j][i];
            }
            System.out.println("Суммма " + (i + 1) + "-ого столбца = " + SumColomn);
            SumC[i] = SumColomn;
            if (SumC[i] != SumS[i]) {
                f = false;
            }
            if (SumGl != SumC[i]) {
                f = false;
            }
            if (SumPb != SumS[i]) {
                f = false;
            }
        }
        System.out.println();
        if (SumGl == SumPb && f) {
            System.out.println("Данная матрица является магическим квадратом!");
        } else {
            System.out.println("Данная матрица не является магическим квадратом!");
        }
        return f;
    }
}
/*Классная работа:
1) Счиатать два числа - N и M
2) Создать матрицу размерности N на M
3) Заполнить матрицу числами
4) Вывести минимальный элемент каждого столбца матрицы
5) Сформировать новый массив, состоящий из минимальных элементов матрицы -> через функцию
public static int[] findMinsInColumns(int matrix[][])

Домашняя работа:
 ДЗ 1:
Отсортировать каждую строку матрицы методом пузырька
 ДЗ 2:
Обнулить элементы ниже главной диагонали
 ДЗ 3:
Единицами заполнить элементы выше побочной диагонали
 ДЗ 4:
Транспонировать матрицу
 ДЗ 5:
Проверить, является ли матрица магическим квадратом
2 	7 	6 	→  15
9 	5 	1 	→ 	15
4 	3 	8   ->  15
*/