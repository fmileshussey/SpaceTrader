/**
 * 17/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
public class Planet_Small extends Planet_Inhabited {

    public Planet_Small(String name, String description, Building[] buildings) {
        this.name = name;
        this.description = description;
        docks = new Ship[3];
    }


}
