package java2503.basic;

public class Person {
	
	public static void main(String[] args) {
		
		
	 // Person타입의 객체를 JVM이 관리하는 Heap메모리 영역에 생성하고
	 // 생성된 객체의 메모리 주소에 해당하는 해시값(=참조=참조값)을 
	 // 해시알고리즘을 통해 생성해서 Person 객체참조변수에 저장
	 Person person = new Person();
	 System.out.println(person);
	 
	 Person person2 = new Person();
	 System.out.println(person2);
		
	}

}






