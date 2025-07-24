package hk.edu20250710.day07;

import java.util.Scanner;
import java.util.regex.Pattern;


public class D2_CalculatorMain {

	public static void main(String[] args) {

		
//		Calculator 객체생성
		D2_Calculator cal = new D2_Calculator();
		
		
//		Scanner 객체생성
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("계산 값을 입력하세요(+,-,*,/ 연산만 가능)입력은 ex.\"5+10\"");
			String s= sc.next(); //예: "5+10"입력값 받는 코드 작성
			
			
			//입력받은 값 s의 패턴: "숫자[+-/*]숫자" 확인 ---> 정규화표현식
			if(Pattern.matches("^[0-9]+[\\+\\-\\*/][0-9]+$", s)) {
				cal.calcu(s);
			
			} else {
				//"9"를 입력하면 "계산 프로그램을 종료해요~~" 출력하고 끝내기 코드 작성
				if(s.equals("9")) {
					System.out.println("종료");
					break;
				} else {
					System.out.println("형식 잘못, 다시 입력");
				}
			}
		}
	}
}






