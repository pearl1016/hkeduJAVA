package hk.edu20250728.day18;

public class D2_ThreadInheritance extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("나는 Thread를 상속받은 스레드야");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}