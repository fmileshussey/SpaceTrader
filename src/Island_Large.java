/**
 * 19/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
public class Island_Large extends Island_Inhabited {
    public Island_Large(String name, Island[] charts_to, String description, Building[] buildings) {
        this.name = name;
        this.charts_to = charts_to;
        this.description = description;
        this.buildings = buildings;
        docks = new Ship[8];
    }
}
