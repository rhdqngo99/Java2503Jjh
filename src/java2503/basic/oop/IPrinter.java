package java2503.basic.oop;

// 역할 : 프린터라면 공통적으로 가지는 기능들을 설계
public interface IPrinter {
	
	// pubic static final 상수 선언 가능
	// pubic abstract 머소드 선언 가능
	// 변수, 생성자, 일반메소드 선언 불가능
	
	// 프린터 켜기 기능 설계
	public abstract void turnOn();
	
	// 프린터 프린트 기능 설계
	public abstract void print();
	
	// 프린터 끄기 기능 설계
	public abstract void turnOff();

}
