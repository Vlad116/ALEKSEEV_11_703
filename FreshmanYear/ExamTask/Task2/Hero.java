package ExamTask.Task2;


public class Hero implements Cloneable {

    private String name = "username";
    private int damage = 10;

    public Hero(String name) {
        this.name = name;
    }

    public Hero() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void run() {
        System.out.println("I run away" + "\n");
    }

    public void speak() {
        System.out.println("My name is " + this.name + "\n");
    }

    public void attack() {
        System.out.println("I'll accept. Running to attack! Damage done - " + this.damage + "\n");
    }

    public Hero useAnAvatarCyborg() throws CloneNotSupportedException {
        return new Hero(this.name + "-avatar" + "\n");
    }

}
