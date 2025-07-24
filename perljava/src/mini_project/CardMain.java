package mini_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardMain {

    // 카드 출력용 헬퍼 메서드
    private static void printCards(List<Card> cards) {
        for (Card c : cards) {
            System.out.print("[" + c + "] ");
        }
        System.out.println();
    }

    // 빈 줄 출력 헬퍼
    private static void printBlankLines(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }

    // 플레이어별 결과 저장용 내부 클래스
    static class PlayerResult {
        Card_Player player;
        PokerHandEvaluator.HandResult handResult;
        boolean bet;

        PlayerResult(Card_Player player, PokerHandEvaluator.HandResult handResult, boolean bet) {
            this.player = player;
            this.handResult = handResult;
            this.bet = bet;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== 3인용 포커 게임 시작 ===\n");

        CardCase deck = new CardCase();

        List<Card_Player> players = new ArrayList<>();
        players.add(new Card_Player("Player1"));
        players.add(new Card_Player("Player2"));
        players.add(new Card_Player("Player3"));

        // 카드 5장씩 나눠주기
        for (int i = 0; i < 5; i++) {
            for (Card_Player p : players) {
                Card c = deck.drawCard();
                p.receiveCard(c);
            }
        }

        Scanner sc = new Scanner(System.in);
        List<PlayerResult> results = new ArrayList<>();

        for (Card_Player p : players) {
            printBlankLines(4);

            System.out.println("=======================================");
            System.out.printf("🎯 %s님의 차례입니다!\n", p.getName());
            System.out.println("---------------------------------------");
            System.out.print("카드: ");
            printCards(p.getHand());
            System.out.println();

            PokerHandEvaluator.HandResult result = PokerHandEvaluator.evaluate(p.getHand());
            System.out.println("🎲 족보: ::: " + result.getRank() + " :::");
            System.out.println("---------------------------------------");

            System.out.print(p.getName() + " 베팅하시겠습니까? (y/n) : ");
            String answer = sc.nextLine();

            boolean bet = answer.equalsIgnoreCase("y");
            if (bet) {
                System.out.printf("%s님의 현재 금액: %d원\n", p.getName(), p.getMoney());

                int amount = 0;
                while (true) {
                    System.out.print("베팅 금액 입력: ");
                    try {
                        amount = Integer.parseInt(sc.nextLine());
                        if (amount > 0 && amount <= p.getMoney()) {
                            break;
                        } else {
                            System.out.println("⚠️ 금액이 유효하지 않습니다. 다시 입력해주세요.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("⚠️ 숫자로 입력해주세요.");
                    }
                }

                p.setBetAmount(amount);
                System.out.println(p.getName() + " 👉 " + amount + "원 베팅 참여!");
            } else {
                System.out.println(p.getName() + " 👉 베팅 포기!");
            }

            results.add(new PlayerResult(p, result, bet));
            printBlankLines(30);
        }

        // 전체 결과 출력
        System.out.println("\n=== 모든 플레이어 카드 및 베팅 결과 ===");
        System.out.println("=======================================");
        for (PlayerResult r : results) {
            System.out.printf("%s의 카드: ", r.player.getName());
            printCards(r.player.getHand());
            System.out.printf("족보: %s\n", r.handResult.getRank());
            System.out.printf("베팅 여부: %s\n", r.bet ? "참여" : "포기");
            if (r.bet) {
                System.out.printf("베팅 금액: %d원\n", r.player.getBetAmount());
            }
            System.out.println("---------------------------------------");
        }

        // 베팅 참여자 필터링
        List<Card_Player> bettingPlayers = new ArrayList<>();
        List<PokerHandEvaluator.HandResult> handResults = new ArrayList<>();

        for (PlayerResult r : results) {
            if (r.bet) {
                bettingPlayers.add(r.player);
                handResults.add(r.handResult);
            }
        }

        if (bettingPlayers.isEmpty()) {
            System.out.println("베팅 참여자가 없습니다. 게임 종료");
        } else {
            // 승자 찾기
            Card_Player winner = bettingPlayers.get(0);
            PokerHandEvaluator.HandResult bestHand = handResults.get(0);

            for (int i = 1; i < bettingPlayers.size(); i++) {
                PokerHandEvaluator.HandResult hr = handResults.get(i);
                if (hr.compareTo(bestHand) > 0) {
                    bestHand = hr;
                    winner = bettingPlayers.get(i);
                }
            }

            // 총 베팅금 계산 및 정산
            int totalPot = 0;
            for (Card_Player p : bettingPlayers) {
                totalPot += p.getBetAmount();
                if (p != winner) {
                    p.lose(); // 베팅금 차감
                }
            }
            winner.win(totalPot); // 승자에게 총 베팅금 지급

            System.out.println("=======================================");
            System.out.printf("🏆 최종 승자: %s (%s) 🏆\n", winner.getName(), bestHand.getRank());
            System.out.printf("💰 상금: %d원 지급!\n", totalPot);
            System.out.println("=======================================");
        }

        // 최종 잔액 출력
        System.out.println("\n=== 최종 잔액 현황 ===");
        for (Card_Player p : players) {
            System.out.printf("%s: %d원\n", p.getName(), p.getMoney());
        }

        sc.close();
        System.out.println("\n게임 종료");
    }
}
