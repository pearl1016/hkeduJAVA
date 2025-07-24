package hk.edu20250718.day12;

public class D1_NoteBook extends D1_Computer {

	
	@Override 
	public void display() {
		System.out.println("Notebook Display입니다.");
		
	
	}
	
	//typing 기능을 여기서 구현할 상황이 아니라서 추상메서드로 남겨둠..
	// --> 현재 클래스도 추상 클래스로 정의해야함
	@Override 
	public void typing() {
		System.out.println("DeskTop용 Typting입니다. ");
	
	}
	
}
