package practice.patterns.practice2;

import java.util.Scanner;

//Stratagy
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hero hero = new Hero();
        System.out.println("На нас напали пришлось обороняться" + "\n");
        hero.attack();
        System.out.println("Отобрали у врага нож" + "\n");
        hero.pickWeapon(new Knife());
        hero.setCurrentWeapon(hero.backpack.get(scanner.nextInt()));
        hero.attack();
        System.out.println("Продолжили путешествие, и в старом доме нашли пистолет" + "\n");
        hero.pickWeapon(new Gun());
        hero.setCurrentWeapon(hero.backpack.get(scanner.nextInt()));
        System.out.println("Стреляем по уткам" + "\n");
        hero.attack();
    }
}
