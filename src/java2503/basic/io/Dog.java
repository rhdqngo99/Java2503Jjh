package java2503.basic.io;

import java.io.Serializable;

public class Dog extends Animal implements Serializable{
	
	private static final long serialVersionUID = 2389472394789324792L;
	
	String sound;
	
	public Dog() {
	}
	
	public Dog(String name, int legCount, String sound) {
		super(name, legCount);
		this.sound = sound;
	}
	
	@Override
	public String toString() {
		return this.name + ", " + this.legCount + ", " + this.sound;
	}

}
