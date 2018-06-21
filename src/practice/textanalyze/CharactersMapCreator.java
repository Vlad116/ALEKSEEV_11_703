package practice.textanalyze;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CharactersMapCreator {

    private HashMap<Character, Integer> hashMap = new HashMap<>();

    public void create(String inputFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));

        String keys[] = reader.readLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", " ").split(" ");

        for (int i = 0; i < keys.length; i++) {

            for (int j = 0; j < keys[i].length(); j++) {

                char key = keys[i].charAt(j);

                if (hashMap.containsKey(key)) {
                    hashMap.put(key, hashMap.get(key) + 1);
                } else {
                    hashMap.put(key, 1);
                }
            }
        }
    }

    public HashMap<Character, Integer> getHashMap() {
        return hashMap;
    }


    public void showMap() {
        hashMap.forEach((k, v) -> System.out.println(k + " : " + v + " раз"));
    }

}
