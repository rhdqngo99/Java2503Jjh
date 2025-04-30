package java2503.basic.io;

import java.io.Serializable;

public class Todo implements Serializable{

	private static final long serialVersionUID = 3289479234798234L;
	
	int userId;
	int id;
	String title;
	boolean completed;
	
	public Todo() {
	}

	public Todo(int userId, int id, String title, boolean completed) {
		super();
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "Todo [userId=" + userId + ", id=" + id + ", title=" + title + ", completed=" + completed + "]";
	}
	
}
