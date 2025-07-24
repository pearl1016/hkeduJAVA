package hk.edu20250714.day08;

// Cloneable 인터페이스
// --> 아무런 기능명세가 되어있지 않은 인터페이스이다.
// --> 표식 인터페이스로써 기능은없고, 그런 이런저런걸 할 수 있다는 표시

public class Person implements Cloneable {
	
	public String name;
	
	//Person person = new Person(); // 생성 못함 
	public Person() {
		
	}
	
	
	public Person(String name) {
		this.name=name;
	}

	//Clone()는 Object에 구현되어 있는 메서드
	//Override란 부모의 메서드를 자식이 재정의 하는 것
	@Override
	public Person clone() {
		
		//object객체가 하나 복제되면서 person응로 형변환하면 새로운 객체로 복제됨
		//return (Person)clone() { //person으로 형변환 > person이라는 객체 생성
			try {
				return (Person)super.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		
		}
}
	

