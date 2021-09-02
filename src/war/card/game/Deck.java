package war.card.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Deck {

	private List<Card> cards;
	
	public Deck() {
		cards = new ArrayList<>();
		List<String> suits = Arrays.asList("Clubs", "Spades", "Hearts", "Diamonds");
		
		Map<Integer, String> faceValues = new HashMap<>();
		faceValues.put(2, "Two");
		faceValues.put(3, "Three");
		faceValues.put(4, "Four");
		faceValues.put(5, "Five");
		faceValues.put(6, "Six");
		faceValues.put(7, "Seven");
		faceValues.put(8, "Eight");
		faceValues.put(9, "Nine");
		faceValues.put(10, "Ten");
		faceValues.put(11, "Jack");
		faceValues.put(12, "Queen");
		faceValues.put(13, "King");
		faceValues.put(14, "Ace");
		
		for(String suit : suits) {
			for (int key : faceValues.keySet()) {
				cards.add(new Card(key, faceValues.get(key) + " of " + suit));
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		int lastCard = cards.size() - 1;
		Card card = cards.get(lastCard);
		cards.remove(lastCard);
		return card;
	}
	
	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}
	
	// GETTERS AND SETTERS     I commented out the Setters since they are not needed/desired.
	
	public List<Card> getCards() {
		return cards;
	}

//	public void setCards(List<Card> cards) {
//		this.cards = cards;
//	}
}
	

