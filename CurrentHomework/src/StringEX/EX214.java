package StringEX;
import java.util.Scanner;
public class EX214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String [] word = {s1,s2,s3};
        for (int i = 0; i < word.length; i++){
            if (word[i].charAt(0) == word[i].charAt(word[i].length() - 1)){
                System.out.println((i+1) + "-ое слово начинается и заканчивается с одной и той же буквы");
            }
        }
    }
}
