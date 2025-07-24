package hk.edu20250718.day12;

public class D3_CalculatorChild extends D3_Calculator {

	@Override
	public int time(int num1, int num2) {
		return num1*num2;
	}
	
	@Override
	public int divide(int num1, int num2) {
	    if (num2 != 0) {
	        return num1 / num2;
	    } else {
	        return D3_ICalc.ERROR;
	    }

	}
	
	// 하위 클래스에서 새로 추가된 메서드
	public void showInfo() {
		
	}
	
}
