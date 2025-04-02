package java2503.basic.oop;

public class Car2 {
	
	/* 정보은닉(Information Hiding) = 캡슐화(Encapsulation)
	 	- 멤버변수들을 private으로 선언
	 	- 필요한 경우에 public getter/setter 메소드를 생성
	 	- getter는 멤버변수의 값을 리턴(획득) : get멤버변수명을대문자로시작() 형태의 메소드
	 	- setter는 멤버변수의 값을 변경 : set멤버변수명을대문자로시작(멤버변수타입 변수명) 형태의 메소드
	 	- Source메뉴 > Generate getters and setters.. > 필요한 멤버변수 선택 > Generate
	 */
	
	private String company;
	private String model;
	private String name;
	private int price;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	private void setPrice(int price) {
		this.price = price;
	}

}













