package Automat;

public class EX5 {
    public static boolean InThe3rdPlaceZero(String text) {
        char array[] = text.toCharArray();
        int state = 0;
        int i = 0;
        int[][] m = {{1, 1},
                {2, 2},
                {0, 3},
                {3, 3}};
        boolean isFinishState = false;
        boolean f;
        if (text.length() < 3) {
            f = false;
            System.out.println("Слишком короткая цепочка");
        } else {
            while ((i < text.length()) && !isFinishState) {
                //state, array[i] - на вход индексы
                int t = array[i] - '0';
                state = m[state][t];
                i++;
                if (state == 3) {
                    isFinishState = true;
                }
            }
            if (state != 3) {
                f = true;
                System.out.println("Верно. На каждом 3ем месте стоит 0!");
            } else {
                f = false;
                System.out.println("Не верная цепочка. Не на каждом 3ем месте стоит 0!");
            }
        }
        return f;
    }

    public static void main(String[] args) {
        String words[] = {"1001", "101", "1100001", "00", "110", "000"};// тесты, алфавит {0,1}
        for (int i = 0; i < words.length; i++) {
            System.out.println(InThe3rdPlaceZero(words[i]));
            System.out.println();
        }
    }
}