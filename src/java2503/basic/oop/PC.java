package java2503.basic.oop;

public class PC {
	
	// 클래스와 멤버변수의 관계
	// has a 관계 : PC has a company, PC has a price, PC has a Monitor ...
	//                  PC객체가 생성이 되려면 Monitor, Desktop, Keyboard 객체가 생성되어야 함
	//                  = 위임 (Delegation) = weak coupling (약한 결합)
	
	String company; // 제조회사
	int price;
	Monitor monitor;
	Desktop desktop;
	Keyboard keyboard;

}
