package hk.edu20250716.day10;

public class D1_Parent {
	
	public int a;
	
	public D1_Parent() {
		System.out.println("부모생성자(default)");
	}
	
	public D1_Parent(int a) {
		System.out.println("부모생성자(오버로딩)");
	}

	//final 메서드 오버라이딩 금지
	//메서드
	public void parentMethod() {
		System.out.println("부모의 메서드: "+getClass());
	}
}
