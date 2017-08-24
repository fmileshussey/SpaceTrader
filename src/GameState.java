import java.util.Scanner;

public class GameState{
    private Player p;
    
    public GameState(Player p){
	this.p = p;
	new NewGame().init();
    }


    private class NewGame{
    
	private void init(){
	    generateWorld();
	    newPlayer();
	}

	private void generateWorld(){
	    
	}

	private void newPlayer(){
	    Scanner scan = new Scanner(System.in);
	    System.out.println("> What is your name?\n> ");
	    p.setName(scan.next());
	    System.out.println("> What is the name of your ship?\n> ");
	    p.setShip(new Ship(scan.next()));
	}

    }

   

}
