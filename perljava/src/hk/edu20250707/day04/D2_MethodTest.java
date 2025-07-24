package hk.edu20250707.day04;

public class D2_MethodTest {
	
	//main메서드는 코드를 간결하게 작성하는 것
	//구현된 메서드를 실행시켜주는 메서드
		
	public static void main(String[] args) {
		D2_MethodTest.test01(); //호출 : 메서드명만 호출하면 됨, 클래스 내부에 있기 때문

	}
	
	//메서드 유형
	//1. static과 non-static 유형
	//   공통기능을 구현할 때 
	public static void test01() { //객체마다 따로 존재하지 않고, 하나의 변수만 존재
		System.out.println("static의 메서드");
		// test02(); //staic에서 non-static 사용 못함
		D2_MethodTest mt = new D2_MethodTest();//참조타입은 그 객체의 주소값을 저장함
			mt.test02(); //객체생성하면 사용할 수 있음
		
	}
	public void test02() {
		System.out.println("non-static 메서드"); //어디에서나 접근 가능?
	}
	
	//2. 반환 타입O / 반환 타입X
	public int test03() {
		int i = 0;
		//주요 코드 작성
		return i; //반환 타입을 선언했다면 반드시 return을 정의해야함.
		
	}
	
	public void test04() { //반환타입 안하기로 함
		//return 9; 반환하면 안됨
	}
	
	//3. 파라미터O / 파라미터X : 외부로부터 값을 전달받으려고 
	public static int test05(int a, int b) {
		int result = 0;
		if(a>b) {
			result = a;
		}
		return result;
	}

}
