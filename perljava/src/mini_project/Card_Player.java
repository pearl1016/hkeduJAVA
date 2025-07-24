// Card_Player.java
package mini_project;

import java.util.ArrayList;
import java.util.List;

public class Card_Player {
    private String name;
    private List<Card> hand = new ArrayList<>();

    private int money = 1000000;       // 💰 기본 소지금
    private int betAmount = 0;      // 이번 판 베팅 금액

    public Card_Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void receiveCard(Card card) {
        hand.add(card);
    }

    // 💰 돈 관련 메서드들
    public int getMoney() {
        return money;
    }

    public int getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(int amount) {
        this.betAmount = amount;
    }

    // 베팅에서 승리 시
    public void win(int amount) {
        money += amount;
    }

    // 베팅에서 패배 시
    public void lose() {
        money -= betAmount;
        if (money < 0) money = 0; // 마이너스 방지
    }

    // 다음 라운드를 위해 손에 든 카드 리셋
    public void resetHand() {
        hand.clear();
        betAmount = 0;
    }
}
