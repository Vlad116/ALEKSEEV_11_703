package practice.practice8;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MapCreator mapCreator = new MapCreator();
        mapCreator.create("input8.txt");
        mapCreator.showMap();
    }
}
