/**
 * 19/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
public class Archipelago {
    private String name;
    private String description;
    private Archipelago connects;
    private Island[] islands;

    public Archipelago(String name, String description, Archipelago connects, Island[] islands) {
        this.name = name;
        this.description = description;
        this.connects = connects;
        this.islands = islands;
    }

    public String getName() {
        return name;
    }

    public Island[] getIslands() {
        return islands;
    }

    public String getDescription() {
        return description;

    }

    public Archipelago getConnects() {
        return connects;
    }
}
