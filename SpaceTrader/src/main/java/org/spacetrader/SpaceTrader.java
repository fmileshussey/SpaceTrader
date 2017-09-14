import org.jgrapht.*;
import org.jgrapht.graph.*;
import java.util.Scanner;

/**
 * SpaceTrader.java - A space based trading game.
 *
 * @author Finnegan Miles-Hussey
 * @version 0.1.0
 */
public class SpaceTrader {

    private int argc;
    private GameState game;
    
    private void run(){
	init();
	loop();
    }

    private void init(){
	Player p;
	System.out.println("> Welcome to SpaceTrader");
	if(argc < 1){
	    p = Player.getPlayer();
	    new NewGame().init(game);
	}else{
	    UndirectedGraph<Planet, DefaultEdge> world;
	    game = game.getState(); // not sure how this is gonna work 
	    //p = LoadSave.loadPlayer();
	    //world = LoadSave.loadWorld();
	    //game.init(p, world);
	}
    }

    /**
     * loop() - the main game loop
     */
    private void loop(){
	Scanner userInput = new Scanner(System.in);
	String command;
	boolean running = true;
	while(running){
	    /**the main game loop is going to take a bit of tinkering
	     * Initial idea is to take a command from a player, determine 
	     * what to do with said command amd either reject or update
	     * and on a specific command breakset running = false.
	    **/
	    System.out.print("> ");
	    command = userInput.next(); //pass to a method that checks it to a HashMap?
	    if(command.equals("quit")){
		running = false;
	    }else{
		
	    }
	}
	game.save();
    }

    public static void main(String[] args) {
        new SpaceTrader().run();
    }
}

