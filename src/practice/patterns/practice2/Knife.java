package practice.patterns.practice2;

public class Knife extends Weapon {
    private int damage = 8;

    @Override
    void attack() {
        System.out.println("Размахивает ножом");
        System.out.println("Наносит " + damage + " урона");
    }

    @Override
    public String toString() {
        return "Knife (" + " damage = " + damage + " )";
    }
}
