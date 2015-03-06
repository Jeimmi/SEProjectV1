import java.util.ArrayList;

public class BuildingPool {
	ArrayList<Building> buildOptions = new ArrayList<Building>();
	
	public BuildingPool(){
		buildOptions.add(new Building(Building.Type.MARKET, 0,0,3,2));
		buildOptions.add(new Building(Building.Type.STOREHOUSE, 2,2,2,2));
		buildOptions.add(new Building(Building.Type.QUARRY, 4,0,1,0));
		buildOptions.add(new Building(Building.Type.MONUMENT, 3,0,2,0));
		buildOptions.add(new Building(Building.Type.GRANARY, 0,2,3,0));
		buildOptions.add(new Building(Building.Type.WOOD_WORKSHOP, 2,0,3,0));
		buildOptions.add(new Building(Building.Type.GOLD_MINT, 3,2,0,0));
		buildOptions.add(new Building(Building.Type.GREAT_TEMPLE, 4,4,4,4));
		buildOptions.add(new Building(Building.Type.THE_WONDER, 10,10,10,10));
		
		for(int i = 0; i < 10; i++){
			buildOptions.add(new Building(Building.Type.HOUSE, 2,2,0,0));
		}
	}
}
