package Automat;

public class EX7 {
    public static boolean OddOneAndMultiple3Zeros(String text) {
        char array[] = text.toCharArray();
        int state = 0;
        int i = 0;
        int[][] m = {{2, 1},
                     {3, 0},
                     {4, 3},
                     {5, 2},
                     {6, 5},
                     {7, 4},
                     {2, 7},
                     {3, 6}};
        boolean f;
        while ((i < text.length())) {
            //state, array[i] - на вход индексы
            int t = array[i] - '0';
            state = m[state][t];
            i++;
        }
        if (state == 7 || state == 1) {
            f = true;
            System.out.println("Входное слово имеет кол-во 0 кратное 3 и нечетное кол-во 1");
        } else {
            f = false;
            System.out.println("Слово не подходит. В слове некратное 3ем кол-во 0 или нечетное кол-во 1 или и то и другое)");
        }
        return f;
    }

    public static void main(String[] args) {
        String words[] = {"011010", "1000", "0", "00010", "1", "", "1011", "0101", "000111"};// тесты, алфавит {0,1}
        for (int i = 0; i < words.length; i++) {
            System.out.println(OddOneAndMultiple3Zeros(words[i]));
            System.out.println();
        }
    }
}
