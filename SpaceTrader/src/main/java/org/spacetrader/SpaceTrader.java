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
	    game = game.getState(); // not sure how this is gonna work
	    game.init();
	    p = LoadSave.loadPlayer();
	    LoadSave.loadWorld();
	}
    }

    /**
     * loop() - the main game loop
     */
    private void loop(){
	boolean running = true;
	while(running){
	    
	}
	game.save();
    }

    public static void main(String[] args) {
        new SpaceTrader().run();
    }
}

