/**
 * 17/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
public class Island_Uninhabited extends Island {
    private String name;
    private Island[] charts_to;
    private String description;
    private Commodity[] commodities;
    private Commodity[] dis_commod;
    private Ship[] docks;

    /**
     * Creates an Uninhabited Island with initial values.
     *
     * @param name        the name of the island.
     * @param charts_to   an array of Islands that can be charted to from this Island.
     * @param description a description of the island.
     * @param commodities an of commodities available for discovering.
     */
    public Island_Uninhabited(String name, Island[] charts_to, String description, Commodity[] commodities) {
        this.name = name;
        this.charts_to = charts_to;
        this.description = description;
        this.commodities = commodities;
        dis_commod = new Commodity[commodities.length];
        docks = new Ship[1];
    }

    /**
     * Method for processing a player roll in order
     * for player to discover more of the Island
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
    public Store[] getStores() {
        return null;
    }

}
