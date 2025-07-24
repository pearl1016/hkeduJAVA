package hk.edu20250723.day15;


//Card클래스는 카드 한장을 의미
public class D2_Card {

	
	//카드를 만들기 위해 필요한 필드를 선언
	//[그림+숫자]: 카드객체를 생성하면 만들어지는 문자열"그림+숫자"
	//           --> 랜덤하게 만들어지도록 하자.
	public static final String[] DECK = {"◆","♥","♣","♠"};
	public static final String[] STECK = {
	        "A", "2", "3", "4", "5", "6", "7",
	        "8", "9", "10", "J", "Q", "K"
	    };
	
	

	
	//카드 한장의 대한 정보를 저장할 필드 : 그림+숫자
	private String card; // ex) "◆7"로 저장됨

	public D2_Card() {
		init();
	}
	
	//카드 한장을 만드는 기능 
	public void init() {
		int a = (int)(Math.random()*DECK.length);  //0~3까지 생성
		int b = (int)(Math.random()*STECK.length);  //0~12까지 생성
		card=DECK[a] + STECK[b];  // ex) "◆3"로 저장됨 
	}
	
	//은닉화: 메서드 통해 접근가능
	public String getCard() {
		return card;
	}
	
	
//	System.out.println(Card) --> [그림+숫자]
	@Override
	public String toString() {
		
		return "["+card+"]";
	}
	
	//Card객체 내부에 멤버필드인 card
	@Override
	public boolean equals(Object obj) {
		boolean isS = false;
		D2_Card ca = (D2_Card)obj; //card --> object --> card 형변환
		if(this.card.equals(ca.getCard())) {
			isS = true;
		}
		
		return isS;
	}
	
	//equals()를 오버라이딩하면 hashcode()도 오버라이딩해야함
	public int hashCode() {
		return card.hashCode()+137;
	}
	

}
