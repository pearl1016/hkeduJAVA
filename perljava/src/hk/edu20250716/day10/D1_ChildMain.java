package hk.edu20250716.day10;
//실행시킬 용도
public class D1_ChildMain {

	public static void main(String[] args) {
		
		D1_Child child = new D1_Child(); // 자식의 타입으로 자식 생성(객체 생성)
		int a = child.a; //부모의 멤버 필드 a
		child.childMethod(); //자식 메서드 사용 가능
		child.parentMethod(); //부모 메서드도 사용 가능
		
		
		D1_Parent parent = new D1_Child(); //상속관계라 가능함
//	    D1_Parent pp = new D2_Lotto(): // 클래스간 아무런 관계가 없어서 X
		
		int aa = parent.a;
		parent.parentMethod(); //부모의 메서드를 호출하면 자식이 호출됨
//		parent.childMethod();  //자식은 안됨. 설계도에 공개된 메서드만 사용가능

		
		//test(new D1_Child())  parentM(){'A'출력}
		//test(new D1_Child2())  parentM(){'B'출력}
		test(new D1_Child());
		
		System.out.println(child.toString());
	}//Main메서드
	
	
	
	//자바의 다형성
	public static void test(D1_Parent obj) {
		obj.parentMethod();  //obj에 어떤 자식 객체를 받느냐에 따라 ParentM()가 다르게 실행된다(다양한 형태로)
		//자식 객체에 정의된 childMethod()를 사용하려면 형변환해야한다. 
		if(obj instanceof D1_Child) {
			D1_Child ch = (D1_Child)obj;   //자식타입으로 형변환해야 자식 메서드 사용가능
			ch.childMethod();              //이게 자식 메서드, 설계도에 공개된 메서드만 사용가능
		}
	}
	


}
