import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public final class GameState{
    private static Player p;
    private static final GameState state_instance = new GameState();
    
    private GameState(){
    }

    public static GameState getState(){
	return state_instance;
    }

    public void init(){
        
    }

}
   

