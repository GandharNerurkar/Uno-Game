package Player;

import java.util.ArrayList;
import java.util.Scanner;

import Card.Card;

public class Player {
	
	private ArrayList<Card> playercards; 
	private String name; //player name
	 
	
	
	//if cards 
	public boolean winner(){
		if(playercards.size()==0) {
			return true;
		}
		return false;
	}
	
	
	
	
}
