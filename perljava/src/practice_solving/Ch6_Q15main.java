package practice_solving;

public class Ch6_Q15main {
	
	public static void main(String[] args) {
		Ch6_Q15 q15 = new Ch6_Q15();
		
		//로그인 시도
		boolean result = q15.login("hong", "12345");
		if (result) {
			System.out.println("로그인성공");
			q15.logout("hong");
		
		} else {
			System.out.println("로그인실패");
		}
	}

}
