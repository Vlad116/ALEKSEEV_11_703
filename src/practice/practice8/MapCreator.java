package practice.practice8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class MapCreator {
    private HashMap<Integer, Integer> hashMap = new HashMap<>();

    public void create(String inputFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String keys[] = reader.readLine().split(" ");
        for (int i = 0; i < keys.length; i++) {
            int key = Integer.parseInt(keys[i]);
            if (hashMap.containsKey(key)) {
                hashMap.put(key, hashMap.get(key) + 1);
            } else {
                hashMap.put(key, 1);
            }
        }
    }

    public HashMap<Integer, Integer> getHashMap() {
        return hashMap;
    }

    public void showMap() {
        hashMap.forEach((k, v) -> System.out.println(k + " : " + v + " раз"));
    }

}
