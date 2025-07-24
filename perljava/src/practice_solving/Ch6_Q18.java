// 18. 다음 예제 코드가 실행되면 “같은 ShopService 객체입니다.”라는 메시지가 출력되도록, 
//싱글톤 패턴을 사용해서 ShopService 클래스를 작성해보세요.


package practice_solving;

//싱글톤(Singleton) 패턴을 적용해서 같은 객체가 두 번 생성되지 않도록 만드는 연습 문제
//싱글톤이란, 객체를 단 1개만 생성해서 공유하는 방식이다. getInstance()로만 접근
public class Ch6_Q18 {

    
    public class ShopServiceExample {
        public static void main(String[] args) {
        	Ch6_Q18_class obj1 = Ch6_Q18_class.getInstance();
        	Ch6_Q18_class obj2 = Ch6_Q18_class.getInstance();

            if (obj1 == obj2) {
                System.out.println("같은 ShopService 객체입니다.");
            } else {
                System.out.println("다른 ShopService 객체입니다.");
            }
        }
    }

	
}
