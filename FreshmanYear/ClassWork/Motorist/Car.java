package ClassWork.Motorist;

public class Car {
    private int id;
    private String model;
    private int owner_id;

    public Car(int id, String model, int owner_id) {
        this.id = id;
        this.model = model;
        this.owner_id = owner_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }
}