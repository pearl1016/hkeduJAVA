package hk.edu20250709.day06;

public class D4_CalculatorC {
	
	public int num1;
	public int num2;
	private int result;
	
	public D4_CalculatorC() {
		this(10,5);
	}

	public D4_CalculatorC(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void a() {
		this.result = this.num1 * this.num2;
	}

	public int getResult() {
		return result;
	}
	

}
