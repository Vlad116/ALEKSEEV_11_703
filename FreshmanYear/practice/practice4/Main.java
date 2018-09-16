package practice.practice4;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("in4.txt"));

        int k = Integer.parseInt(reader.readLine());

        ArrayList<String> words = new ArrayList<>(k);
        String strLine;

        while ((strLine = reader.readLine()) != null) {
            if (strLine.length() >= k) {
                words.add(strLine);
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter("out4.txt"));

        for (int i = 0; i < k; i++) {

        }
    }
}
