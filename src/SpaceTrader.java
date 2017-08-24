

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
	System.out.println("> Welcome to SpaceTrader");
	if(argc < 1){
	    Player p = new Player();
	    game = new GameState(p);
	    
	}else{
	    game = new GameState();
	}
    }

    /**
     * loop() - the main game loop
     */
    private void loop(){
	boolean running = true;
	while(running){
	    
	}
    }

    public static void main(String[] args) {
        new SpaceTrader().run();
    }
}

