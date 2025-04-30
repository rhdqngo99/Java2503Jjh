package java2503.basic.io;

import java.io.Serializable;

// 직렬화 클래스
// 1. Java.io.Serializable 인터페이스를 구현해야 함
// 2. private static final long serialVerdionUID를 생성

public class Person implements Serializable {

	private static final long serialVerdionUID = 3209646851316845132L;
	
	String name; // 이름, 문자열은 직렬화 가능
	int age; // 나이, 기본타입은 직렬화 가능
	transient String ssn; // 주민번호, transient 키워드가 붙은 변수는 직렬화 시 기본값으로 직렬화 됨
	
	public Person() {
	}
	
	public Person(String name, int age, String ssn) {
		this.name = name;
		this.age = age;
		this.ssn = ssn;
	}
	
}
