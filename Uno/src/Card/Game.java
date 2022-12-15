package Card;

import java.util.ArrayList;
import java.util.Scanner;

import Player.Player;



public class Game {
	private Card current; 							// the current card or previously played card or starting card
	private Deck deck; 								// the deck of the game
	private ArrayList<Card> cardpile; 				//when players throw card, it piles up here
	private int penalty;
	private Scanner choice;    						//scans what is users choice
	private Player p1,p2;     						//player 1 and 2
	private int pick;        						// players pick
	
	//constructor
	public Game() {
		deck = new Deck();        //getting deck ready for the game 
		
	}

	public void newgame() {
		
		//initially turn is initialized to 0
		int turn=0;
		
		
	}
	
	
}
