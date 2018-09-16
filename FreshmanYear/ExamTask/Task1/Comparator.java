package ExamTask.Task1;

import java.util.HashSet;

public class Comparator implements java.util.Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return countOfUniqueCharacters(o1) - countOfUniqueCharacters(o2);
    }

    private int countOfUniqueCharacters(String s) {

        int value = 0;
        HashSet<Character> hashSet = new HashSet<>();
        char current;
        for (int i = 0; i < s.length(); i++) {
            current = s.charAt(i);
            if (!hashSet.contains(current)) {
                hashSet.add(current);
                value++;
            }
        }
        return value;
    }
}
