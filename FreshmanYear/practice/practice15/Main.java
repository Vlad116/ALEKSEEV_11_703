package practice.practice15;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(123);
        list.add(121212);
        list.add(1357);
        list.add(23476);
        list.add(19992);
        Collections.sort(list, new Comparator());
        System.out.println(list.toString());
    }
}

