package java2503.basic;

public class MethodOverflow {

	public static void main(String[] args) {
		// stackOverfiowError 발생
		a();
	}
	
	static void a() {
		System.err.println("a메소드 호출됨");
		b();
	}
	
	static void b() {
		System.out.println("b메소드 호출됨");
		a();
	}

}
