/**
 * 18/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
public class Ship {
    protected String name;
    protected String description;
    protected Commodity[] hold;
    protected int crew;

    public Ship(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void save(){}
}
