import java.awt.image.BufferedImage;

public class BuildingCard extends Card{
	public BuildingCard(BufferedImage f, BufferedImage b, boolean p, String n, 
			String d1, String d2, int v, int c){
		super(f, b, p, n, d1, d2, v, c);
	}
	
	public void displayAvailable(Player p){}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
}