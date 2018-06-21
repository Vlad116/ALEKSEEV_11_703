package practice.patterns.practice1;

import java.util.Scanner;

public class SpeakingSnake implements Hero {
    private Hero hero; // decorated
    Scanner scanner = new Scanner(System.in);

    // 3 уровень при exp >= 200
    public SpeakingSnake(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void crawl() {
        hero.crawl();
    }

    public void fly() {
        System.out.println("Персонаж умеет летать");// тоже перемещение в координатах , но быстрее и без контакта с рельефом
    }

    // персонаж теперь обладает даром речи

    @Override
    public void speak() {
        System.out.println("Я не раслышал, вы что-то сказали?");
        System.out.println(scanner.nextLine());
    }

   /* @Override
    public void attack() {
        hero.getDamage();
    }*/

    @Override
    public void passQuest(int cost) {
        hero.passQuest(cost);
    }

    /*    @Override
        public int getDamage() {
            return hero.getDamage() + 4;
        }
    */

    @Override
    public void showExperience() {
        hero.showExperience();
    }

    @Override
    public int getExperience() {
        return hero.getExperience();
    }
}
