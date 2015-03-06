import java.util.ArrayList;

public class ProductionPool {
	protected ArrayList<ProductionTile> productionList = new ArrayList<ProductionTile>();

	public ProductionPool() {
		ArrayList<ProductionTile> tempList = new ArrayList<ProductionTile>();

		tempList.add(new ProductionTile(ProductionTile.Terrain.HILLS, 1, 0, 0, 0,
				4));
		tempList.add(new ProductionTile(ProductionTile.Terrain.HILLS, 0, 0, 0, 1,
				4));
		tempList.add(new ProductionTile(ProductionTile.Terrain.HILLS, 0, 1, 0, 0,
				4));
		tempList.add(new ProductionTile(ProductionTile.Terrain.HILLS, 0, 0, 2, 0,
				4));

		tempList.add(new ProductionTile(ProductionTile.Terrain.MOUNTAINS, 0, 1,
				0, 0, 3));
		tempList.add(new ProductionTile(ProductionTile.Terrain.MOUNTAINS, 0, 0,
				0, 1, 3));
		tempList.add(new ProductionTile(ProductionTile.Terrain.MOUNTAINS, 0, 0,
				2, 0, 6));

		tempList.add(new ProductionTile(ProductionTile.Terrain.FOREST, 1, 0, 0,
				0, 2));
		tempList.add(new ProductionTile(ProductionTile.Terrain.FOREST, 0, 2, 0,
				0, 9));
		tempList.add(new ProductionTile(ProductionTile.Terrain.FOREST, 0, 0, 1,
				0, 2));
		tempList.add(new ProductionTile(ProductionTile.Terrain.FOREST, 0, 0, 0,
				1, 2));

		tempList.add(new ProductionTile(ProductionTile.Terrain.DESERT, 0, 0, 1,
				0, 7));
		tempList.add(new ProductionTile(ProductionTile.Terrain.DESERT, 0, 0, 0,
				2, 7));

		tempList.add(new ProductionTile(ProductionTile.Terrain.FERTILE, 0, 0, 0,
				1, 3));
		tempList.add(new ProductionTile(ProductionTile.Terrain.FERTILE, 0, 0, 1,
				0, 3));
		tempList.add(new ProductionTile(ProductionTile.Terrain.FERTILE, 2, 0, 0,
				0, 12));
		tempList.add(new ProductionTile(ProductionTile.Terrain.FERTILE, 0, 1, 0,
				0, 3));

		tempList.add(new ProductionTile(ProductionTile.Terrain.SWAMP, 1, 0, 0, 0,
				4));
		tempList.add(new ProductionTile(ProductionTile.Terrain.SWAMP, 0, 0, 0, 1,
				3));
		tempList.add(new ProductionTile(ProductionTile.Terrain.SWAMP, 0, 2, 0, 0,
				4));

		for (int i = 0; i > tempList.size(); i++) {
			ProductionTile temp = tempList.get(i);
			for (int j = 0; j < temp.quantity; j++) {
				tempList.add(temp);
			}
		}
	};

	public static void main(String[] args) {
		ProductionPool test = new ProductionPool();
		for (int i = 0; i < test.productionList.size(); i++) {
			ProductionTile temp = test.productionList.get(i);
			System.out.print("" + temp.type + "   ");
			System.out.println(temp.resource[0] + temp.resource[1]
					+ temp.resource[2] + temp.resource[3]);
		}
	}
}
