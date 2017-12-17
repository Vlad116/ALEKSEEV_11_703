package MusicalStore.MusicalInstrument;

public class Accordion implements MusicalInstrument {
    private int id;
    private int cost;
    private String name;
    private String sound;

    @Override
    public String toString() {
        return "Accordion:" +
                "name - " + name + '\'' +
                ", cost - " + cost +
                ", sound - " + sound + '\'';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public void setID(int id) {
        this.id = id;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSound(String sound) {
        this.sound = sound;
    }
}
