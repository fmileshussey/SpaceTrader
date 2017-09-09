/**
 * 19/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
public class Cluster {
    private String name;
    private String description;
    private Cluster connects;
    private Planet[] planets;

    public Cluster(String name, String description, Cluster connects, Planet[] planets) {
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

    public Cluster getConnects() {
        return connects;
    }
}
