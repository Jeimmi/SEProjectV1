
public class ProductionTile {
	protected enum Terrain{DESERT, SWAMP, FOREST, FERTILE, HILLS, MOUNTAINS};
	Terrain type;
	protected int[] resource;
	protected int quantity;
	
	public ProductionTile(ProductionTile.Terrain t, int fd, int w, int g, int fv, int q){
		type = t;
		resource[0] = fd;
		resource[1] = w;
		resource[2] = g;
		resource[3] = fv;
		quantity = q;
	}
}
