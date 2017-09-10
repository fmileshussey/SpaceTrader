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
	    Player p = Player.getPlayer();
	    new NewGame().init(game);
	}else{
	    game = game.getState(); // not sure how this is gonna work
	    game.init();
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

