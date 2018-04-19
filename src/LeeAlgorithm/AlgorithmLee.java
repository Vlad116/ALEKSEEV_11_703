package LeeAlgorithm;

public class AlgorithmLee {
    public static int W = 10;         // ширина рабочего поля
    public static int H = 10;         // высота рабочего поля
    public static int WALL = -1;         // непроходимая ячейка
    public static int BLANK = -2;         // свободная непомеченная ячейка
    int[] px = new int[W * H];
    int[] py = new int[W * H];      // координаты ячеек, входящих в путь
    int length;
    int[][] pole = new int[H][W];

    public boolean lee(int ax, int ay, int bx, int by) { // поиск пути из ячейки (ax, ay) в ячейку (bx, by)
        int dx[] = {1, 0, -1, 0};   // смещения, соответствующие соседям ячейки
        int dy[] = {0, 1, 0, -1};   // справа, снизу, слева и сверху
        int k, x, y;
        boolean stop;
        // распространение волны
        int d = 0;
        pole[ay][ax] = 0;            // стартовая ячейка помечена 0
        do {
            stop = true;               // предполагаем, что все свободные клетки уже помечены
            for (y = 0; y < H; ++y)
                for (x = 0; x < W; ++x)
                    if (pole[y][x] == d)                         // ячейка (x, y) помечена числом d
                    {
                        for (k = 0; k < 4; ++k)                    // проходим по всем непомеченным соседям
                            if (pole[y + dy[k]][x + dx[k]] == BLANK) {
                                stop = false;                            // найдены непомеченные клетки
                                pole[y + dy[k]][x + dx[k]] = d + 1;      // распространяем волну
                            }
                    }
            d++;
        } while (!stop && pole[by][bx] == BLANK);
        if (pole[by][bx] == BLANK) return false;  // путь не найден
        // восстановление пути
        length = pole[by][bx];            // длина кратчайшего пути из (ax, ay) в (bx, by)
        x = bx;
        y = by;
        d = length;
        while (d > 0) {
            px[d] = x;
            py[d] = y;                   // записываем ячейку (x, y) в путь
            d--;
            for (k = 0; k < 4; ++k)
                if (pole[y + dy[k]][x + dx[k]] == d) {
                    x = x + dx[k];
                    y = y + dy[k];           // переходим в ячейку, которая на 1 ближе к старту
                    break;
                }
        }
        px[0] = ax;
        py[0] = ay;                    // теперь px[0..length] и py[0..length] - координаты ячеек пути
        return true;
    }


    public static void main(String[] args) {
       // System.out.println(lee(3, 6, 3, 0));
    }
//        int d = 0;
//        for (int ts = 0; ts < 10; ts++) {                //Квадратик 10 на 10 с краями из стенок. "-2" - пусто.
//            for (int ts2 = 0; ts2 < 10; ts2++) {   //"-1"-стена.
//                pole[ts][ts2] = -2;
//                pole[0][ts2] = -1;
//                pole[9][ts2] = -1;
//            }
//            pole[ts][0] = -1;
//            pole[ts][9] = -1;
//        }
//        pole[1][1] = 0;
//        do {
//            stop = true;
//            for (int y = 0; y < 10; ++y)
//                for (int x = 0; x < 10; ++x)
//                    if (pole[y][x] == d) {
//                        for (int k = 0; k < 4; k++)
//                            if (pole[y + dy[k]][x + dx[k]] == -2) {
//                                stop = false;
//                                pole[y + dy[k]][x + dx[k]] = d + 1;
//                            }
//                    }
//            d++;
//        } while (!stop && pole[8][8] == -2);
//        for (int ts = 0; ts < 10; ts++) {                           //Этого и дальше не происходит.
//            for (int ts2 = 0; ts2 < 10; ts2++) {
//                if (pole[ts2][ts] < 10 && pole[ts2][ts] >= 0)
//                    System.out.print(pole[ts2][ts] + "  ");
//                else
//                    System.out.print(pole[ts2][ts] + " ");
//            }
//            System.out.println();
//        }
//    }
    }