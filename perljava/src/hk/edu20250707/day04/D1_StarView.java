package hk.edu20250707.day04;

public class D1_StarView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.-----------------------");
		
		/*
		★
		★★
		★★★
		★★★★
		★★★★★
		n0+n*d = 1+i (i는 n을 의미함)
		*/
		
		for(int i=0;i<5;i++) {
		  for(int j=0; j<i+1; j++) {
		     System.out.print("★");
		  }
		  System.out.println();
		}
		
		System.out.println();
		System.out.println("2.-----------------------");
		System.out.println();
		
		/*
		☆☆☆☆★  공백을 출력한 다음 별을 출력
		☆☆☆★★  공백: 4 3 2 1 0 으로 줄어들고 있음
		☆☆★★★     a0+i*d -> 4+i*-1= 4-i
		☆★★★★  별: 1 2 3 4 5 로 늘어나고 있음
		★★★★★     i +1
		*/
		for(int i=0; i<5; i++) { 
			//공백 출력
			for (int j = 0; j <4-i; j++) {
				System.out.print("☆");
				
			}
			for (int j = 0; j < i+1; j++) { 
				System.out.print("★");
			}
			System.out.println(); //줄바꿈만 실행
			
		}
		System.out.println();
		System.out.println("3.-----------------------");
		System.out.println();
		
		/* Q1. 정삼각형 만들기
		☆☆☆☆★☆☆☆☆  공백: 8 6 4 2 0 으로 줄어들고 있음
		☆☆☆★★★☆☆☆
		☆☆★★★★★☆☆  별: 1 3 5 7 9 로 늘어나고 있음
		☆★★★★★★★☆
		★★★★★★★★★
		*/
		
		for(int i=0; i<5; i++) { 
			// 좌측 공백(☆)
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("☆");
            }
            // 별(★)
            for (int j = 0; j < 2 * i + 1; j++) { //홀수로 증가하고 있기 때문
                System.out.print("★");
            }
            // 우측 공백(☆)
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("☆");
            }
            System.out.println(); //줄바꿈만 실행
		}
		System.out.println();
		System.out.println("4. -----------------------");
		System.out.println();
		
		
		
		/* Q2. 삼각형 만들기
		★★★★★
		★★★★
		★★★
		★★
		★
		*/
		for(int i=0;i<5;i++) {
			  for(int j=0; j<5-i; j++) {
			     System.out.print("★");
			  }
			  
			  System.out.println();
			}
		System.out.println();
		System.out.println("5. -----------------------");
		System.out.println();
		
		/* Q3. 마름모 만들기
		☆☆☆☆★☆☆☆☆  
		☆☆☆★★★☆☆☆
		☆☆★★★★★☆☆ 
		☆★★★★★★★☆
		★★★★★★★★★
		☆★★★★★★★☆
		☆☆★★★★★☆☆
		☆☆☆★★★☆☆☆
		☆☆☆☆★☆☆☆☆ 
		*/
		for(int i=0; i<5; i++) { 
			// 좌측 공백(☆)
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("☆");
            }
            // 별(★)
            for (int j = 0; j < 2 * i + 1; j++) { //홀수로 증가하고 있기 때문
                System.out.print("★");
            }
            // 우측 공백(☆)
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("☆");
            } 
            System.out.println();
		
		}
		for(int i=0; i<5; i++) { 
			// 좌측 공백(☆)
            for (int j = 0; j < i; j++) {
                System.out.print("☆");
            }
            // 별(★)
            for (int j = 0; j <5-i; j++) { //홀수로 감소하고 있기 때문
                System.out.print("★");
            }
         // 별(★)
            for (int j = 0; j <4-i; j++) { //홀수로 감소하고 있기 때문
                System.out.print("★");
            }
            // 우측 공백(☆)
            for (int j = 0; j < i; j++) {
                System.out.print("☆");
            }
            System.out.println(); //줄바꿈만 실행
		}
		
		System.out.println("      -----강사님풀이-------"); //줄바꿈만 실행
		for(int i=0; i<5; i++) { 
			// 좌측 공백(☆)
            for (int j = 0; j < 4-i; j++) {
                System.out.print("☆");
            }
            // 별(★)
            for (int j = 0; j < 1+i*2; j++) { //홀수로 증가하고 있기 때문
                System.out.print("★");
            }
            System.out.println(); //줄바꿈만 실행
            
		}
		for(int i=0; i<4; i++) { 
			// 좌측 공백(☆)
            for (int j = 0; j < i+1; j++) {
                System.out.print("☆");
            }
            // 별(★)
            for (int j = 0; j < 7-i*2; j++) { //홀수로 증가하고 있기 때문
                System.out.print("★");
            }
            System.out.println(); //줄바꿈만 실행
            
		}
		
		
		
		
		System.out.println();
		System.out.println("6. -----------------------");
		System.out.println();

		/* Q4. 역삼각형 만들기
		★★★★★★★★★  // 9 7 5 3 1 -> 2Xi-1
		☆★★★★★★★☆
		☆☆★★★★★☆☆
		☆☆☆★★★☆☆☆
		☆☆☆☆★☆☆☆☆ 
		*/
		
		for(int i=0; i<5; i++) { 
			// 좌측 공백(☆)
            for (int j = 0; j < i; j++) {
                System.out.print("☆");
            }
            // 별(★)
            for (int j = 0; j < 5-i; j++) { //홀수로 감소하고 있기 때문
                System.out.print("★");
            }
         // 별(★)
            for (int j = 0; j < 4-i; j++) { //홀수로 감소하고 있기 때문
                System.out.print("★");
            }
            // 우측 공백(☆)
            for (int j = 0; j < i; j++) {
                System.out.print("☆");
            }
            System.out.println(); //줄바꿈만 실행
		}
		/* 강사님 풀이
		 * for (int i = 0; i < 5; i++) { for (int j = 0; j < i; j++) {
		 * System.out.print("☆"); } for (int j = 0; j < 9-i*2; j++) {
		 * System.out.print("★"); } System.out.println(); }
		 */
		System.out.println();
		System.out.println("7.-----------------------");
		System.out.println();
		
		
		/* Q5. 삼각형 만들기
		★★★★★
		☆★★★★
		☆☆★★★
		☆☆☆★★
		☆☆☆☆★
		*/
		for(int i = 0; i < 5; i++) { 
			//공백 출력
			for (int j = 0; j < i; j++) {
				System.out.print("☆");
				
			}
			for (int j = 0; j < 5-i; j++) { 
				System.out.print("★");
			}
			System.out.println(); //줄바꿈만 실행
			
			
		}
		
		//절대값 활용해서 마름모 구현
		System.out.println(); //줄바꿈만 실행
		System.out.println("8.=====================");
		int num = 9; // 홀수값만 가능함.
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < Math.abs(num/2-i); j++) { //가운데 줄 기준으로 좌우 대칭 공백 만들기
				System.out.print("☆"); //공백 수 (Math.abs(4 - i))
			}
			for (int j = 0; j < num-Math.abs(num-1-i*2); j++) { //가운데에서 늘어나고 다시 줄어드는 별 개수
				System.out.print("★");
			}
			System.out.println();

		}
		
		
		
	} //main 종료
}