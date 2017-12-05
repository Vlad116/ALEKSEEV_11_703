package MusicalStore;

public class Store {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Violin violin = new Violin("Скрипка",6000,"*Звук скрипка*");
        Accordion accordion = new Accordion("Аккордион",7800,"*Звук аккордиона*");
        MusicalInstrument catalog[] = { guitar,piano,violin,accordion};
        System.out.println("Добрый день, что вы хотите купить?");
        System.out.println("Покажите мне ваш каталог");
        for (int i = 0; i < catalog.length;i++){

        }
    }

    @Override
    public String toString() {
        return "name" + ;
    }
}