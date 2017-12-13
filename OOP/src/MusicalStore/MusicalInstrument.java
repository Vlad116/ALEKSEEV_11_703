package MusicalStore;

public interface MusicalInstrument {
    String getName();
    String getSound();
    int getCost();
    int getID();
    void setID(int id);
    void setCost(int cost);
    void setName(String name);
    void setSound(String sound);
    String toString();
}
