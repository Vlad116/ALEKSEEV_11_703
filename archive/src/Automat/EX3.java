package Automat;

public class EX3 {
    public static boolean CorectWord(String text) {
        char array[] = text.toCharArray();
        int state = 0;
        int i = 0;
        int[][] m = {{1, 4},
                     {1, 2},
                     {3, 2},
                     {3, 4},
                     {4, 4}};
        boolean isDeadEndState = false;
        boolean f;
        while ((i < text.length()) && !isDeadEndState) {
            //state, array[i] - на вход индексы
            int t = array[i] - '0';
            state = m[state][t];
            i++;
            if (state == 4)
                isDeadEndState = true;
        }
        if (state == 3){
            f = true;
            System.out.println("Корректный вид слова! Слово принято ");
        } else if (state == 4) {
            f = false;
            System.out.println("Некорректный вид слова (нарушен порядок)! Cлово не принято ");
        } else {
            f = false;
            System.out.println("Некорректный вид слова (пропущена одна из частей)! Cлово не принято ");
        }
        return f;
    }

    public static void main(String[] args) {
        String words[] = {"0110", "1100", "0","000010", "1", "1011", "0101", "000111"};// тесты, алфавит {0,1}
        for (int i = 0; i < words.length; i++) {
            System.out.println(CorectWord(words[i]));
            System.out.println();
        }
    }
}

