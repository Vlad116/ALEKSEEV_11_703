package ThePrintEdition;

import java.util.Scanner;

//пусть дата - это число месяца
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Newspaper BreakingNews = new Newspaper("Газета", "BreakingNews", "Узнать новости первым", "Экспресс новости от инсайдов", 25);
        Magazine magazine = new Magazine("Журнал", "Сделай сам", "Научиться делать что-то своими руками", "06.20.2016", 156);
        Book book = new Book("Повесть", "Повести Белкина", "Развлечение", "Пушкин А.С");
        Tutorial tutorial = new Tutorial("Учебник", "Java 7", "Обучение языку программирования java", "Ильдар Хабибулин");
        Fantastic fantastic = new Fantastic("Фантастика-фентези", "The Lord of the Rings", "Развлечение", "Дж.Р.Р.Толкин");
        Detective detective = new Detective("Детектив", "Пустой дом", "Развлечение", "А. Конон Дойль");
        Roman roman = new Roman("Роман", "Молодая гвардия", "Развлечение", "Александр Фадеев");
        int today = 25;
        BreakingNews.isLatestNews(today);

        PrintedEdition[] list = {book, fantastic, detective, roman, tutorial, BreakingNews, magazine};

        System.out.println("Список текстов на сайте: " + '\n');
        for (int i = 0; i < list.length; i++) {
            System.out.println("Название: " + list[i].tittle + '\n' +
                    "Тип текста: " + list[i].type + '\n' +
                    "Назначение: " + list[i].assignment + '\n');
        }

        System.out.println("Выберете раздел!(0 - книги, 1 - журналы, 2 - газеты)");
        int choice = sc.nextInt();// от 0 до 2
        Book[] WebsiteLibrary = {book, fantastic, detective, roman, tutorial};
        magazine.setAssigment("Учит делать различные поделки своими руками");
        if (choice == 0) {
            for (int i = 0; i < WebsiteLibrary.length; i++) {
                System.out.println("Название книги: " + WebsiteLibrary[i].getTittle() + '\n' +
                        "Жанр: " + WebsiteLibrary[i].getType() + '\n' +
                        "Авторы: " + WebsiteLibrary[i].getListOfAuthors() + '\n' +
                        "Назначение: " + WebsiteLibrary[i].getAssignment() + '\n');
            }
        } else if (choice == 1) {
            System.out.println("Название журнала: " + magazine.getTittle() + '\n' +
                    "Предназначение: " + magazine.getAssigment() + '\n' +
                    "Номер выпуска: №" + magazine.getNumber() + '\n' +
                    "Дата выпуска: " + magazine.getDate() + '\n');
        } else if (choice == 2) {
            System.out.println("Название газеты: " + BreakingNews.getTittle() + '\n' +
                    "Предназначение: " + BreakingNews.getAssignment() + '\n' +
                    "Источники: " + BreakingNews.getSources() + '\n' +
                    "Число выпуска: " + BreakingNews.getDate() + '\n' +
                    "Газета актуальна? " + BreakingNews.isLatestNews(today) + '\n');
        }
    }
}