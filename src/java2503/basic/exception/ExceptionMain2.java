package java2503.basic.exception;

public class ExceptionMain2 {
	
	// b메소드에서 발생한 ArithmeticException을... main메소드는
	// 1. try~ catch~로 직접 처리
	// 2. main메소드를 호출한 JVM 예외를 던짐(위임) : 의미 없음
	// 결론 : 메소드호출관계에서 main까지 예외가 전달된다면
	//		 main은 반드시 try~ catch~로 직접 처리해야 함!
	public static void main(String[] args) throws ArithmeticException{
		System.out.println("main메소드 호출됨!");
		//try {
		a();
		//} catch (ArithmeticException ae) {
		// System.out.println("main메소드에서 직접 예외를 처리함");
		//}
	} // main

	// b메소드에서 발생한 ArithmeticException을... a메소는
	// 1. try~ catch~로 직접 처리
	// 2. a메소드를 호출한 main메소드에서 예외를 던짐(위임)
	private static void a() throws ArithmeticException{
		System.out.println("a메소드 호출됨!");
		//try { 
		b();
		//} catch (ArithmeticException ae) {
		// System.out.println("a메소드에서 직접 예외를 처리함");
		//}
	}
	
	// b메소드에서 ArithmeticException 발생!
	// 1. try~ catch~로 직접 처리
	// 2. b메소드를 호출한 a메소드에게 예외를 던짐(위임)
	private static void b() throws ArithmeticException{
		System.out.println("b메소드 호출됨!");
		//try {
			int i = 10 / 0;  
		//} catch (ArithmeticException ae) {
		// System.out.println("b메소드에서 직접 예외를 처리함");
		//}
	}
	
} // class
