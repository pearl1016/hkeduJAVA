package hk.edu20250722.day14;

import java.util.Scanner;

public class D2_MagicFactory {

	//singleton pattern : 객체를 한번만 생성해서 사용
	private static D2_MagicFactory magicFactory; //멤버필드 생성
	private D2_MagicFactory() {}
	public static D2_MagicFactory getInstance() { //객체를 얻어올 수 있음
		if(magicFactory==null) {
			magicFactory = new D2_MagicFactory();
		}
		magicFactory = new D2_MagicFactory(); //객체 생성
		return magicFactory;  //static에서 this 빼기 -> 인스턴스 클래스를 의미하기 때문
		
		
	}
	
	//원하는 마방진 요청을 바다 해당 객체를 생성해서 반환해주는 기능
	public D2_IMagic factory() {
		D2_IMagic magic = null;
		
		System.out.println("원하는 마방진을 입력하세요.(숫자형식)");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num<3) {
			System.out.println("3이상 숫자를 입력해주세요.");
		} else if (num%2==1) {
			magic = new D2_OddMagicSquare(num);
		} else if (num%4==0) {
			magic = new D2_EvenMagicSquare(num);
		} else if (num%4==2) {
			magic = new D2_SixMagicSquare(num);
		}
		
		return magic;
	}
	
}
