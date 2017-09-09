import org.jgrapht.*;
import org.jgrapht.graph.*;

public final class GameState{
    private static Player p;
    private static UndirectedGraph<Planet, DefaultEdge> world; 
    private static final GameState state_instance = new GameState();
    
    private GameState(){
    }

    public static GameState getState(){
	return state_instance;
    }

    public void init(Player p, UndirectedGraph<Planet, DefaultEdge> world){
        this.p = p;
	this.world = world;
    }

}
   

