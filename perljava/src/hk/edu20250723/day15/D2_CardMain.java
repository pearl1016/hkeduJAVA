package hk.edu20250723.day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D2_CardMain {

	public static void main(String[] args) {
//		D2_Card card = new D2_Card();
//		System.out.println(card);
		
		D2_CardCase cardCase = new D2_CardCase();
		List<D2_Card> cards = cardCase.getCards();
		
		for (int i = 0; i < cards.size(); i++) {
			System.out.print(cards.get(i)+"\t");
			if((i+1)%10==0) {
				System.out.println();
			}
			
		}
	
    } // main 끝

} // 클래스 끝
