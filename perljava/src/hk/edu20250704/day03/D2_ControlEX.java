package hk.edu20250704.day03;

import java.util.Random;

public class D2_ControlEX {

	public static void main(String[] args) {
		
		//구구단 출력하기
		//Q1. 2단을 출력하는 코드 만들기
		System.out.println("연습하기");
		for(int i=0; i<10; i++) {
			System.out.println("2X"+i+"="+ (2*i));
			
		}
		
		//Q2. 2~9단 출력하기
		for(int i= 2; i<10; i++) {
			System.out.println("----------------");
			System.out.println(i+"단");
			for (int j= 1; j<10; j++) {
				System.out.printf("%dX%d=%d\n",i,j,i*j);
			}
			
		}
		
		
		
		//Q3. 2~9단까지 출력할 떄.. 짝수단만 출력해보기
		System.out.println("\n짝수단만 출력하기");
		for(int i= 2; i<10; i++) {
			if (i%2==0) {
				System.out.println("#"+i+"단");
				for (int j= 1; j<10; j++) {
					System.out.printf("%dX%d=%d\n",i,j,i*j);
				}
			}
		}
		System.out.println("--------------------------");
		
		//Q4. 2~9단까지 출력할 떄.. 홀수단만 출력해보기
		System.out.println("홀수단만 출력하기");
		for(int i= 2; i<10; i++) {
			if (i%2!=0) {
				System.out.println("\n#"+i+"단");
				for (int j= 1; j<10; j++) {
					System.out.printf("%dX%d=%d\n",i,j,i*j);
				}
			}
		}
		System.out.println("--------------------------");
		
		//Q5. 1~100의 수의 합을 출력하자
		int sum = 0; 
		
		for(int i=1;i<=100;i++) {
			sum = sum+i;  //sum+=i
		}
		System.out.printf("1~100의 수의 합은 : %d\n",sum);
		
		
		//Q6.1~100까지의 수 중에 4의 배수의 총합을 출력하기
		int sum2 =0;
		
		System.out.println("--------------------------");
		for(int i=1;i<=100;i++) {
			if(i%4==0) {
			sum2 = sum2+i; //sum+=i
			}
		}
		System.out.printf("1~100에서 4의 배수 총합은 : %d\n",sum2);
		
		
		//Q7. 주사위 두개의 합이 5이면 실행을 멈추고,
		//    5가 아니면 계속 실행되게 코드를 작성하자
		//    -->Math객체를 활용, 어떤 메더를 사용해야할지? Ramdom객체 활용
		System.out.println("--------------------------");
		

		int sum3 = 0; 
		while(true) {
		    int num1 = (int)(Math.random() * 6) + 1;
		    int num2 = (int)(Math.random() * 6) + 1;
		    System.out.println("주사위(" + num1 + ", " + num2 + ")");
		    sum3 = num1 + num2;
		    if (sum3 == 5) {
		    	System.out.println("주사위(" + num1 + ", " + num2 + ") 합은 "+sum3);
		        break;
		    }
		}
		
		
		//강사님 풀이. Math객체에 random()메서드를 사용
		//random()에서 생성되는 숫자 --> 0~1사이
		System.out.println(Math.random()); //소수 랜덤숫자 출력
		int number = (int)(Math.random()*6)+1; //1~6까지의 랜덤숫자반환 
		System.out.println(number);
		
		//위코드 와 밑 코드의 차이에 대해 알아보자(Random)
		//Random random = new Random();
		//System.out.println(random.nextInt(6)+1);
		
		
		while(true) {
			int num3 = (int)(Math.random()*6)+1; //1번주사위
			int num4 = (int)(Math.random()*6)+1; //2번주사위
			System.out.printf("(%d,dd)\n", num3, num4);
			if (num3+num4==5) {
				System.out.println("합이 5가 되어서 종료");
				break;
			}
		}
		
	
		
	
	}
}
