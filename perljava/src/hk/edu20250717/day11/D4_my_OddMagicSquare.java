package hk.edu20250717.day11;

public class D4_my_OddMagicSquare {
	
	private int[][] magic = new int[4][4];

    // 마방진 생성 메서드
    public void make() {
        int n = 4;
        int num = 1;

        // 1부터 16까지 차례로 채우기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                magic[i][j] = num++;
            }
        }

        // 대각선 위치에 대해 보완쌍 값으로 변경
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    magic[i][j] = 17 - magic[i][j];
                }
            }
        }
    }

    // 왼쪽 대각선 합
    public int sumDia() {
        int sum = 0;
        for (int i = 0; i < magic.length; i++) {
            sum += magic[i][i];
        }
        return sum;
    }

    // 오른쪽 대각선 합
    public int sumReverseDia() {
        int sum = 0;
        int n = magic.length;
        for (int i = 0; i < n; i++) {
            sum += magic[i][n - 1 - i];
        }
        return sum;
    }

    // 특정 행 합
    public int sumRow(int row) {
        int sum = 0;
        for (int j = 0; j < magic.length; j++) {
            sum += magic[row][j];
        }
        return sum;
    }

    // 특정 열 합
    public int sumCol(int col) {
        int sum = 0;
        for (int i = 0; i < magic.length; i++) {
            sum += magic[i][col];
        }
        return sum;
    }

    // 마방진 검증 메서드 (모든 행, 열, 대각선 합이 같은지)
    public boolean isMagicSquare() {
        int n = magic.length;
        int expectedSum = sumRow(0);  // 첫 행 합을 기준으로

        // 모든 행 합 확인
        for (int i = 1; i < n; i++) {
            if (sumRow(i) != expectedSum) return false;
        }

        // 모든 열 합 확인
        for (int j = 0; j < n; j++) {
            if (sumCol(j) != expectedSum) return false;
        }

        // 대각선 합 확인
        if (sumDia() != expectedSum) return false;
        if (sumReverseDia() != expectedSum) return false;

        return true;
    }

    // 마방진 출력 메서드 + 대각선 합, 마방진 검증 결과 출력
    public void printMagic() {
        for (int i = 0; i < magic.length; i++) {
            for (int j = 0; j < magic.length; j++) {
                System.out.printf("%4d", magic[i][j]);
            }
            System.out.printf(" | 합: %d", sumRow(i));  // 각 행 합 출력
            System.out.println();
        }
        System.out.println();

        // 열 합 출력
        for (int j = 0; j < magic.length; j++) {
            System.out.printf("%4d", sumCol(j));
        }
        System.out.println();

        // 대각선 합 출력
        System.out.println("대각선 합: " + sumDia() + ", " + sumReverseDia());

        // 마방진 여부 출력
        System.out.println("마방진 확인: " + isMagicSquare());
    }
}
