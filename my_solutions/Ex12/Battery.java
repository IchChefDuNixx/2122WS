public class Battery {
    private int capacity;
    private String type;
    private int id;
    private static int counter = 0;
    private int charge;

    Battery() {
        this(0);
    }

    Battery(int capacity) {
        this(0, "none");
    }

    Battery(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
        this.id = counter;
        counter++;
        this.charge = 0;
    }

    public int getCapactity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public int getCharge() {
        return charge;
    }

    @Override
    public String toString() {
        return ("[Charge: " + charge + "/" + capacity + " (" + type + ")]");
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }
}
