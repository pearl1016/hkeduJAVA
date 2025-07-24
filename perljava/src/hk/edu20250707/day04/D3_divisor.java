package hk.edu20250707.day04;

public class D3_divisor {

    public static void main(String[] args) {
        // 1. 정적(static) 메서드 호출 (객체 없이 사용 가능)
        divisor(30); // 30의 모든 약수 출력

        // 2. 객체 생성 후 인스턴스 메서드 호출
        D3_divisor divisor = new D3_divisor();
        divisor.divisor(12);                 // 12의 약수 출력
        divisor.greateDivisor(10, 20);       // 10과 20의 최대공약수 출력
        divisor.lowestMultiple(2, 4);        // 2와 4의 최소공배수 출력
        divisor.amicable(1, 4000);           // 1~3999 사이의 친화수 출력
        divisor.perfectNumber(1, 1000);      // 1~1000 사이의 완전수 출력
    }

    // ▶ 정적(static) 메서드: 모든 약수 구하기
    public static void divisor(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // 마지막 약수는 콤마 없이 출력
                System.out.print((i == number) ? i : i + ",");
            }
        }
        System.out.println(); // 줄바꿈
    }

    // ▶ 생성자(Constructor): 특별한 작업은 없음 (생략 가능)
    public D3_divisor() {}

    // ▶ 두 수의 최대공약수(GCD) 구하기 - 뺄셈 방식
    public int greateDivisor(int a, int b) {
        int tempA = a;  // 원래 값을 저장
        int tempB = b;

        while (true) {
            if (a > b) {
                a = a - b;
            } else if (b > a) {
                b = b - a;
            } else {
                break; // a == b → 최대공약수 찾음
            }
        }

        System.out.printf("%d 와 %d의 최대공약수는 %d이다.\n", tempA, tempB, a);
        return a; // 결과 반환
    }

    // ▶ 두 수의 최소공배수(LCM) 구하기
    public void lowestMultiple(int a, int b) {
        // 최소공배수 = (a * b) / 최대공약수
        int number = greateDivisor(a, b);
        int result = a * b / number;

        System.out.printf("%d와 %d의 최소공배수는 %d이다.\n", a, b, result);
    }

    // ▶ 한 수의 '진약수의 합' 구하기
    // 진약수: 자기 자신을 제외한 약수
    public int sumDivisor(int a) {
        int sum = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    // ▶ 주어진 범위에서 친화수 찾기
    // 친화수: A ≠ B 이고, A의 진약수 합 = B, B의 진약수 합 = A
    public void amicable(int s, int e) {
        for (int i = s; i < e; i++) {
            int partner = sumDivisor(i); // i의 진약수 합

            // i != partner: 같은 수 아님 확인
            // i == sumDivisor(partner): 역으로도 성립
            if (i != partner && i == sumDivisor(partner)) {
                System.out.printf("%d와 %d는 친화수 관계입니다.\n", i, partner);
            }
        }
    }

    // ▶ 완전수 찾기
    // 완전수: 진약수의 합 == 자기 자신 (예: 6, 28, 496)
    public void perfectNumber(int s, int e) {
        for (int i = s; i <= e; i++) {
            if (i == sumDivisor(i)) {
                System.out.printf("완전수: %d\n", i);
            }
        }
    }
}
