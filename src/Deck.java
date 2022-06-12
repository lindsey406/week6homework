import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	private List<Card> cards = new ArrayList<Card>();

	public Deck() {
		String[] suits = { "Hearts", "Spades", "Clubs", "Diamonds" };
		String[] cardNames = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
				"King", "Ace" };
		for (String suit : suits) {
			for (int i = 2; i < 15; i++) {
				Card c = new Card();
				c.setName(cardNames[i - 2] + " of " + suit);
				c.setValue(i);
				cards.add(c);
			}
		}

	}

	public void shuffle() {
		Random random = new Random();

		List<Card> shuffledList = new ArrayList<>(52);

		while (cards.size() > 0) {
			int j = random.nextInt(cards.size());
			Card shuffledCard = cards.get(j);
			shuffledList.add(shuffledCard);
			cards.remove(j);
		}
		cards = shuffledList;
	}

	public Card draw() {
		Card currentCard = cards.get(0);
		cards.remove(0);
		return currentCard;
	}

}
