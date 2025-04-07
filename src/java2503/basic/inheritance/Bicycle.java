package java2503.basic.oop.inheritance;

public class Bicycle extends Vehicle{
	
	private String name;
	
	public Bicycle() {
		this.name = "자전거";
	}
	
	@Override
	String getName() {
		return this.name;
	}
	
	
}
