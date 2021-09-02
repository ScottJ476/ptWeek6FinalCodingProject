package war.card.game;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand;
	private int score;
	private String name;
	
	public Player(String name) {
		hand = new ArrayList<>();
		score = 0;
		this.name = name;	
	}
	
	public void describe() {
		System.out.println(name + ": Score is " + score);
		
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		int lastCard = hand.size() - 1;
		Card card = hand.get(lastCard);
		hand.remove(lastCard);
		return card;
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
		System.out.print(getName() + " wins this round: \t");
	}
	
	// GETTERS AND SETTERS  I commented out the Setters since they are not needed/desired.
	
	public List<Card> getHand() {
		return hand;
	}
	
//	public void setHand(List<Card> hand) {
//		this.hand = hand;
//	}
	
	public int getScore() {
		return score;
	}
	
//	public void setScore(int score) {
//		this.score = score;
//	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
