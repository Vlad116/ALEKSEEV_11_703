package MusicalStore;

public class MusicalInstrument {
    private int id;

    protected String name;
    protected int cost;
    protected String sound;

    public MusicalInstrument() {
        this.name = "Какой-то инструмент";
        this.cost = 0;
        this.sound = "Звук этого инструмента";
    }

    public MusicalInstrument(String name, int cost, String sound) {
        this.name = name;
        this.cost = cost;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "MusicalInstrument:" +
                "name - " + this.name +
                "cost - " + this.cost +
                "sound - " + this.sound;
    }
}