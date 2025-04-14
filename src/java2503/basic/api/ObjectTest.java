package java2503.basic.api;

public class ObjectTest {
	
	public static void main(String[] args) {
		
		Person person = new Person("홍길동", 20);
		System.out.println(person.hashCode());
		System.out.println(person);
		
		// clone된 객체는 같은 내용을 가진 다른 객체
		// clone메소드는 왜 있지? => 동일한 내용의 객체를 빠르게 생성하는 장점
		
		// clone메소드는 호출시 클론이 지원되지 않으면 예외발생하므로 예외처리 해야 함
		try {
			// clone메소드는 Object를 반환하므로 Person으로 하위형변환 해야 함
			Person clone = (Person)person.clone();
			// Person과 참조값이 다르므로 다른 객체
			System.out.println(clone.hashCode());
			System.out.println(clone);
			
			System.out.println(person==clone); // 참조값비교 false
			System.out.println(person.equals(clone)); // name,age비교, true
			
			clone.finalize();
			
			// reflection : 객체를 통해서 클래스에 접근
			Class personClass = person.getClass();
			System.out.println(personClass.getName());
			System.out.println(personClass.getPackageName());
			
		} catch (CloneNotSupportedException cnse) {
		   cnse.printStackTrace();
		} catch (Throwable t) {
			t.printStackTrace();
		}
		
	} // main

} // class
