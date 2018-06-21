package practice.textanalyze;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        CharactersMapCreator charactersMapCreator = new CharactersMapCreator();
//        charactersMapCreator.create("englishtext.txt");
//        charactersMapCreator.showMap();

        WordsMapCreator wordsMapCreator = new WordsMapCreator();
        wordsMapCreator.create("englishtext.txt");
        wordsMapCreator.showMap();

    }
}
