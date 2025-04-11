package java2503.basic.oop;

public class OuterMain {
	
	public static void main(String[] args) {
		
		// Outer 객체 생성
		Outer outerObject = new Outer();
		outerObject.print();
		
		// static inner class 객체 생성
		Outer.SIClass outerSIClassObject = new Outer.SIClass();
		outerSIClassObject.print();
		
		// non-static inner class 객체 생성
		// non-static inner class는 outer class의 객체를 통해 생성 가능
		// 클래스=static, 객체=non-static
		Outer.NSIClass outerNSIClassObject = new Outer().new NSIClass();
		outerNSIClassObject.print();
		
		Outer.NSIClass outerNSIClassObject2 = outerObject.new NSIClass();
		outerNSIClassObject2.print();
		
	} // main

} // class

