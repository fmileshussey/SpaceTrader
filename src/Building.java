/**
 * 17/08/2016
 *
 * @author Finnegan Miles-Hussey
 */
abstract class Building {
    protected String name;
    protected String description;
    protected String belongs;
    protected String size;
    protected boolean blockade;

    abstract public void save();
}
