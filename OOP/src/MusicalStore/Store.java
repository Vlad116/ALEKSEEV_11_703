package MusicalStore;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Guitar guitar = new Guitar();
        guitar.setName("Гитара");
        guitar.setType("Шестиструнная");
        guitar.setSound("*Брынь*");
        guitar.setCost(5000);
        Piano piano = new Piano();
        piano.setName("Пианино");
        piano.setSound("*Послышались мелодичные звуки пианино*");
        piano.setColor("черный");
        piano.setCost(14000);
        Violin violin = new Violin();
        violin.setName("Скрипка");
        violin.setSound("*Звук скрипки*");
        violin.setCost(13000);
        Accordion accordion = new Accordion();
        accordion.setName("Аккардион");
        accordion.setSound("*Звук аккардиона*");
        accordion.setCost(8000);
        MusicalInstrument catalog[] = {guitar, piano, violin, accordion};
        for (int i = 0; i < catalog.length; i++) {
            catalog[i].setID(i + 1);
        }
        /*System.out.println("Добрый день, что вы хотите купить?");
        System.out.println("Покажите мне ваш каталог");
        System.out.println("Вот посмотрите:");
        for (int i = 0; i < catalog.length; i++) {
            System.out.println(catalog[i].getName());
            System.out.println(catalog[i].getCost());
            System.out.println(catalog[i].getID());
        }*/
        int i = sc.nextInt();// введите число от 0 до 3
        System.out.println("Классно!Можно мне посмотреть " + catalog[i].getID() + "-ый инструмент");
        //System.out.println(catalog[i].toString());
        System.out.println("Мне понравилось, сколько с меня?");
        System.out.println("C вас " + catalog[i].getCost() + " рублей");
    }
}