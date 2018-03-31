package Archive.StringEX;

import java.util.Scanner;

// Did not finish...
public class EX257 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f1 = sc.nextLine();
        String[] TextWord = f1.split("/[\\s,!;:.]/");
        String f2 = sc.nextLine();
        String[] Words = f2.split(",", 30);
        String[] Synonyms = new String[Words.length / 2];
        // Words[i+1] - синоним i-ого (нечетные номера - синоним предыдущего)
        for (int i = 0; i < Words.length; i++) {
            if (i % 2 == 1) {
                Synonyms[i-1] = Words[i];
            }
        }
        for (int i = 0; i < Words.length; i++){
            if (f1.contains(Words[i])){

            }
        }
    }
}
