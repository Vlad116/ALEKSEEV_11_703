package StringEX;
import java.util.Scanner;
public class EX214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word = str.split("\\s");
        for (int i = 0; i < word.length; i++){
            if (word[i].charAt(0) == word[i].charAt(word[i].length() - 1)){
                System.out.println((i+1) + "-ое слово начинается и заканчивается с одной и той же буквы");
            }
        }
    }
}
