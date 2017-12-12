package MusicalStore;

public interface MusicalInstrument {
    public String getName();
    public String getSound();
    public int getCost();
    public int getID();
    public void setID(int id);
    public void setCost(int cost);
    public void setName(String name);
    public void setSound(String sound);
    public String toString();
}
