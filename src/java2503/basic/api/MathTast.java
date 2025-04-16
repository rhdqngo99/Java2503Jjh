package java2503.basic.api;

public class MathTast {

	public static void main(String[] args) {
		
		System.out.println(Math.abs(-10));
		System.out.println(Math.floor(3.14));
		System.out.println(Math.ceil(3.14));
		System.out.println(Math.max(10, 5));
		System.out.println(Math.min(10, 5));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.random());
		
		// 실습 : 1~45 정수 중 랜덤한 정수를 출력
		// Math.random() : 0.0 <= x < 1.0 인 임의의 실수
		System.out.println((int)(Math.random()*45) + 1);
		
		
	} // main

} // class
