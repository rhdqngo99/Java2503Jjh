package java2503.basic.oop.inheritance;

public class ChildMain {

	public static void main(String[] args) {
		
	// Child타입의 객체 생성
	// => Object가 생기고 Parent가 생기고 Child가 생김 
	Child child = new Child();
	
	// Parent에서 상속받은 변수/메소드
	System.out.println(child.nsi);
	System.out.println(child.si);
	child.m();
	child.sm();
	
	// Object에서 상속받은 메소드
	System.out.println(child.hashCode());
	
	Child child2 = new Child();
	System.out.println(child.equals(child2));
	System.out.println(child.getClass().getName());
	System.out.println(child.toString());
	
	}  

}
