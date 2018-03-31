package Archive.StringEX;

import java.util.Arrays;
import java.util.Scanner;

// Упорядочить данный массив англ. слов по алфавиту
public class EX226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] EnglishWord = str.split("\\s+");
        System.out.println("Unsorted array: " + Arrays.toString(EnglishWord));
        Arrays.sort(EnglishWord);
        System.out.println("Sorted array: " + Arrays.toString(EnglishWord));
    }
}
