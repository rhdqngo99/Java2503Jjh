package java2503.basic.exception;

public class ExException3 {

	public static void main(String[] args) {
		
		// "홍길동/산적, 강감찬/장군, 이순신/장군, 임꺽정/산적, 권율/장군"의 이름과
		// 직업을 가진 5명의 Person을 생성합니다. 직업이 '산적'인 Person이 생성되면
		// "좋은 직업을 선택하세요!"라는 메시지를 출력하는 
		// JobException을 발생시킵니다.
        Person[] people = {
                new Person("홍길동", "산적"),
                new Person("강감찬", "장군"),
                new Person("이순신", "장군"),
                new Person("임꺽정", "산적"),
                new Person("권율", "장군")
            };
        for (Person person : people) {
			try {
				checkJob(person);
				System.out.println(person.name + " - " + person.job);
			} catch (Exception e) {
				
			}
		}
        
	} // main

	private static void checkJob(Person person) {
		
	}

} // class

class Person {
    String name;
    String job;
    
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }
}