import java.awt.image.BufferedImage;


public class Building {
	protected enum Type{HOUSE, MARKET, STOREHOUSE, QUARRY, MONUMENT, GRANARY,
							  WOOD_WORKSHOP, GOLD_MINT, GREAT_TEMPLE, THE_WONDER
	}
	Type type;
	private int[] cost = new int[4]; //[food, wood, gold, favor]
	BufferedImage image;
	
	public Building(Building.Type t, int food, int wood, int gold, int favor){
		type = t;
		cost[0] = food;
		cost[1] = wood;
		cost[2] = gold;
		cost[3] = favor;
	}
	public Building(int food, int wood, int gold, int favor, BufferedImage i){
		cost[0] = food;
		cost[1] = wood;
		cost[2] = gold;
		cost[3] = favor;
		image = i;
	}
	
	int[] getCost(){
		return cost;
	}
	
	public void setCost(int food, int wood, int gold, int favor){
		cost[0] = food;
		cost[1] = wood;
		cost[2] = gold;
		cost[3] = favor;
	}
	
	public Building reduce(int n){
		Building temp = new Building(this.cost[0], this.cost[1], this.cost[2], this.cost[3]);
		temp.cost[n] = temp.cost[n] - 1;
		return temp;
	}

}
