package java2503.basic;

public class Variable2 {

	// static member variable
	// 클래스의 객체들이 값을 공유하는 변수
	static int si = 1; 
	
	// non-static member variable
	// 클래스의 객체들이 값을 각각 갖는 변수
	int nsi = 2;
	
	public static void main(String[] args) {
		
		// locl varible
		// main메소드의 지역변수
		// main메소드가 호출되면 메모리에 생성되었다가
		// main메소드가 종료되면 메모리에서 사라지는 변수
		int li = 3;
		
	} // main 

} // class
