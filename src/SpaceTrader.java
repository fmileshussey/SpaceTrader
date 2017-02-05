/**
 * SpaceTrader.java - A space based trading game.
 *
 * @author Finnegan Miles-Hussey
 * @version 1.0.0
 */
public class SpaceTrader {

    public SpaceTrader() {
    }

    public static void main(String[] args) {
        Tester tester = new Tester();
        if (tester.createShip()) {
            System.out.println("test succeeded.");
        } else {
            System.out.println("test failed");
        }
       /* Commodity[] c = {new Commodity("food", "nice food", 5.5), new Commodity("rock", "hard", 7.7)};
        c[0].setQuantity(5);
        c[1].setQuantity(10);
        **//*Planet p = new Planet_Inhabited("Rockland", new Planet[5], "Rocky", c);
        Ship s = new Ship("great moves ethan");
        Ship k = new Ship("Keep it up");
        Ship j = new Ship("proud of you");

        p.addShip(s);
        p.addShip(k);
        p.addShip(j);

        System.out.println(p);*/

    }
}

