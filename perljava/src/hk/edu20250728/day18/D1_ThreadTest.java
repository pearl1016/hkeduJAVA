package hk.edu20250728.day18;

public class D1_ThreadTest {
	
	public static void main(String[] args) {
		//"안","녕"을 번갈아 가며 출력하기
		for (int i = 0; i < 5; i++) {
			System.out.println("안");
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("녕");
		}
		
		
		
		
		System.out.println("===============");
		
		//작업 단위 하나
		Thread t1 = new Thread() {              //익명클래스 작성방식
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("안");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}          //지연시간
				}
			}
		};
		
		//작업 단위 둘
		Thread t2 = new Thread() {              //익명클래스 작성방식
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("녕");
				}
			}
		};
		
		//thread 의 run()을 실행시켜주는 메소드
		t1.start();
		t2.start();
		
		Thread t3 = new D1_ThreadTest().new ThreadObj();
		t3.start();
		
		
	}//main종료 괄호
	
	//내부클래스
	class ThreadObj extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println("ThreadTest:" + i);
			}
		}
	}
	

}
