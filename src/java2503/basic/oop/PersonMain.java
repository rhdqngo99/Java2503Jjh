package java2503.basic.oop;

public class PersonMain {
	
	public static void main(String[] args) {
		
		// Person타입의 객체를 생성
		// Person의 기본생성자를 호출해서 Person타입객체를 메모리에 생성
		// 메모리상에서 생성된 객체의 주소를 참좋로 변환해서 참조값을 hong에 저장
		Person hong = new Person();
		
		//Person [name=null, job=null, age=0, height=0.0]
		// 객체의 non-static 멤버변수들은 각자의 타입의 기본값으로 자동 초기화 됨
		// 반면 static 멤버변수들은 반드시 초기화해서 사용해야 됨(= 생성자에서 초기화 하는 것이 아님)
		// name은 String이므로 null로 초기화 됨
		// job은 String이므로 null로 초기화됨
		// age는 int이므로 0으로 초기화 됨
		// heing는 float이므로 0.0으로 초기화 됨
		System.out.println(hong); // .toString()이 생략된 것
		// = System.out.println(hong.toString());
		
		// static은 객체 생성시점 이전에 모두 메모리얼에 올라와 있음
		// static은 생성자와 상관이 없음
		System.out.println(Person.personCnt); // 0
		System.out.println(hong.personCnt); // 0
		
		// 파라미터가 1게 있는 생성자를 호출해서 Person타입 객체 생성
		// Person [name=강감찬, job=null, age=0, height=0.0]
		Person kang = new Person("강감찬");
		System.out.println(kang);
		
		// 파라미터가 4개 있는 생성자를 호출해서 Person타입 객체 생성
		Person lee = new Person("이순신","장군", 30, 170.5f);
		System.out.println(lee);
		
	} // main

} // class
