package mini_project;

import java.util.Objects;

public class Card {

    // 카드 문양과 숫자 상수 배열 (필요하면)
    public static final String[] DECK = {"◆", "♥", "♣", "♠"};
    public static final String[] STECK = {
        "A", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "J", "Q", "K"
    };

    private String suit;  // 문양, ex) "◆"
    private String rank;  // 숫자 또는 문자, ex) "A", "10", "K"

    // 기본 생성자 - 랜덤 카드 생성
    public Card() {
        int a = (int)(Math.random() * DECK.length);
        int b = (int)(Math.random() * STECK.length);
        this.suit = DECK[a];
        this.rank = STECK[b];
    }

    // 명시적 생성자 - 카드 지정해서 만들기
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    // 보기 좋은 출력
    @Override
    public String toString() {
        String value = rank.length() == 1 ? " " + rank : rank; // 1자리 숫자 앞에 공백
        return "[" + suit + value + "]";
    }

    // equals와 hashCode는 suit와 rank 기준
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Card)) return false;
        Card other = (Card) obj;
        return this.suit.equals(other.suit) && this.rank.equals(other.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }
}
