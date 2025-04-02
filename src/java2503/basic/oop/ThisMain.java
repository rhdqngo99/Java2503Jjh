package java2503.basic.oop;

public class ThisMain {
	
	private String str;
	private int i;
	private ThisMain thisMain2;
	private static ThisMain thisMain3;

	public static void main(String[] args) {
		
		// static영역에서 non-static 멤버변수 사용 불가
		// => static영역에서는 this 사용 불가
		// str = "Hello";
		// this.str = "Hello";
		
		// 지역변수 : 생성자나 메소드의 파라미터 또는 생성자나 메소드 안에서 선언한 변수
		// thisMain은 main메소드내에서 선언되었으므로 main메소드의 지역변수(loct variable)
		// => main메소드가 종료하면 thisMain은 메모리에서 사라짐
		ThisMain thisMain = new ThisMain();
		
		// thisMain2는 멤버변수이므로 static영역내에서 참조할 수 없음
		// thisMain2 = new ThisMain();
		
		// thisMain3은 static 멤버변수이므로  static영역내에서 참조 가능 
		thisMain3 = new ThisMain();
		
		// static메소드 main내에서 this 사용 불가
		// System.out.println(this.str);
		// System.out.println(this.i);
		
		// thisMain은 지역변수이므로 문제 없음
		System.out.println(thisMain.str);
		// thisMain3은 static 멤버변수이므로 문제 없음
		System.out.println(thisMain3.i);

	} // main
	
	// non-static 메소드
	public void print() {
		System.out.println(this);
		System.out.println(this.str);
		System.out.println(this.i);
		// thisMain은 main메소드의 지역변수이므로 print메소드에서 사용 불가
		// System.out.println(this.thisMain);
		// thisMain2는 non-static 멤버변수이므로 non-static 메소드인 print에서 사용 가능
		System.out.println(this.thisMain2);
		// thisMain3는 static 멤버변수이므로 non-static 메소드인 print에서 사용 가능 
		System.out.println(this.thisMain3);
	}

} // class
