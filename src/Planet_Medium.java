/**
 * 19/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
public class Planet_Medium extends Planet_Inhabited {
    public Planet_Medium(String name, String description, Building[] buildings) {
        this.name = name;
        this.description = description;
        docks = new Ship[5];
    }

}
