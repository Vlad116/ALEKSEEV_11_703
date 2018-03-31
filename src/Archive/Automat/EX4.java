package Archive.Automat;

public class EX4 {
    public static boolean CorrectForm(String text) {
        char array[] = text.toCharArray();
        int state = 0;
        int i = 0;
        int q2 = 0;
        int[][] m = {{0, 1},
                {2, 1},
                {1, 3},
                {3, 3}};
        boolean isFinishState = false;
        boolean f;
        while ((i < text.length()) && !(isFinishState)) {
            //state, array[i] - на вход индексы
            int t = array[i] - '0';
            state = m[state][t];
            if (state == 2)
                q2++;
            if (state == 3){
                isFinishState = true;
            }
            i++;
        }
        if (state == 1 && q2 > 0) {
            f = true;
            System.out.println("Найдено место удовлетворяющее условию. Между двумя вхождениями 1 - четное число вхождений 0");
        } else {
            f = false;
            System.out.println("Не найдено место удовлетворяющее условию или есть не четное число вхождений 0 ");
        }
        return f;
    }

    public static void main(String[] args) {
        String words[] = {"1001", "0001","1100001", "11", "1000", "0101", "1011001"};// тесты, алфавит {0,1}
        for (int i = 0; i < words.length; i++) {
            System.out.println(CorrectForm(words[i]));
            System.out.println();
        }
    }
}