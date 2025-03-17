package java2503.basic;

public class Wrapper {
	
	public static void main(String[] args) {
		
		byte b = 1; // 1바이트 정수, 표현범위:-2^7 ~ 2^7-1 
		short s = 2; // 2바이트 정수, 표현범위:-2^15 ~ 2^15-1 
		int i = 3; // 4바이트 정수, 표현범위:-2^31 ~ 2^31-1
		long l = 4; // 8바이트 정수, 표현범위:-2^63 ~ 2^63-1 
		float f = 3.14f; // 4바이트 실수(부동소수), 지수부/가수부로 구성
		double d = 2.1; // 8바이트 실수, 지수부/가수부로 구성
		char c = 'A'; // 2바이트 유니코드 문자
		boolean bool = true; // 1바이트 true 또는 false의 값만 가짐
		
		// Wrapper class
		// Wrapper : 기본타입의 값을 갖는 참조타입을 생성 = Boxing
		Byte wb = new Byte(b);
		Short ws = new Short(s);
		Integer wi = new Integer(i);
		Long wl = new Long(l);
		Float wf = new Float(f);
		Double wd = new Double(d);
		Character wc = new Character(c);
		Boolean wbool = new Boolean(bool);
		
		//Unwrapping : 참조타임에서 기본타입의 값을 꺼내는 것 = UnBoxing
		System.out.println(wb.byteValue());
		System.out.println(ws.shortValue());
		System.out.println(wi.intValue());
		System.out.println(wl.longValue());
		System.out.println(wf.floatValue());
		System.out.println(wd.doubleValue());
		System.out.println(wc.charValue());
		System.out.println(wbool.booleanValue());
		
		// 참조타입과 기본타입간의 연산
		// auto unwrapping (+연산을 하기 위해 wi가 가지고 있는 3의 값을 꺼내)
		int result = wi + 5;
		
		// auto wrapping (참조타입에 값을 할당하기 위해 7이 new Integer(7) 연산을 함)
		Integer in = 7;
				
		
	} // main

} // class
