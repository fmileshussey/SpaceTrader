/**
 * SpaceTrader.java
 * @desc A terminal based trading game set in Space.
 * @author Finnegan Miles-Hussey
 * @version 0.1.0
 */

import org.jgrapht.*;
import org.jgrapht.graph.*;
import java.util.Scanner;

public class SpaceTrader {

    private int argc;
    private GameState game;
    
    private void run(){
	init();
	loop();
    }

    private void init(){
	Player p;
	System.out.println("\033[34mWelcome to SpaceTrader \033[0m");
	if(argc < 1){
	    p = Player.getPlayer();
	    new NewGame().init(game);
	    game = game.getState();
	    System.out.print(p.getName() + "@" + p.getLocation());
	    System.out.println("> For a list of commands, type \"\033[34mhelp\033[0m\"");
	}else{
	    //UndirectedGraph<Planet, DefaultEdge> world;
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
	Player p = game.getPlayer();
	Scanner userInput = new Scanner(System.in);
	String command;
	String name = p.getName(), location = p.getLocation();
	boolean running = true;
	while(running){
	    /**the main game loop is going to take a bit of tinkering
	     * Initial idea is to take a command from a player, determine 
	     * what to do with said command amd either reject or update
	     * and on a specific command breakset running = false.
	    **/
	    System.out.print(name + "@" + location + "> ");
	    command = userInput.next(); //pass to a method that checks it to a HashMap?
	    if(command.equals("quit")){
		running = false;
	    }else{
		
	    }
	}
	//game.save();
    }

    public static void main(String[] args) {
        new SpaceTrader().run();
    }
}

