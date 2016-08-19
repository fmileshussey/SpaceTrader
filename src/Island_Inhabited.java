import java.util.Arrays;

/**
 * 19/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
abstract class Island_Inhabited extends Island {
    protected Building[] buildings;

    public Building[] getBuildings() {
        return buildings;
    }

    @Override
    public String toString() {
        return super.toString() + ", Buildings: " + Arrays.toString(buildings);
    }
}
