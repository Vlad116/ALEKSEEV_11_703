package practice.patterns.practice1;

import java.util.Scanner;

// Decorator
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hero hero = new Snake();
        hero.showExperience();
        hero.crawl();
        hero.fly();
        hero.speak();
        //hero.attack();
        while (hero.getExperience() < 100) {
            hero.passQuest(scanner.nextInt());
            hero.showExperience();
        }
        hero.showExperience();
        hero = new FlyingSnake(hero);
        hero.crawl();
        hero.fly();
        hero.speak();
        while (hero.getExperience() < 200) {
            hero.passQuest(scanner.nextInt());
            hero.showExperience();
        }
        hero.showExperience();
        hero = new SpeakingSnake(hero);
        hero.crawl();
        hero.fly();
        hero.speak();
    }
}
