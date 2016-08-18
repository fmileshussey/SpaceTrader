import java.util.Arrays;

/**
 * 12/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
abstract class Island {
    protected String name;
    protected Island[] charts_to;
    protected String description;
    protected Store[] stores;
    protected Ship[] docks;

    /**
     * Method to facilitate docking a ship at an Islands dock.
     *
     * @param add Ship to be added.
     */
    public void addShip(Ship add) {
        int index;

        for (index = 0; index < docks.length; index++) {
            if (docks[index] == null) {
                docks[index] = add;
                break;
            } else if (index == docks.length - 1) {
                System.out.println("Dock is currently full.");
            }
        }
    }

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

    public Store[] getStores() {
        return stores;
    }
}
