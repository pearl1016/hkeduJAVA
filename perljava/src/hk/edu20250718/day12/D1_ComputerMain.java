package hk.edu20250718.day12;

public class D1_ComputerMain {

	public static void main(String[] args) {
		
		D1_Computer deskTop = new D1_DeskTop();
		deskTop.turnOn();
		deskTop.display();
		deskTop.typing();
		deskTop.turnOff();
		
//		D1_Computer noteBook = new D1_NoteBook(); 
		D1_Computer myNoteBook = new D1_MyNoteBook();
		myNoteBook.turnOn();
		myNoteBook.turnOff();
		myNoteBook.display();
		myNoteBook.typing();
		
	}

}
