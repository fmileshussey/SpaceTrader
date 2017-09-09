/**
 * 16/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
public class Commodity {
    private String name = "";
    private String description = "";
    private double weight = 0.0;
    //private String size = "";
    private int quantity = 0;

    public Commodity(String name, String description, double weight) {
        this.name = name;
        this.description = description;
        this.weight = weight;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Description: " + description + ", Quantity: " + quantity + ", Weight: " + weight;
    }
}
