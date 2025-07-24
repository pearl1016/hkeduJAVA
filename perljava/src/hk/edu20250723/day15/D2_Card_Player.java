package hk.edu20250723.day15;

import java.util.ArrayList;
import java.util.List;

public class D2_Card_Player {
    // Player 클래스: 이름과 카드 2장을 가짐
    private String name;
    private List<String> hand = new ArrayList<>();

    public D2_Card_Player(String name) {
        this.name = name;
    }

    public void receiveCard(String card) {
        if (hand.size() < 2) {
            hand.add(card);
        }
    }

    public void showHand() {
        System.out.println(name + "의 카드: " + hand);
    }

    public List<String> getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }
}
