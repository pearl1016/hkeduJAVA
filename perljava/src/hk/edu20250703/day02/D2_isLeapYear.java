package hk.edu20250703.day02;

import java.util.Scanner;

public class D2_isLeapYear {

	public static void main(String[] args) {
		
		
		// Q1. 윤년 : 1년은 356일 ---> 366일(윤년) 2월달의 마지막날이 28일이 아닌 29일 일 때
		//     윤년을 판단하는 조건을 확인 
		//      - 년도가 4의 배수이면서, 100으로 나누어 떨어지지 않는 수 = 윤년
		//      - 또는 400으로 나누어 떨어지는 수 
		//     2025년도가 윤년인지 아닌지 확인해서 출력해보기 : "2025년은 (윤년 or 평년)이다"
	

		/*
		  int year = 2025;
		  
		  if((year%4 == 0 && year%100 != 0) || year%400 == 0) { System.out.println(year
		  + "년은 윤년이다"); } else { System.out.println(year + "년은 평년이다"); }
		 */
		
		// Q2. 2000~2030 사이에 윤년을 모두 출력하세요
		//     반복문을 사용하면 쉽게 구할 수 있음
		
		/* 1)
		 * int year = 2025;
		 * 
		 * for (int i = 2000; i <= 2030; i++) { int year= i; if((year%4 == 0 &&
		 * year%100 != 0) || year%400 == 0) { System.out.println(year + "년은 윤년이다"); }
		 * }
		 */
		/*
		 * 2)
		 * int year = 2025;
		 * 
		 * for (int i = 2000; i <= 2030; i++) { int year= i; if(ifLeapyear)) { System.out.println(year + "년은 윤년이다"); }
		 * }
		 */
		
		
		
		//Scanner 클래스
		//콘솔에 입력된 값을 자바코드로 전달해서 사용할 수 있도록 지원
		//년도 범위를 직접 입력 받아서 윤년인 해를 출력
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		if((a%4 == 0 && a%100 != 0) || a%400 == 0) { 
			System.out.println(a + "년은 윤년이다"); } else { System.out.println(a + "년은 평년이다"); }
		
		
		
	}
	// Q3. 윤년을 판단하는 메서드: 반환타입은 true/false	
	public static boolean isLeapYear(int year) {
		boolean isS = false;
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			isS=true;
		}
		return isS;
	}
}
