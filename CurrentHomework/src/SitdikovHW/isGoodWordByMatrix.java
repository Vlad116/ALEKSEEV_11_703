package SitdikovHW;

public class isGoodWordByMatrix {
    public static boolean isGoodWordByMatrix(String text) {
        char array[] = text.toCharArray();
        int state = 0;
        int i = 0;
        int l = text.length();
        int[][] m = {{1, 4, 4},
                {4, 2, 4},
                {4, 2, 3},
                {4, 4, 4},
                {4, 4, 4}};//new [5][3];
        boolean isNotFinishState = true;
        if (l < 3) {
            System.out.println("Все плохо");
            isNotFinishState = false;
        }
        while ((i < l) && isNotFinishState) {
            //state, array[i] - на вход индексы
            int t = array[i] - '0';
            state = m[state][t];
            i++;
            if (state == 4)
                isNotFinishState = false;
        }
        if (state == 3) System.out.println("Все нормально");
        return isNotFinishState;
    }

    public static void main(String[] args) {
        String words[] = {"0112", "0", "", "011112", "01", "2"};// тесты
        for (int i = 0; i < words.length; i++) {
            isGoodWordByMatrix(words[i]);
            System.out.println();
        }
    }
}