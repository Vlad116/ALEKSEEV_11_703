package LeeAlgorithm;

public class AlgorithmLee {
    public static int[][] pole = new int[10][10];

    public static void main(String[] args) {
        boolean stop;
        int dx[] = {1, 0, -1, 0};
        int dy[] = {0, 1, 0, -1};
        int d = 0;
        for (int ts = 0; ts < 10; ts++) {                //Квадратик 10 на 10 с краями из стенок. "-2" - пусто.
            for (int ts2 = 0; ts2 < 10; ts2++) {   //"-1"-стена.
                pole[ts][ts2] = -2;
                pole[0][ts2] = -1;
                pole[9][ts2] = -1;
            }
            pole[ts][0] = -1;
            pole[ts][9] = -1;
        }
        pole[1][1] = 0;
        do {
            stop = true;
            for (int y = 0; y < 10; ++y)
                for (int x = 0; x < 10; ++x)
                    if (pole[y][x] == d) {
                        for (int k = 0; k < 4; k++)
                            if (pole[y + dy[k]][x + dx[k]] == -2) {
                                stop = false;
                                pole[y + dy[k]][x + dx[k]] = d + 1;
                            }
                    }
            d++;
        } while (!stop && pole[8][8] == -2);
        for (int ts = 0; ts < 10; ts++) {                           //Этого и дальше не происходит.
            for (int ts2 = 0; ts2 < 10; ts2++) {
                if (pole[ts2][ts] < 10 && pole[ts2][ts] >= 0)
                    System.out.print(pole[ts2][ts] + "  ");
                else
                    System.out.print(pole[ts2][ts] + " ");
            }
            System.out.println();
        }
    }
}