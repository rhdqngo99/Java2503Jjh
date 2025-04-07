package java2503.basic.oop.inheritance;

// 상속을 해주는 클래스 
// 상위(super) = 부모(parent) = 베이스(base)
// 클래스 선언 뒤에 extends Object가 생략되어 있음 = Object를 상속받고 있음
public class Parent {

	private static int psi; // private선언한 변수는 상속 불가
	private int psin; // private선언한 변수는 상속 불가
	static int si; // 상속 가능
	int nsi; // 상속 가능
	
	public Parent() { // 생성자는 상속 불가
		
	}
	
	private static void psm() { // private선언한 메소드는 상속 불가
		System.out.println("psm()");
	}
	
	private void pm() { // private선언한 메소드는 상속 불가
		System.out.println("pm()");
	}
	
	static void sm() { // 상속 가능
		System.out.println("sm()");
	}
	
	void m() { // 상속 가능
		System.out.println("m()");
	}

}
