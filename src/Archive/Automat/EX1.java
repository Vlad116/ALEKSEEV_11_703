package Archive.Automat;

public class EX1 {
    public static boolean ThereIsSubword10(String text) {
        char array[] = text.toCharArray();
        int state = 0;
        int i = 0;
        int[][] m = {{0, 1},
                {2, 1},
                {2, 2}};
        boolean isFinishState = false;
        boolean f;
        while ((i < text.length()) && !isFinishState) {
            //state, array[i] - на вход индексы
            int t = array[i] - '0';
            state = m[state][t];
            i++;
            if (state == 2)
                isFinishState = true;
        }
        if (state == 2) {
            f = true;
            System.out.println("Содержится подслово 10 !");
        } else {
            f = false;
            System.out.println("Подслово 10 не содержится!");
        }
        return f;
    }

    public static void main(String[] args) {
        String words[] = {"0110", "0", "10", "1", "1000", "0101", "0001111"};// тесты, алфавит {0,1}
        for (int i = 0; i < words.length; i++) {
            System.out.println(ThereIsSubword10(words[i]));
            System.out.println();
        }
    }
}