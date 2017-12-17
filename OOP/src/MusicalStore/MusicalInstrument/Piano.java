package MusicalStore.MusicalInstrument;

public class Piano implements MusicalInstrument {
    private int id;
    private int cost;
    private String name;
    private String sound;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    @Override
    public String toString() {
        return "Piano{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", sound='" + sound + '\'' +
                '}';
    }
}
