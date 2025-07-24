package hk.edu20250704.day03;

import java.util.Scanner;

public class page140_Q17 {

	public static void main(String[] args) {
		// [교재문제] 140P 7번 문제풀기
		
		boolean run = true;
	
		
		Scanner sc = new Scanner(System.in);
		int money = 0;
		
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택>  ");
			
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1:
				System.out.print("예금액> ");
				money += Integer.parseInt(sc.nextLine());
				break;
			
			case 2:
				System.out.print("출금액> ");
				money -= Integer.parseInt(sc.nextLine());
				break;
				
			case 3:
				System.out.print("잔고> ");
				System.out.printf("%d\n", money); 
				break;
			
			case 4: 
				System.out.println("프로그램 종료\n");
				run = false;
				break;
				
			} 
			
		}
		sc.close();
		
		
		
		
		// [교재문제] 140P 7번 문제풀기 (강사님 버전)
	
		Scanner scan = new Scanner(System.in);
		int balance = 10000;
		
		while(true) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.println("선택＞");
			
			int input=Integer.parseInt(scan.nextLine());
			
			if(input==1) { //예금
				System.out.print("예금액");
				int a = Integer.parseInt(scan.nextLine());
				balance +=a;
				System.out.println("입금완료했습니다");
			} else if(input==2) {
				System.out.print("출금액");
				int a = Integer.parseInt(scan.nextLine());
				if(balance>a) {
				balance -=a;
				} else {
					System.out.println("잔액이 부족합니다.");
					continue;
				}
				System.out.println("출금완료했습니다");
			} else if(input==3)  {
				System.out.print("잔고조회"); //조회
				System.out.printf("%d",balance);
			} else if(input==4)  {
				System.out.println("종료합니다");
				break;
			}
		}
		
	}

}
