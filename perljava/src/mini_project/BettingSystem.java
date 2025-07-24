package mini_project;

public class BettingSystem {
    private int balance;    // 현재 플레이어가 가진 돈
    private int currentBet; // 현재 게임에서 베팅한 금액

    public BettingSystem(int initialBalance) {
        this.balance = initialBalance;
        this.currentBet = 0;
    }

    // 베팅 설정
    public boolean placeBet(int amount) {
        if (amount > balance || amount <= 0) {
            System.out.println("베팅 실패: 잔액 부족 또는 잘못된 금액.");
            return false;
        }
        currentBet = amount;
        balance -= amount;
        System.out.println("베팅 성공: " + amount + "원");
        return true;
    }

    // 게임에서 이겼을 때
    public void winBet(double multiplier) {
        int winnings = (int)(currentBet * multiplier);
        balance += winnings;
        System.out.println("이겼습니다! " + winnings + "원 획득");
        currentBet = 0;
    }

    // 게임에서 졌을 때
    public void loseBet() {
        System.out.println("졌습니다. 베팅 금액 " + currentBet + "원 손실");
        currentBet = 0;
    }

    public int getBalance() {
        return balance;
    }

    public int getCurrentBet() {
        return currentBet;
    }
}
