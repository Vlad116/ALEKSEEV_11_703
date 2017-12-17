package MusicalStore.MusicalInstrument;

public class Guitar implements MusicalInstrument {
    private int id;
    private int cost;
    private String name;
    private String sound;
    private String type;

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
        return "Guitar:" +
                "type - " + type + '\'' +
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
