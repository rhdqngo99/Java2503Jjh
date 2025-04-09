package java2503.basic.oop;

import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

public abstract class AbstractPrinter implements IPrinter {
	
	// 추상클래스는 변수, 상수, 추상메소드, 일반메소드, 생성자 모두 선언 가능
	// 추상메소드를 하나라도 가지고 있으면 추상클래스
	// 추상메소드가 없다고 하더라도 abstract로 선언된 클래스는 추상클래스
	// 추상클래스는 객체 생성 불가
	// 구체클래스가 추상클래스를 상속받아 추상클래스에 있는 추상메소드를 구현하기 위한
	// 목적으로 추상클래스를 만듬
	
	
	String sort; // 종류
	String company; // 제조사
	String name; // 이름
	int price; // 가격
	
	public AbstractPrinter() {
		
	}

	public AbstractPrinter(String sort, String company, String name, int price) {
		super();
		this.sort = sort;
		this.company = company;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public void turnOn() {
		System.out.println(name + "프린터의 전원을 켜다!");
	}
	
	@Override
	public abstract void print();
	
	@Override
	public void turnOff() {
		System.out.println(name + "프린터의 전원을 끄다!");
	}
	
}
