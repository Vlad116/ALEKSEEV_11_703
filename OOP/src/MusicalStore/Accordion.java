package MusicalStore;

public class Accordion extends  MusicalInstrument {
    private int id;

    public Accordion() {
        super.name = "Аккордион";
        super.cost = 3500;
        super.sound = " *Веселые звуки аккардиона*";
    }
    public Accordion(String name, int cost, String sound) {
        super(name, cost, sound);
    }

    @Override
    public String toString() {
        return "Accordion:" +
                "name = " + name + '\'' +
                ", cost = " + cost +
                ", sound = " + sound + '\'';
    }
}
