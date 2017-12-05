package MusicalStore;

public class Violin extends MusicalInstrument{
    public Violin() {
        super.name = "Скрипка";
        super.cost = 11999;
        super.sound = "*Печальный звук скрипки*";
    }
    public Violin(String name, int cost, String sound) {
        super(name, cost, sound);
    }

    @Override
    public String toString() {
        return "Violin: " +
                "name = " + name + '\'' +
                ", cost = " + cost +
                ", sound = " + sound + '\'';
    }
}
