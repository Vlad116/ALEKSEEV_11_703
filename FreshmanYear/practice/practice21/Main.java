package practice.practice21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        list.add("abbda");
        list.add("abcde");
        list.add("aba");
        list.add("lela");
        list.add("abcdef");
        list.sort(new ComparatorByMaxSubsequenceInLetter());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
