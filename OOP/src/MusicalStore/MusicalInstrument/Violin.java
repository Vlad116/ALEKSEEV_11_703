package MusicalStore.MusicalInstrument;

public class Violin implements MusicalInstrument {
    int id;
    int cost;
    String name;
    String sound;

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

    @Override
    public String toString() {
        return "Violin: " +
                "name = " + name + '\'' +
                ", cost = " + cost +
                ", sound = " + sound + '\'';
    }
}
