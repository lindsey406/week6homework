import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand;
	private int score;
	private String name;

	public Player() {
		score = 0;
		hand = new ArrayList<>();
	}

	public void describe() {
		System.out.println(name);
		System.out.println(score);
		for (Card handCard : hand) {
			handCard.describe();
		}
	}

	public Card flip() {
		Card flippedCard = hand.get(0);
		hand.remove(0);
		return flippedCard;

	}

	public void draw(Deck gameDeck) {
		Card drawnCard = gameDeck.draw();
		hand.add(drawnCard);

	}

	public void incrementScore() {
		score += 1;
	}

	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
