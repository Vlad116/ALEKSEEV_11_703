package practice.practice21;

import java.util.Comparator;

public class ComparatorByMaxSubsequenceInLetter implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        int maxSubsequence1 = findMaxSubsequence(s1);
        int maxSubsequence2 = findMaxSubsequence(s2);
        return maxSubsequence1 - maxSubsequence2;
    }

    private int findMaxSubsequence(String string) {

        char[] chars = string.toCharArray();
        int max = 0;
        int count = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] < chars[i + 1]) {
                count++;
            } else if (count > max) {
                max = count;
            }
        }
        if (max == 0) {
            max = count;
        }
        return max;
    }

}

