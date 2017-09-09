import java.util.Arrays;

/**
 * 19/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
abstract class Planet_Inhabited extends Planet {
    protected Building[] buildings;
    protected int taxation = 0;

    public Building[] getBuildings() {
        return buildings;
    }

    @Override
    public String toString() {
        return super.toString() + ", Buildings: " + Arrays.toString(buildings);
    }
}
