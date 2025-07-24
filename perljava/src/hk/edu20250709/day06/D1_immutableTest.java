package hk.edu20250709.day06;

public class D1_immutableTest {

	public static void main(String[] args) {
		
		int a = 5;
		change01(a); //int a = 5 --> 메서드 파라미터 int = a=a
		System.out.println("원본 a변수의 값:"+a); //원본이 변경되지 않음
		
		D1_immutableTest imTest = new D1_immutableTest();
		change02(imTest);
		System.out.println("원본 imTest의 값:"+imTest.bb); 
		
		//D1_immutableTest imTest2 = imTest; //참조타입은 주소를 전달한다
		}

	public int bb=5;
	
	public static void change01(int a) {
		a=10; //파라미터로 전달받은 값을 10으로 변경한다.
	}
	
	public static void change02(D1_immutableTest imTest) {
		imTest.bb=10; //객체명.메서드 -> 객체명에는 주소가 저장되어 있음
	}
}
