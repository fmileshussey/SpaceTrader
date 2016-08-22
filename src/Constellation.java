/**
 * 19/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
public class Constellation {
    private String name;
    private String description;
    private Constellation connects;
    private Planet[] planets;

    public Constellation(String name, String description, Constellation connects, Planet[] planets) {
        this.name = name;
        this.description = description;
        this.connects = connects;
        this.planets = planets;
    }

    public String getName() {
        return name;
    }

    public Planet[] getPlanets() {
        return planets;
    }

    public String getDescription() {
        return description;

    }

    public Constellation getConnects() {
        return connects;
    }
}
