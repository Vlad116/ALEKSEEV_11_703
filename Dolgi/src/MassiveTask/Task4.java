package MassiveTask;

// Проверка на совпадение строки и столбца
public class Task4 {

    private static boolean SearchRowEqualToColumn(int[][] a) {
        boolean f = true;
        for (int i = 0; i < a.length; i++) {
            if (i != 0 && f)
                break;
            for (int j = 0; j < a.length; j++) {
                if (j != 0 && f)
                    break;
                f = true;
                for (int k = 0; f && k < a[j].length; k++) {
                    if (a[i][k] != a[k][j]) {
                        f = false;
                    }
                }
            }
        }
        return f;
    }

    private static void ShowMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[][] = {{3, 2, 3},
                     {2, 3, 1},
                     {4, 1, 4}};
        boolean f = SearchRowEqualToColumn(a);
        ShowMatrix(a);
        if (f)
            System.out.println("Есть строка, совпадающая со столбцом!");
        else
            System.out.println("Строки совпадающей со столбцом нет!");
    }
}
