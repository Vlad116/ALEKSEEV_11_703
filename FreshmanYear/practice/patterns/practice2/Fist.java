package practice.patterns.practice2;

public class Fist extends Weapon {
    private int damage = 4;

    @Override
    void attack() {
        System.out.println("Пошел в атаку с голыми руками");
        System.out.println("Наносит " + damage + " урона");
    }

    @Override
    public String toString() {
        return "Fist (" + " damage = " + damage + " )";
    }
}
