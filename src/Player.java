public enum Player{
    INSTANCE;
    private String location, name;
    private Ship ship;
    
    public void setName(String name){
	this.name = name;
    }

    public void setShip(Ship ship){
	this.ship = ship;
    }
}

