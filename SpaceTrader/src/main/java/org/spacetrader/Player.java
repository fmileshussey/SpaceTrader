public final class Player{
    private static final Player p_instance = new Player();
    private String location, name;
    private Ship ship;
    
    private Player(){
    }

    
    public static Player getPlayer(){
	return p_instance;
    }
    
    public void setName(String name){
	this.name = name;
    }

    public void setShip(Ship ship){
	this.ship = ship;
    }

    public void save(){}
}

