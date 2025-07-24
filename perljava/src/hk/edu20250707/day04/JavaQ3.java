package hk.edu20250707.day04;
// LCM(a, b) = (a × b) / GCD(a, b)
public class JavaQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = answer(2,4);
		System.out.println("최소공배수는: " + result); 
				
	}
	public static int answer(int a, int b) {
		System.out.println("최소공배수 구하기");
		
		int originalA = a;
		int origanalB = b;
		
		
		while(a!=b){
			if(a>b) {
				a = a - b;
			}
			else {
				b = b - a ;
			}
		
		}
		int GCD = a; //또는 b
	
		int LCM = (originalA*origanalB)/GCD;
		return LCM;
	}

}
