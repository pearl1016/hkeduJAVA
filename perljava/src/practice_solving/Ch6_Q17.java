// 16번 문제에서는 Printer 객체를 생성하고 println() 메소드를 호출했습니다.
// 이번에는 Printer 객체를 생성하지않고도 다음과 같이 호출할 수 있도록 Printer 클래스를 수정해보세요.

package practice_solving;

public class Ch6_Q17 {
	
	public static class Printer { 
		
		//객체 생성 없이 호출하려면, println() 메소드를 static 메소드로 선언해야 함
		public static void println(int value) {
			System.out.println(value);
		}
		
		public static void println(boolean value) {
			System.out.println(value);
		}
		
		public static void println(double value) {
			System.out.println(value);
		}
		
		public static void println(String value) {
			System.out.println(value);
		}
	 }

    public static void main(String[] args) {
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");
    }


	
	//static을 붙이면 객체를 생성하지않고도 클래스 이름으로 바로 메소드 호추링 가능합니다. 
	
}
