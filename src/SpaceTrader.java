/**
 * SeaTrader.java - A sea based trading game.
 *
 * @author Finnegan Miles-Hussey
 * @version 1.0.0
 */
public class SpaceTrader {

    public SpaceTrader() {
    }

    public static void main(String[] args) {
        Commodity[] c = {new Commodity("food", "nice food", 5.5), new Commodity("rock", "hard", 7.7)};
        c[0].setQuantity(5);
        c[1].setQuantity(10);
        Island i = new Island_Uninhabited("Rockland", new Island[5], "Rocky", c);
        Ship s = new Ship("great moves ethan");
        Ship k = new Ship("Keep it up");
        Ship j = new Ship("proud of you");

        i.addShip(s);
        i.addShip(k);
        i.addShip(j);

        System.out.println(i);
    }
}

