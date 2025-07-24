package hk.edu20250703.day02;

public class D1_VariableTest {
	public static void main(String[] args) {
		
		// 기본타입의 특징
		// 1. 정수타입
		//    기본형은 int
		
		byte b = 1; //-128~127 숫자를 표현
//			 b = 128; //128은 표현범위를 벗어남
		short sh = 128;  //short는 2byte의 크기이다. 
		int i = 500000000; //int 4byte의 크기
		long l = 5000000000L; //리터럴값에다가 L을 붙여주면 long타입으로 정의됨. 
		
		// 2. 실수타입
		//    기본형은 double 
		double d = 15.8;
//		float f1 = 10.2;
		float f = (float)10.2;
		float ff = 10.2f;
//		float fff1 = d+f;
		float fff=(float)(d+f);   //double+float -> double+double
		
		// 3. 다른 타입끼리 연산
//		int ii1 = i+d; 
		int ii = (int)(i+d); //double+double ---> int 형변환
		double dd=i+d; //5000000000.222
		int iii = (int)dd; // 소수점이 없어지고 5000000000로 됨. 실수 --> 정수로 변환
		
		// 4. 정수끼리 연산
		byte b1 = 10;
		byte b2 = 20;
//		byte b3 = int(b1+b2); //연산결과는 int형이기 때문에 형변환을 해야한다. 
		
	}

}
