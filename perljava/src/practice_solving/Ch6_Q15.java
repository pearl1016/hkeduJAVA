package practice_solving;

public class Ch6_Q15 {


	//Login()메소드 정의 : id가 "hong", password가 "12345" 일 경우 true 반환
	public boolean login(String id, String password) {
		if("hong".equals(id)&&"12345".equals(password)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
	
	
}
