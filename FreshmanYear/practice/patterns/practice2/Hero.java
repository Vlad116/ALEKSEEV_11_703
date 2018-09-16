package practice.patterns.practice2;

import java.util.HashMap;

public class Hero {
    private Weapon currentWeapon = new Fist();

    protected HashMap<Integer, Weapon> backpack = new HashMap<>();
    private int size = 0;

    public Hero() {
        backpack.put(0, new Fist());
        System.out.println(getSize() + " - " + backpack.get(getSize()));

    }

    public void setCurrentWeapon(Weapon a) {
        currentWeapon = a;
    }

    public void pickWeapon(Weapon a) {
        if (!backpack.containsValue(a)) {
            backpack.put(++size, a);
            System.out.println(getSize() + " - " + backpack.get(getSize()));
        } else {
            System.out.println("У нас уже есть такое");
        }
    }

    public void attack() {
        currentWeapon.attack();
    }

    public int getSize() {
        return size;
    }
}
