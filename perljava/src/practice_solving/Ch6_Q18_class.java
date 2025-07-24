package practice_solving;

public class Ch6_Q18_class {

	
	// 1. 유일한 객체 생성
    private static Ch6_Q18_class instance = new Ch6_Q18_class();

    // 2. 외부에서 생성 못 하게 private 생성자
    private Ch6_Q18_class() {  //생성자 선언할때는 괄호 필수
    }

    // 3. 유일한 인스턴스를 제공하는 메소드
    public static Ch6_Q18_class getInstance() {
        return instance;
        
    }
}
