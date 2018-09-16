package practice.patterns.practice1;

public class Snake implements Hero {
    // начальные характеристики
    //private int damage = 4;
    //private int hp = 100;
    protected int experience = 0;

    public Snake() {
    }

    @Override
    public void crawl() {
        System.out.println("Я могу ползать...,шшшш "); // перемещение например по координатам
    }

    @Override
    public void fly() {
        System.out.println("Ваш персонаж не умеет летать");
    }

    @Override
    public void speak() {
        System.out.println("Вам персонаж не умеет говорить");
    }

 /*   @Override
    public void attack() {
        System.out.println("Наносит " + getDamage() + " урона");
    }*/

    @Override
    public void passQuest(int cost) {
        System.out.println("Квест пройден, получено опыта: " + cost);
        experience += cost;
    }

    /*
        public int getDamage() {
            return damage;
        }

        public int getHp() {
            return hp;
        }
    */

    @Override
    public int getExperience() {
        return experience;
    }

    public void showExperience() {
        System.out.println("У вас " + experience + " опыта" + "\n");
    }


}

