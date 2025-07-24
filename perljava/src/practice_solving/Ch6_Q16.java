// 16. println() 메소드는 매개값을 콘솔에 출력합니다. 
//println() 메소드의 매개값으로는 int, boolean, double, String 타입 값을 줄 수 있습니다.
//다음 조건과 예제 코드를 보고 Printer 클래스에서 println() 메소드를 오버로딩하여 선언해보세요.

package practice_solving;

public class Ch6_Q16 {

	public static class Printer { //클래스는 괄호()를 붙이면안됨. Printer()라하니까 오류났었음 !!
		
		public void println(int value) {
			System.out.println(value);
		}
		
		public void println(boolean value) {
			System.out.println(value);
		}
		
		public void println(double value) {
			System.out.println(value);
		}
		
		public void println(String value) {
			System.out.println(value);
		}
	 }

    // main 메소드 포함 클래스
    public static void main(String[] args) { //내부클래스로 계속 사용할 것 -> static 붙이기
        Printer printer = new Printer();

        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }
}
