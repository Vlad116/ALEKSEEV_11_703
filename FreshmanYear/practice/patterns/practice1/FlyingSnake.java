package practice.patterns.practice1;

public class FlyingSnake implements Hero {
    // private int damage = 8;
    // private int hp = 150;
    // 2 уровень, ( при exp >= 100)

    private Hero hero; // decorated

    public FlyingSnake(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void crawl() {
        hero.crawl();
    }

    @Override
    public void fly() {
        System.out.println("Я еще и летать теперь умею...");// тоже перемещение в координатах , но быстрее и без контакта с рельефом
    }

    @Override
    public void speak() {
        hero.speak();
    }

 /*   @Override
    public void attack() {
        hero.attack();
    }*/

    @Override
    public void passQuest(int cost) {
        hero.passQuest(cost);
    }

    /*@Override
    public int getDamage() {
        return hero.getDamage() + 4;
    }*/

    @Override
    public void showExperience() {
        hero.showExperience();
    }

    @Override
    public int getExperience() {
        return hero.getExperience();
    }
}
