import java.util.Arrays;

/**
 * 17/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
public class Planet_Uninhabited extends Planet {
    //private String name;
    //private Planet[] charts_to;
    //private String description;
    private Commodity[] commodities;
    private Commodity[] dis_commod;
    //private Ship[] docks;

    /**
     * Creates an Uninhabited Planet with initial values.
     *
     * @param name        the name of the Planet.
     * @param charts_to   an array of Planets that can be charted to from this Planet.
     * @param description a description of the Planet.
     * @param commodities an of commodities available for discovering.
     */
    public Planet_Uninhabited(String name, Planet[] charts_to, String description, Commodity[] commodities) {
        this.name = name;
        this.charts_to = charts_to;
        this.description = description;
        this.commodities = commodities;
        dis_commod = new Commodity[commodities.length];
        docks = new Ship[1];
    }

    /**
     * Method for processing a player roll in order
     * for player to discover more of the Planet
     * Commodities.
     *
     * @param roll the roll that the player makes
     */
    public void discoverCommodities(double roll) {
        //method which I guess I will create in time,
        //basic idea is player sends a roll between 0 and 1,
        //coinciding with how much of the commodities player will
        //"discover", perhaps <.3 == fail, then tier how much they discover,
        //player will have to re-roll to discover fully.
        //Use an energy mechanic to dictate how much they can re-roll?
    }

    /**
     * An accessor for the current commodities discovered.
     *
     * @return commodities an array of commodities discovered.
     */
    public Commodity[] getCommodities() {
        //incorrect - currently returning full list of commodities.
        return commodities;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Description: " + ", Charts to: " +
                Arrays.toString(charts_to) +
                ", Docks: " + Arrays.toString(docks) + ", Commodities: " + Arrays.toString(commodities);
    }
}
