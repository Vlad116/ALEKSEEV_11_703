package MusicalStore;

public class Piano extends MusicalInstrument {
    String color;
    public Piano() {
        super.name = "Пианино";
        super.cost = 9000;
        super.sound = "Послышалось мелодичное звучание пианино...";
        this.color = "black";
    }
    public Piano(String name, int cost, String sound,String color) {
        super(name, cost, sound);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
