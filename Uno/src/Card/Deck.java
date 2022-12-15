package Card;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> deck;

	public Deck() { // cons
		deck = new ArrayList<Card>();
		String[] colors = { "red", "blu", "grn", "ylw" };
		Integer[] numbers = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 0 }; // regular cards
		String[] actioncard = { "2", "2" }; // action cards +2, +2
		String[] wildcards = { "4", "4" }; // wild

		for (String c : colors) { // adding regular cards to the deck
			for (int i : numbers) {
				deck.add(new NumberCard(i, c)); // adding new cards to our deck
			}
		}

		for (String i : actioncard) { // adding action cards to the deck
			deck.add(new ActionCard(i));
		}

		for (String i : wildcards) { // adding wild cards to the deck
			deck.add(new WildCard(i));
		}

	}

	public boolean isEmpty() { // is deck empty?
		/*
		 * Checks the size of the deck. If it is greater than 0 then returns false. If
		 * not, returns true
		 */

		if (deck.size() > 0) {
			return false;
		}
		return true;
	}

	public void shuffle() {

		/*
		 * Shuffles the deck
		 */

		Collections.shuffle(deck);

	}

	public Card getTopCard() {
		/*
		 * gets the topmost card from a inverted deck
		 */
		return deck.remove(deck.size() - 1);
	}

	public Card peek() {

		return deck.get(deck.size() - 1);
	}

	public String toString() {


return "hello world";
	}

}
