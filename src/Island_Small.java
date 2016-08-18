/**
 * 17/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
public class Island_Small extends Island {
    //private String name;
    //private Island[] charts_to;
    //private String description;
    //private Store[] stores;
    //private Ship[] docks;


    public Island_Small(String name, Island[] charts_to, String description, Store[] stores) {
        this.name = name;
        this.charts_to = charts_to;
        this.description = description;
        this.stores = stores;
        docks = new Ship[5];
    }


}
