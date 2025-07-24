package hk.edu20250704.day03;

public class D1_ControlFlow {

	public static void main(String[] args) {
		
		
		// 1. if문
		// 유형 : 약 3가지 정도...
		// 1)if(조건){실행코드}
		// 2)if(조건){실행코드}else{실행코드}
		// 3)if(조건){실행코드}else if(조건){실행코드}else if(조건){실행코드}....
		// 4)중첩if문
		
		
		int num1 = 10;
		int num2 = 5;		
		
		// if문을 독립적으로 사용했을 경우 : if문끼리는 영향이 없다.
		if(num1>num2) {
			
			System.out.println("실행결과: "+num1+">"+num2);
		}
		
		if(num1<num2) {
			System.out.println("실행결과: "+num1+"<"+num2);
		}
		
		// 조건이 true나 false결과에 따라 반드시 하나만 실행됨
		if(num1<num2) {
			System.out.println("실행결과: "+num1+">"+num2);
		} else {
			System.out.println("실행결과: "+num1+"<"+num2);
		}
		
		
		// 2. switch case문 : 대상값이 정수형, String 타입
		// 주의사항 : 실행코드 다음에 break를 작성하지 않으면 해당 case이후에 case문들이 모두 실행 및 출력된다.
		int num = 5;
		switch (num) {
		case 1: System.out.println("1입니다");break;  
		case 5: System.out.println("5입니다");break;
		case 10: System.out.println("10입니다");break; //break값이 있어야지 빠져나가게된다. 
		default:
			System.out.println("일치하는 값이 없습니다");break;
		}
		
		
		
		// 3. for문 : 기본형식(index기반의 실행), 향상된 for문(기본형식의 for문보다 간결함)
		// 1. 초기값 선언 2. 조건확인 3. 코드실행 4. 스텝증가 --> 반복
		for(int i = 0; i <10; i++) {
			//실행코드
			if(i==5) {
				break;
				//continue;
			}
			System.out.println(i);
		}
		
		
		
		// 4. for-each 문 : 향상된 for문
		int[] i = {1,2,3,4,5,6};
		for (int val : i) { 
			System.out.println(val);
		}
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		
		
		// 5. while문
		int w=0;
		while(true) {
			System.out.println("while문 실행");
			if(w>5) {
				break;
			}
			w++;
		}
		
		
		// 6. do~while문 : 최초 한번은 코드를 실행해야한다면 ...
		do {
			System.out.println("조건에 해당되지 않아도 한번은 실행해요");
		} while (10<5);  //조건식이 false이면 do-while문 종료
		
	}

}
