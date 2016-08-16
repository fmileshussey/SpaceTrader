/**
 * 16/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
public abstract class Commodity {
    private String description = "";
    private double weight = 0.0;
    private String size = "";

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }


}
