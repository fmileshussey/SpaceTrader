/**
 * 12/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
public class Island {
    private final String name;
    private final String[] charts_to;
    private final String description;
    private String[] resources;

    public Island(String name, String[] charts_to, String description, String[] resources) {
        this.name = name;
        this.charts_to = charts_to;
        this.description = description;
        this.resources = resources;
    }

    public Island(String name, String[] charts_to, String description) {
        this.name = name;
        this.charts_to = charts_to;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String[] getResources() {
        return resources;
    }


}
