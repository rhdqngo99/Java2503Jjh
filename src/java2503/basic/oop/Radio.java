package java2503.basic.oop;

public class Radio extends Product {
	
	String company; // 제조사명
	String name; // 제품명
	int price; // 가격
	
	Radio() {
	}

	public Radio(String company, String name, int price) {
		this.company = company;
		this.name = name;
		this.price = price;
	}
	
}
