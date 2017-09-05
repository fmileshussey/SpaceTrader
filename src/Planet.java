import java.util.Arrays;

/**
 * 12/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
abstract class Planet {
    protected String name;
    protected String description;
    protected Ship[] docks; // really not sure if i want to use a hashmap for this or not, come back to this.

    /**
     * Method to facilitate docking a ship at an Planets dock.
     *
     * @param add Ship to be added.
     */
    public void addShip(Ship add) {
        int index;

        for (index = 0; index < docks.length; index++) {
            if (docks[index] == null) {
                docks[index] = add;
                System.out.println("Docks: '" + add.getName() + "' successfully docked.");
                break;
            } else if (index == docks.length - 1) {
                System.out.println("Dock is currently full.");
            }
        }
    }

    public Ship removeShip(Ship remove) {
        int index;
        System.out.println("Removing ship: " + remove.getName());
        for (index = 0; index < docks.length; index++) {
            if (docks[index] == remove) {
                docks[index] = null;
                return remove;
            }
        }
        System.out.println("Ship: '" + remove.getName() + "' not in dock here.");
        return null;
    }

    /**
     * An accessor for the name.
     *
     * @return name the name of the Planet.
     */
    public String getName() {
        return name;
    }

    /**
     * An accessor for the description of the Planet.
     *
     * @return description the description of the Planet.
     */
    public String getDescription() {
        return description;
    }

    /**
     * An accessor for the array of Planets that can be chartered ti
     *
     * @return charts_to an array of Planets that available.
     */
    /* public Planet[] getCharts_to() {
        return charts_to;
	}*/

    @Override
    public String toString() {
        return "Name: " + name + ", Description: " +
                ", Docks: " + Arrays.toString(docks);
    }
}
