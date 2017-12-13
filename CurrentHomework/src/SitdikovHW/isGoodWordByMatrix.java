package ru.itis;

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
            state = m[state][array[i]];
            i++;
            if (state == 4)
                isNotFinishState = false;
        }
        if (state == 3) System.out.println("Все нормально");
        return isNotFinishState;
        /*switch (state) {
                case 0:
                    if (array[i] == 'б') {
                        i++;
                        state++;
                        break;
                    } else {
                        System.out.println("Все плохо");
                        isNotFinishState = false;
                    }
                case 1:
                    if ((i == array.length - 1) && (array[i] == 'э')) {
                        System.out.println("Все плохо");
                        isNotFinishState = false;
                        break;
                    } else if ((i != array.length - 1) && (array[i] == 'э')) {
                        i++;
                        break;
                    } else {
                        state++;
                    }
                case 2:
                    if (array[i] == '!') {
                        System.out.println("Все нормально");
                        isNotFinishState = false;
                        break;
                    } else {
                        System.out.println("Все плохо");
                        break;
                    }
            }
        }
        System.out.println("\n" + "Цикл завершен");
        return isNotFinishState;
    }
    */
    public static void main(String[] args) {
        String words[] = {"бээ!", "б", "", "бэээээ!", "бэ", "!"};// тесты
        for (int i = 0; i < words.length; i++) {
            isGoodWordByMatrix(words[i]);
            System.out.println();
        }
    }
}