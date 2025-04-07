package java2503.basic.oop.inheritance;

public class Car extends Vehicle {
	
	private String name;
	
	Car() {
		// Vehicle에서 name은 private
		// Car의 멤버변수 name
		this.name = "자동차";
	}
	
	@Override
	String getName() {
		return this.name;
	}

}
