package war.card.game;

public class App {

	static Player player1 = new Player("Player 1");
	static Player player2 = new Player("Player 2");
	
	public static void main(String[] args) {
		
		Deck deck = new Deck();
		deck.describe();
		
		System.out.println("------------------");
		deck.shuffle();
		deck.describe();
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		System.out.println("------------------");
		player1.describe();
		System.out.println("------------------");
		player2.describe();
		System.out.println("------------------");
		
		for (int i = 0; i < 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
			System.out.println("Round " + (i + 1) + ":");
			System.out.println(player1.getName() + ": " + player1Card.getName());
			System.out.println(player2.getName() + ": " +  player2Card.getName());
			
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
				printScore();
			} else if (player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();
				printScore();
			} else {
				System.out.println("This round is a tie.");
			}
			System.out.println("------------------");
			
		}
		
		System.out.println("------------------");
		System.out.println("Final Scores:");
		printScore();
		
		System.out.println("------------------");
		System.out.print("Winner: ");
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName());
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName());
		} else {
			System.out.println("Draw");
		}
	}
	
	public static void printScore() {
		System.out.println("Player 1 Score is " + player1.getScore() + ": Player 2 Score is " + player2.getScore());
	}
}
