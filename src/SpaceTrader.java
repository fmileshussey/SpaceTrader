

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
	game = GameState.getState();
	if(argc < 1){
	    Player p = Player.getPlayer();
	    game.init(p, true);
	}else{
	    game.init(p, false); // not sure how this is gonna work
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

