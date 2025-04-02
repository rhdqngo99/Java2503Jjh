package java2503.basic.oop;

public class Person {
	
	public static int personCnt;
	
	private String name; // 이름
	private String job; // 직업
	private int age; // 나이
	private float height; // 키
	
	// 기본 생성자
	// 클래스에 파라미터가 있는 생성자가 없는 경우에는 자동으로 생성됨
	public Person() {
	}
	
	// 한 개의 파라미터를 가진 생성자
	public Person(String name) {
		// 멤버변수명과 파라미터명이 같으면 this. 을 생략할 수 없음
		// this.name => 멤버변수
		// name => 파라미터
		this.name = name;
	}
	
	// 네 개의 파라미터를 가진 생성자
	public Person(String name, String job, int age, float height) {
		//super(); // 상위타입 객체 생성을 위해서 상위타입 클래스의 기본 생성자(= Object())를 호출, 생략가능
		this(name); // Person(String name) 생성자를 호출
		//this.name = name;
		this.job = job;
		this.age = age;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	// toString메소드를 오버라이딩 해 놓으면 객체를 출력할때 return하는 문자열 형태로 출력 해 줌. 
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + ", age=" + age + ", height=" + height + "]";
	}
	
} // class
