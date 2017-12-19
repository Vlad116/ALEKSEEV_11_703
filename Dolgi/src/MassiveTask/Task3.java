package MassiveTask;

//Проверка на две одинаковых строки
public class Task3 {
    private static boolean SearchTheSameRow(int[][] a) {
        boolean f = true;
        for (int i = 0; i < a.length; i++) {
            if (i != 0 && f)
                break;
            for (int j = i + 1; j < a.length; j++) {
                if (j != i + 1 && f)
                    break;
                f = true;
                for (int k = 0; f && k < a[j].length; k++) {
                    if (a[i][k] != a[j][k]) {
                        f = false;
                    }
                }
            }
        }
        return f;
    }
    /* boolean g,f = false;                                code without break
    for (int i = 0; i < a.length & !f; i++) {
    for (int j = i + 1; j < a.length & !f; j++) {
       g = true;
       for (int k = 0; k < a[j].length & g; k++) {
                    if (a[i][k] != a[j][k]) {
                        g = false;
                    }
             }
       f = g;             
     }
    }
   */
    
    

    private static void ShowMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int a[][] = {{1, 8, 2, 3},
                {1, 2, 5, 1},
                {1, 9, 9, 9},
                {1, 8, 2, 2}};
        boolean f = SearchTheSameRow(a);
        ShowMatrix(a);
        if (f)
            System.out.println("Есть одинаковые строки!");
        else
            System.out.println("Одинаковых строк нет!");
    }
}
