package java2503.basic;

public class Variable1 {
	
	public static void main(String[] args) {
		
		// 자바의 기본타입 8가지
		
		//정수타입 : 정수값의 기본타입은 int
		byte b = 1; // 1바이트 정수, 표현범위:-2^7 ~ 2^7-1 
		short s = 2; // 2바이트 정수, 표현범위:-2^15 ~ 2^15-1 
		int i = 3; // 4바이트 정수, 표현범위:-2^31 ~ 2^31-1
		long l = 4; // 8바이트 정수, 표현범위:-2^63 ~ 2^63-1 
		
		//실수타입 : 실수값의 기본타입은 double
		float f = 3.14f; // 4바이트 실수(부동소수), 지수부/가수부로 구성
		double d = 2.1; // 8바이트 실수, 지수부/가수부로 구성
		
		// 문자타입
		char c = 'A'; // 2바이트 유니코드 문자
		
		// 불리언타입 
		boolean bool = true; // 1바이트 true 또는 false의 값만 가짐
		
		
	} // main

} // class
