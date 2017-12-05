package MusicalStore;

public class Guitar extends MusicalInstrument {
    private int id;
    String type;

    public Guitar() {
        super.name = "Гитара";
        super.cost = 5000;
        super.sound = "Брынь...";
        this.type = "Классическая";
    }

    public Guitar(String name, int cost, String sound, String type) {
        super(name, cost, sound);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Guitar:" + "type - " + type + '\'' +
                "name - '" + name + '\'' +
                "cost - " + cost + '\'' +
                "sound - " + sound + '\'';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
