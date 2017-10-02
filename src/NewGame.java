/**
 * NewGame.java
 * @desc called from the SpaceTrader class when a new game needs to be created
 * initialises various games objects and returns a GameState
*/

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import org.jgrapht.*;
import org.jgrapht.graph.*;

public class NewGame{
    
    private enum planet_t{
	LARGE, MEDIUM, SMALL, UNINHABITED
    }
    
    public static GameState init(GameState game){
	UndirectedGraph<Planet, DefaultEdge> world = generateWorld();
	Player p = newPlayer();
	game = game.getState();

	return game;
    }
    
    private static Planet newPlanet(planet_t size){
	Planet plnt;
	String name = "placeholder"; //will be randomly selected from a group of names
	String description = "Port of " + name;
	Building[] b_set = newBuildingSet(size);
	Commodity[] comm = new Commodity[10];
	
	switch(size){
	case LARGE:
	    plnt = new Planet_Large(name, description, b_set);
	case MEDIUM:
	    plnt = new Planet_Medium(name, description, b_set);
	case SMALL:
	    plnt = new Planet_Small(name, description, b_set);
	case UNINHABITED:
	    plnt = new Planet_Uninhabited(name, description, comm);
	default:
	    plnt = null;;
	}

	return plnt;
	
    }
    
    private static Building[] newBuildingSet(planet_t size){
	int building_count;
	Building[] b_set;
	
	switch(size){
	case LARGE:
	    building_count = 10;
	case MEDIUM:
	    building_count = 6;
	case SMALL:
	    building_count = 3;
	default:
	    building_count = 1;
	}
	b_set = new Building[building_count];
	b_set[0] = new Government_Build("Gov", "me", "ok", false); // placeholder values
	for(int i = 1; i < building_count; i++){
	    b_set[i] = new Shop();
	    
	}
	return b_set;
	
    }
    
    private static UndirectedGraph<Planet, DefaultEdge> generateWorld(){
        UndirectedGraph<Planet, DefaultEdge> world =
            new SimpleGraph<Planet, DefaultEdge>(DefaultEdge.class);
	for (int k = 0; k < 3; k++){
	    Planet connection = null;
	    Planet center = null;
	    for (int i = 0; i < 5; i++){
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

		/**This current method of adding edges between planets is not
		 incredibly sophisticated, needs some serious working on*/
		
		world.addVertex(plnt);
		if(i == 0){
		    center = plnt;
		    if(connection != null) world.addEdge(plnt, connection); 
		}else{
		    world.addEdge(plnt, center); 
		}
		if(i == 4) connection = plnt;
	    }
	    
	    
	}

	return world;
    }
    
    private static Player newPlayer(){
	Player p = Player.getPlayer();;
	Scanner scan = new Scanner(System.in);
	System.out.println("> What is your name?\n> ");
	p.setName(scan.next());
	System.out.println("> What is the name of your ship?\n> ");
	p.setShip(new Ship(scan.next()));

	return p;
    }
       
}
