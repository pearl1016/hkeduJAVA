package mini_project;

import java.util.*;

public class PokerHandEvaluator {

    public enum HandRank {
        HIGH_CARD, ONE_PAIR, TWO_PAIR, THREE_OF_A_KIND, STRAIGHT,
        FLUSH, FULL_HOUSE, FOUR_OF_A_KIND, STRAIGHT_FLUSH, ROYAL_FLUSH
    }

    // 족보 평가 결과 클래스
    public static class HandResult implements Comparable<HandResult> {
        private HandRank rank;
        private List<Integer> rankValues; // tie breaker용 숫자들 (내림차순)

        public HandResult(HandRank rank, List<Integer> rankValues) {
            this.rank = rank;
            this.rankValues = rankValues;
        }

        public HandRank getRank() {
            return rank;
        }

        // 족보 비교
        @Override
        public int compareTo(HandResult o) {
            if (this.rank.ordinal() != o.rank.ordinal()) {
                return this.rank.ordinal() - o.rank.ordinal();
            }
            // 족보 같으면 rankValues를 비교
            for (int i = 0; i < Math.min(this.rankValues.size(), o.rankValues.size()); i++) {
                int cmp = this.rankValues.get(i) - o.rankValues.get(i);
                if (cmp != 0) return cmp;
            }
            return 0;
        }

        @Override
        public String toString() {
            return rank + " " + rankValues;
        }
    }

    // 메인 평가 함수: 7장 카드 리스트 중 최선 5장 족보 리턴
    public static HandResult evaluate(List<Card> cards) {
        if (cards.size() < 5) {
            throw new IllegalArgumentException("카드가 5장 이상이어야 합니다.");
        }

        // 7장 중 5장 조합 모두 검사
        List<List<Card>> combos = combinations(cards, 5);

        HandResult best = null;

        for (List<Card> combo : combos) {
            HandResult hr = evaluateFiveCards(combo);
            if (best == null || hr.compareTo(best) > 0) {
                best = hr;
            }
        }

        return best;
    }

    // 5장 카드 족보 평가
    private static HandResult evaluateFiveCards(List<Card> hand) {
        // 카드 랭크 내림차순 정렬 (A=14)
        List<Integer> ranks = new ArrayList<>();
        Map<Integer, Integer> rankCount = new HashMap<>();
        Map<String, Integer> suitCount = new HashMap<>();

        for (Card c : hand) {
            int r = rankToInt(c.getRank());
            ranks.add(r);
            rankCount.put(r, rankCount.getOrDefault(r, 0) + 1);
            suitCount.put(c.getSuit(), suitCount.getOrDefault(c.getSuit(), 0) + 1);
        }
        Collections.sort(ranks, Collections.reverseOrder());

        boolean flush = suitCount.values().stream().anyMatch(count -> count >= 5);
        boolean straight = isStraight(ranks);

        // 족보 판별
        // 4카드(포카드)
        if (rankCount.containsValue(4)) {
            int fourRank = getKeyByValue(rankCount, 4);
            List<Integer> kickers = getKickers(rankCount, Arrays.asList(fourRank));
            List<Integer> rankVals = new ArrayList<>();
            rankVals.add(fourRank);
            rankVals.addAll(kickers);
            return new HandResult(HandRank.FOUR_OF_A_KIND, rankVals);
        }

        // 풀하우스
        if (rankCount.containsValue(3) && rankCount.containsValue(2)) {
            int threeRank = getKeyByValue(rankCount, 3);
            int pairRank = getKeyByValue(rankCount, 2);
            return new HandResult(HandRank.FULL_HOUSE, Arrays.asList(threeRank, pairRank));
        }

        // 플러시
        if (flush) {
            return new HandResult(HandRank.FLUSH, ranks);
        }

        // 스트레이트
        if (straight) {
            return new HandResult(HandRank.STRAIGHT, Arrays.asList(Collections.max(ranks)));
        }

        // 트리플
        if (rankCount.containsValue(3)) {
            int threeRank = getKeyByValue(rankCount, 3);
            List<Integer> kickers = getKickers(rankCount, Arrays.asList(threeRank));
            List<Integer> rankVals = new ArrayList<>();
            rankVals.add(threeRank);
            rankVals.addAll(kickers);
            return new HandResult(HandRank.THREE_OF_A_KIND, rankVals);
        }

        // 투페어
        List<Integer> pairs = getKeysByValue(rankCount, 2);
        if (pairs.size() >= 2) {
            Collections.sort(pairs, Collections.reverseOrder());
            List<Integer> kickers = getKickers(rankCount, pairs);
            List<Integer> rankVals = new ArrayList<>();
            rankVals.addAll(pairs);
            rankVals.addAll(kickers);
            return new HandResult(HandRank.TWO_PAIR, rankVals);
        }

        // 원페어
        if (pairs.size() == 1) {
            List<Integer> kickers = getKickers(rankCount, pairs);
            List<Integer> rankVals = new ArrayList<>();
            rankVals.addAll(pairs);
            rankVals.addAll(kickers);
            return new HandResult(HandRank.ONE_PAIR, rankVals);
        }

        // 하이카드
        return new HandResult(HandRank.HIGH_CARD, ranks);
    }

