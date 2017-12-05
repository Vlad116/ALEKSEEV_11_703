package MusicalStore;
import java.util.Scanner;
public class Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Violin violin = new Violin();
        Accordion accordion = new Accordion();
        MusicalInstrument catalog[] = {guitar,piano,violin,accordion};
        System.out.println("Добрый день, что вы хотите купить?");
        System.out.println("Покажите мне ваш каталог");
        System.out.println("Вот посмотрите");
        for (int i = 0; i < catalog.length;i++){

        }

        System.out.println("Классно!Можно мне посмотреть "  );

    }
}