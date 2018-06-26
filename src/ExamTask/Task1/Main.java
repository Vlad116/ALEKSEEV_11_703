package ExamTask.Task1;

import java.util.ArrayList;
import java.util.Collections;

// practice 23
public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("bc");
        list.add("bfds");
        list.add("aaaaaa");
        list.add("fsdetege");
        list.add("abc");
        Collections.sort(list, new Comparator());
        System.out.println(list.toString());

    }
}
