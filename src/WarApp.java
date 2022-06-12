
public class WarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck deck = new Deck();
		deck.shuffle();

		Player player1 = new Player();
		player1.setName("Jean");

		Player player2 = new Player();
		player2.setName("Joe");

		for (int i = 0; i < 26; i++) {
			player1.draw(deck);
			player2.draw(deck);
		}
		for (int i = 0; i < 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();

			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
			} else if (player1Card.getValue() < player2Card.getValue()) {
				player2.incrementScore();
			}
		}

		System.out.println(player1.getName() + " score: " + player1.getScore());
		System.out.println(player2.getName() + " score: " + player2.getScore());

		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("Player 2");
		} else {
			System.out.println("Draw");
		}

	}

}
