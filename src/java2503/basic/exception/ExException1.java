package java2503.basic.exception;

public class ExException1 {

	// long은 8바이트 * Kilo * Kilo * Kilo => 8Giga
	long[] longArr = new long[1024*1024*1024];
	
	public static void main(String[] args) {
		
		// OutOfMemoryError 
		// 이클립스의 Heap의 기본 크기는 2Giga
		ExException1 obj = new ExException1();
		
		// a() > b() > a() ... 순환 호출 => StackOverflowError
		// a();
	}

	private static void a() {
		System.out.println("a메소드 호출됨!");
		b();
	}
	
	private static void b() {
		System.out.println("b메소드 호출됨!");
		a();
	}

}
