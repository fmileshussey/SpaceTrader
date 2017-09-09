/**
 * 19/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
public class Planet_Large extends Planet_Inhabited {
    public Planet_Large(String name, String description, Building[] buildings) {
        this.name = name;
        this.description = description;
        this.buildings = buildings;
        docks = new Ship[8];
    }
}
