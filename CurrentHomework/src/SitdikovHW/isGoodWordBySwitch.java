package SitdikovHW;

public class isGoodWordBySwitch {
    public static boolean isGoodWordBySwitch(String text) {
        char array[] = text.toCharArray();
        int state = 0;
        int i = 0;
        int l = text.length();
        boolean isNotFinishState = true;
        if (l < 3) {// есть как минимум 3 необходимых символа б, э, ! , если же длина слова меньше трех , то проверка на принадлежнось не имеет смысла
            System.out.println("Все плохо");
            isNotFinishState = false;
        }
        while (isNotFinishState) {
            switch (state) {
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

    public static void main(String[] args) {
        String words[] = {"бээ!", "б", "", "бэээээ!", "бэ", "!"};// тесты
        for (int i = 0; i < words.length; i++) {
            isGoodWordBySwitch(words[i]);
            System.out.println();
        }
    }
}