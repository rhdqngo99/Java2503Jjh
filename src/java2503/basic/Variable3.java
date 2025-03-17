package java2503.basic;

public class Variable3 {
	
	// public 접근제한 : 모든 페키지의 모든 클래스에서 변수에 접근 가능
	public int pubi = 1;
	
	// protected 접근제한 : 동일한 패키지나 상속관계의 패키지 클래스에서 변수에 접근 가능
	protected int proi = 2;
	
	// default 접근제한 : 동일한 패키지의 클래스에서 변수에 접근 가능
	int di = 3;
	
	// private 접근제한 : 클래스 내에서만ㄴ 변수에 접근 가능
	private int prii = 4;
	
	/*
	  클래스명 앞에는 : public, default
	  생성자, 변수, 메소드 앞에는 : 4개 모두
	 
	 */
	
	
}
