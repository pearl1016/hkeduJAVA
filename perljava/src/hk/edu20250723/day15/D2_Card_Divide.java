package hk.edu20250723.day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D2_Card_Divide {

	 public static final String[] DECK = {"◆", "♥", "♣", "♠"};
	    public static final String[] STECK = {
	        "A", "2", "3", "4", "5", "6", "7",
	        "8", "9", "10", "J", "Q", "K"
	    };

	    // 카드 덱 생성
	    public static List<String> makeDeck() {
	        List<String> deck = new ArrayList<>();
	        for (String shape : DECK) {
	            for (String number : STECK) {
	                deck.add(shape + number);
	            }
	        }
	        return deck;
	    }
}
