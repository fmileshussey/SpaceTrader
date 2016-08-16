/**
 * 12/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
public abstract class Island {
    private String name;
    private String[] charts_to;
    private String description;

    /*
    public Island(String name, String[] charts_to, String description) {
        this.name = name;
        this.charts_to = charts_to;
        this.description = description;
    }


    /**
     * Constructor for uninhabited islands.
     *
    public Island(String name, String[] charts_to, String description, String[] resources) {
        this.name = name;
        this.charts_to = charts_to;
        this.description = description;
        this.resources = resources;
    }
    */

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCharts_to(String[] charts_to) {
        this.charts_to = charts_to;
    }

    public String getName() {
        return name;
    }


    public String[] getCharts_to() {
        return charts_to;
    }

    public String getDescription() {
        return description;
    }


}