    // rank String -> int 변환 (A=14, K=13, Q=12, J=11, 숫자는 그대로)
    private static int rankToInt(String rank) {
        switch(rank) {
            case "A": return 14;
            case "K": return 13;
            case "Q": return 12;
            case "J": return 11;
            default: return Integer.parseInt(rank);
        }
    }

    // 키커(핸드에 포함되지 않은 가장 높은 카드) 목록 반환
    private static List<Integer> getKickers(Map<Integer, Integer> rankCount, List<Integer> excludeRanks) {
        List<Integer> kickers = new ArrayList<>();
        for (int r = 14; r >= 2; r--) {
            if (!excludeRanks.contains(r) && rankCount.containsKey(r)) {
                kickers.add(r);
            }
        }
        return kickers;
    }

    // Map에서 특정 값(value)을 가진 키(key) 하나 반환
    private static int getKeyByValue(Map<Integer, Integer> map, int value) {
        return map.entrySet()
                .stream()
                .filter(e -> e.getValue() == value)
                .map(Map.Entry::getKey)
                .max(Integer::compare)
                .orElse(0);
    }

    // Map에서 특정 값(value)을 가진 키(key) 목록 반환
    private static List<Integer> getKeysByValue(Map<Integer, Integer> map, int value) {
        List<Integer> keys = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == value) {
                keys.add(e.getKey());
            }
        }
        return keys;
    }

    // 스트레이트 여부 판단 (내림차순 랭크 리스트 입력)
    private static boolean isStraight(List<Integer> ranks) {
        Set<Integer> set = new HashSet<>(ranks);
        // 에이스-2-3-4-5 스트레이트 체크 (Ace low)
        if (set.contains(14) && set.contains(2) && set.contains(3) && set.contains(4) && set.contains(5)) {
            return true;
        }

        int consecutive = 0;
        int last = -1;
        for (int r : ranks) {
            if (last == -1 || last - 1 == r) {
                consecutive++;
            } else if (last != r) {
                consecutive = 1;
            }
            last = r;
            if (consecutive >= 5) return true;
        }
        return false;
    }

    // 7장 중 n장 조합 만들기 (조합 알고리즘)
    private static List<List<Card>> combinations(List<Card> arr, int n) {
        List<List<Card>> result = new ArrayList<>();
        combine(arr, n, 0, new ArrayList<>(), result);
        return result;
    }

    private static void combine(List<Card> arr, int n, int start, List<Card> temp, List<List<Card>> result) {
        if (temp.size() == n) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < arr.size(); i++) {
            temp.add(arr.get(i));
            combine(arr, n, i + 1, temp, result);
            temp.remove(temp.size() - 1);
        }
    }
}
