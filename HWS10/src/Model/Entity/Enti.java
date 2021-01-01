package Model.Entity;

public class Enti {
    private int id;
    private String violation;
    private String plaque;
    private String model;

    public int getId() {
        return id;
    }

    public Enti setId(int id) {
        this.id = id;
        return this;
    }

    public String getViolation() {
        return violation;
    }

    public Enti setViolation(String violation) {
        this.violation = violation;
        return this;
    }

    public String getPlaque() {
        return plaque;
    }

    public Enti setPlaque(String plaque) {
        this.plaque = plaque;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Enti setModel(String model) {
        this.model = model;
        return this;
    }
}
