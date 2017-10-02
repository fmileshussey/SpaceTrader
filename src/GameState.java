/**
 * GameState.java
 * @desc Singleton class that maintains the gamestate throughout the 
 * life of the process
*/

import org.jgrapht.*;
import org.jgrapht.traverse.*;
import org.jgrapht.graph.*;

public final class GameState{
    private static Player p;
    private static boolean initiated = false;
    private static UndirectedGraph<Planet, DefaultEdge> world; 
    private static final GameState state_instance = new GameState();
    
    private GameState(){
    }

    public static GameState getState(){
	return state_instance;
    }

    public void init(Player p, UndirectedGraph<Planet, DefaultEdge> world){
	if(initiated){
	    System.err.println("GameState has already been initiated!");
	    return;
	}
        this.p = p;
	this.world = world;
	initiated = true;
    }

    public void save(){
	Planet plnt;
	p.save();
	//BreadthFirstIterator worldIterator = new BreadthFirstIterator(world);
	//while(worldIterator.hasNext()){
	    //plnt = worldIterator.provideNextVertex();
	    //plnt.save();
	//}
    }

}
   

