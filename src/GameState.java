import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GameState{
    private static Player p;
    
    public GameState(Player p){
	this.p = p;
	new NewGame().init();
    }


    private static class NewGame{
	private enum planet_t{
	    LARGE, MEDIUM, SMALL, UNINHABITED
	}
    
	private void init(){
	    generateWorld();
	    newPlayer();
	}

	private Planet newPlanet(planet_t size){
	    Planet plnt;
	    String name = "placeholder"; //will be randomly selected from a group of names
	    switch(size){
	    case LARGE:
		plnt = new Planet_Large()
	    }
	}

	private void generateWorld(){
	    Planet plnt;
	    int roll = ThreadLocalRandom.current().nextInt(1, 101); //rand 1-100
	    if(roll >= 10){
		plnt = newPlanet(planet_t.LARGE);
	    }else if(roll >= 30){
		plnt = newPlanet(planet_t.MEDIUM);
	    }else if(roll >= 60){
		plnt = newPlanet(planet_t.SMALL);
	    }else{
		plnt = newPlanet(planet_t.UNINHABITED);
	    }
	}

	private void newPlayer(){
	    Scanner scan = new Scanner(System.in);
	    System.out.println("> What is your name?\n> ");
	    p.setName(scan.next());
	    System.out.println("> What is the name of your ship?\n> ");
	    p.setShip(new Ship(scan.next()));
	}

    }

   

}
