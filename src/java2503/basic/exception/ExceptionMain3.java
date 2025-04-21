package java2503.basic.exception;

public class ExceptionMain3 {
	
	// 예외를 활용한 프로그래밍 기법
	// 1. 사용자정의예외클래스를 생성
	// 2. 상황에 따라 사용자정의예외를 발생시킴
	// 3. 발생한 예외를 처리

	public static void main(String[] args) {
		
		int age = (int)(Math.random()*20) + 10; // 랜덤한 10~29사이의 값
		System.out.println("나이 : " + age);
		
		try {
			if(age<=15) {
				// 예외객체를 생성해서 예외를 발생시킴
				throw new Under15Excption();
			} else if (age<=19) { // 16~19
				throw new Under19Excption();
			} else { // 20이상
				System.out.println("20세 이상이므로 통과!");
			}
		} catch (Under15Excption u15e) {
			System.out.println(u15e);
		} catch (Under19Excption u19e) {
			System.out.println(u19e);
		}
		
	} // main

} // class
