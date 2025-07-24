package hk.edu20250707.day04;

//최대공약수 구하기
public class JavaQ2 {

	public static void main(String[] args) {
		int result = answer(10, 20); 
		System.out.println("최대공약수는: " + result); 

	}
	
	
	public static int answer(int a, int b) {
		System.out.println("최대공약수 구하기");
		while(a!=b){
			if(a>b) {
				a = a - b;
			}
			else {
				b = b -a ;
			}
		
		}
		return a;
	}

}
