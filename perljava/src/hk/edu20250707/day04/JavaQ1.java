package hk.edu20250707.day04;

//약수 구하기
public class JavaQ1 {
	public static void main(String[] args) {
	
		for (int i = 1; i <= 12; i++) {
			if (12%i==0) {
				System.out.println(i + "는 12의 약수입니다.");
			}
		}
		
		
	}
	public static int num(int a) {
		if(12%a==0) {
			return a;
		}
		return 0;
	}

}
