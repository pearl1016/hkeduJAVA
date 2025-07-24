package hk.edu20250708.day05;

public class D3_Constructor {

	
	//티비객체 
	private int size = 0;  //중요한 데이터 -> private으로 선언
	public String color = "검정색"; //색상
	
	//default생성자: 단독으로 사용한다면 생략이 가능 --> 오버로딩을 하면 생략 못함(중요)
	//생성자를 호출할때는 반드시 첫줄에 작성해야 함
	public D3_Constructor() {
		//super(); //부모생성자 호출 --> super(), this() 둘다 생성자를 호출하기 때문에 첫줄에 작성해야함
		this(60); //반복코드를 줄이기 위해 this()사용하기도 함
		this.size=60;
	}
	
	public D3_Constructor(int size) {
		super(); //super(), this() 같이 사용할 수가 없다.
		this.size = size;
	}
	

	public D3_Constructor(int size, String color) {
		this.size = size;
		this.color = color;
	}
	
	
	//메서드를통해 가져올수 있게 하는 것임. 바로는 X
	//값을 가져오는 메서드 getter
	public int getSize() {
		/*
		 * if(pw==100) { return size; } else { return 0; }
		 */
		return size;
	}
	//값을 저장하는 메서드 setter
	public void setSize(int size) {
		this.size = size;
	}


}
