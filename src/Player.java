import java.util.ArrayList;


public class Player {
	ArrayList<Card> hand = new ArrayList<Card>();
	ArrayList<ProductionTile> production = new ArrayList<ProductionTile>();
	ArrayList<Building> city = new ArrayList<Building>();
	ArrayList<Card> randomDeck = new ArrayList<Card>();
	ArrayList<Card> permanentDeck = new ArrayList<Card>();
	Player next;
	
	public void shuffle(ArrayList<Card> deck){
		ArrayList<Card> tempDeck = new ArrayList<Card>();
		int temp;
	}
	
	public void drawCard(){
		Card temp = rDeck.get(0);
		rDeck.remove(0);
		hand.add(temp);
	}
}
