import java.awt.image.BufferedImage;


public abstract class Card {
	BufferedImage front;
	BufferedImage back;
	boolean permanent;
	String name;
	String description1;
	String description2;
	int value;
	int cost;
	
	public Card(BufferedImage f, BufferedImage b, boolean p, String n, 
			String d1, String d2, int v, int c){
		front = f;
		back = b;
		permanent = p;
		name = n;
		description1 = d1;
		description2 = d2;
		value = v;
		cost = c;
	}
	public abstract void execute();
}
