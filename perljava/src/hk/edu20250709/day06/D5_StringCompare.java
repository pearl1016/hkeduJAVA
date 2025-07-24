package hk.edu20250709.day06;

public class D5_StringCompare {

	public static void main(String[] args) {
		

		// 리터럴과 리터럴 비교
		String s1 = "Java";
		String s2 = "Java";
		
		System.out.println(s1==s2); //주소로 비교                  true출력
		System.out.println(s1.equals(s2)); //hashcode로 비교      true출력
		
		// 객체와 객체 비교
		String obj1 = new String("java");
		String obj2 = new String("java");
		System.out.println(obj1==obj2); //주소로 비교                false출력
		System.out.println(obj1.equals(obj2)); //hashcode로 비교    true출력
		
		
		// 객체와 리터럴
		String s3 = "java";
		String obj3 = new String("java");
		System.out.println(s3==obj3); //주소로 비교                false출력
		System.out.println(s3.equals(obj3)); //hashcode로 비교    true출력
		
		
		//String 특징 : immutable한 성격 --> 값이 변경되지 않는 성질
		String s = "java";
		String ss = s; //복사본
		       ss = "자바"; //받은 쪽에서 값을 변경하면? 
		System.out.println(s);                                   //java라고 출력
		
		s.replace("j", "o");   //원본이 바뀌지 않는다.
		s = s.replace("j", "o");     //대입을 다시 해줘야함. 
 		System.out.println(s);                                   //oava라고 출력
		    		   
	}

}
