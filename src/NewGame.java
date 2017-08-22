public class NewGame{
    private Player p;
    public NewGame(Player p){
	this.p = p;
	init();
    }

    private void init(){
	
	
    }

    private void newPlayer(){
	Scanner scan = new Scanner(System.in);
	System.out.println("> What is your name?\n> ");
	p.name = scan.next();
	System.out.println("> What is the name of your ship?\n> ");
    }

}
