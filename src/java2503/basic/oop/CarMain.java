package java2503.basic.oop;

public class CarMain {
	
	public static void main(String[] args) {
		
		// Car타입 객체 생성
		// Car() 기본생성자 호출 > 메모리 Car타입객체 생성 > 생성된 객체 주소 > 해시알고리즘으로 참조값 생성
		// > 참조값을 bmw변수에 저장
		Car bmw = new Car();
		// java2503.basic.oop.Car@24d46ca6 : 타입@16진수8자리참조값
		System.out.println(bmw);
		System.out.println(bmw.hashCode()); // 참조값을 10진수로 출력
		
		// 또 하나의 Car타입 객체 생성
		Car bentz = new Car();
		// java2503.basic.oop.Car@4517d9a3
		// bmw와 bentz는 참조값이 다름 = 주소가 다름 = 다른 객체
		// 같은 객체라고 얘기하려면 참조값이 같아야 함!!!
		System.out.println(bentz);
		System.out.println(bentz.hashCode());
		
		// 객체의 멤버변수에 값을 할당
		bmw.carCount = 1; // static
		bmw.company = "BMW KOREA";
		bmw.model = "520D";
		bmw.name = "BMW";
		bmw.price = 1000;
		
		bentz.carCount = 2; // static
		bentz.company = "BENTZ KOREA";
		bentz.model = "AMG";
		bentz.name = "BENTZ";
		bentz.price = 2000;
		
		// Car의 static 멤버변수 carCount 출력
		// static 멤버변수는 메모리에 하나만 생성되서 객체들이 공유
		System.out.println(bmw.carCount); // 2
		
		bmw.price = 1500;
		bentz.price = 2500;
		// non-static 멤버변수는 객체마다 가짐
		System.out.println(bmw.price); // 1500
		System.out.println(bentz.price); // 2500
		
		// static 멤버변수는 클래스로 접근 가능
		System.out.println(Car.carCount); // 2
		Car.carCount = 3;
		System.out.println(bmw.carCount); // 3
		System.out.println(bentz.carCount); // 3
		
		// static 멤버메소드는 클래스, 객체 모두 접근 가능
		System.out.println(Car.getCarCount()); // 3
		System.out.println(bmw.getCarCount()); // 3
		System.out.println(bentz.getCarCount()); // 3
		
		// non-static 멤버메소드는 객체로 접근 가능
		// System.out.println(Car.getPrice());
		System.out.println(bmw.getPrice()); // 1500
		System.out.println(bentz.getPrice()); // 2500
		
		// static은 객체없이 사용가능하도록 하거나 객체들이 값을 공유해야 할때만 사용
		// static은 최소화해서 사용하는 것이 메모리 사용 효율을 높임
		
	} // main

} // class





























