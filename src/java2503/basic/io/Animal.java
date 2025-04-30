package java2503.basic.io;

import java.io.Serializable;

public class Animal implements Serializable{
	
	private static final long serialVersionUID = 328947923478923L;
	
	String name; // 이름
	int legCount; // 다리 수
	
	public Animal() {
	}
	
	public Animal(String name, int legCount) {
		this.name = name;
		this.legCount = legCount;
	}

}

