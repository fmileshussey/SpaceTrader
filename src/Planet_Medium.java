/**
 * 19/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
public class Planet_Medium extends Planet_Inhabited {
    public Planet_Medium(String name, Planet[] charts_to, String description, Building[] buildings) {
        this.name = name;
        this.charts_to = charts_to;
        this.description = description;
        this.buildings = buildings;
        docks = new Ship[5];
    }

}