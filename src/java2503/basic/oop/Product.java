package java2503.basic.oop;

// 제품
public class Product {
	
	String company; // 제조사명
	String name; // 제품명
	int price; // 가격
	
	Product(){
	}
	
	Product(String company, String name, int price){
		this.company = company;
		this.name = name;
		this.price = price;
	}

}
