package java2503.basic.oop;

public class TV extends Product {
	
	String company; // 제조사명
	String name; // 제품명
	int price; // 가격
	
	TV(){
	}

	public TV(String company, String name, int price) {
		this.company = company;
		this.name = name;
		this.price = price;
	}
		
}
