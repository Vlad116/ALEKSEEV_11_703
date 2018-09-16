package practice.patterns.practice2;

public class Gun extends Weapon {
    private int damage = 20;

    @Override
    void attack() {
        System.out.println("Послышался выстрел пистолета...");
        System.out.println("Наносит " + damage + " урона");
    }

    @Override
    public String toString() {
        return "Gun (" + " damage = " + damage + " )";
    }
}
