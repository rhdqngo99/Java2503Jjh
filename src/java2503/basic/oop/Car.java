package java2503.basic.oop;

public class Car {
	
	// static member variable
	// 1. 클래스로딩타임에 JVM이 관리하는 method영역에 하나만 생성됨
	// 2. 클래스를 통해서 생성되는 객체들이 값을 공유
	// 3. 객체 생성없이 클래스를 통해서 사용 가능 ex) Car.carCount
	static int carCount = 0;	// 생성된 자동차 수
	
	// non-static member variable
	// 1. 객체를 생성한 후 객체를 통해서 사용 가능
	// 2. 객체마다 변수를 각각 가지게 됨
	String company; // 제조사명
	String model;// 모델명
	String name;	// 이름
	int price;	// 판매가
	
	// static member method
	// 객체 생성없이 클래스를 통해서 사용 가능 ex) Car.getCarCount()
	public static int getCarCount() {
		return carCount;
		// return price; // static 영역에서 non-static 사용 불가. WHY? static이 먼저 메모리에 생성되므로
	}
	
	// non-static member method
	// 객체를 생성한 후 객체를 통해서 사용가능한 메소드
	public int getPrice() {
		return price;
		// return carCount; // non-static 영역안에서 static 사용은 언제나 가능
	}

}















