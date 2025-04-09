package java2503.basic.oop;

public class PrinterMain {

	public static void main(String[] args) {
		
		// 객체 생성시는 항상 상위타입으로 생성
		// 다형성 : 같은 타입일지라도 가지고 있는 참조의 타입에 따라 각자의 메소드를 수행
		// 		   = 오버라이딩의 목적!
		
		IPrinter inkjet = new InkjetPrinter("잉크젯", "삼송", "잉크안막혀2", 1000);
		IPrinter razor = new RazorPrinter("레이져", "앱송", "종이다잘려3", 2000);
		
		inkjet.turnOn();
		inkjet.print();
		inkjet.turnOff();
		
		razor.turnOn();
		razor.print();
		razor.turnOff();
		

	} // main

} // class
