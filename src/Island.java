/**
 * 12/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
abstract class Island {
    private String name;
    private Island[] charts_to;
    private String description;

    /**
     * An accessor for the name.
     * @return name the name of the Island.
     */
    public String getName() {
        return name;
    }

    /**
     * An accessor for the description of the Island.
     *
     * @return description the description of the Island.
     */
    public String getDescription() {
        return description;
    }

    /**
     * An accessor for the array of Islands that can be chartered ti
     *
     * @return charts_to an array of islands that available.
     */
    public Island[] getCharts_to() {
        return charts_to;
    }
}
