package java2503.basic.oop;

public class AnimalMain {

	public static void main(String[] args) {
		
		// 강아지 한마리 만들어서 소리를 냅니다.
		Animal dog = new Dog();
		dog.sound();
		
		// 고양이 한마리 만들어서 소리를 냅니다.
		Animal cat = new Cat();
		cat.sound();
		
		// 파리를 한마리 만들어서 소리를 냅니다.
		Animal fly = new Animal() {
			@Override
			public void sound() {
				System.out.println("파리는 윙윙 소리를 냅니다!");
			}
		};
		fly.sound();
		
		// 상어를 한마리 만들어서 소리를 냅니다.
		Animal shark = new Animal() {
			@Override
			public void sound() {
				System.out.println("상어는 뚜르뚜뚜르 소리를 냅니다!");
			}
		};
		shark.sound();
		
		// 강아지를 한마리 만들어서 왈왈 소리를 냅니다.
		Animal dog2 = new Animal() {
			@Override
			public void sound() {
				System.out.println("강아지는 왈왈 소리를 냅니다!");
			}
		};
		dog2.sound();
		
		// 고양이를 한마리 만들어서 미오미오 소리를 냅니다.
		Animal cat2 = new Animal() {
			@Override
			public void sound() {
				System.out.println("고양이는 미오미오 소리를 냅니다!");
			}
		};
		cat2.sound();
		
		// 객체를 출력하면 "타입@참조값" 형태임
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.toString());
		
		// "참조값@타입"형태로 출력하는 객체를 생성해서 출력 테스트
		Object obj2 = new Object() {
			@Override
			public String toString() {
				return 
					Integer.toHexString(this.hashCode())
					+ "@"
					+ this.getClass().getName();
			}
	    };
	    System.out.println(obj2);
	    System.out.println(obj2.toString());
		
	} // main

} // class
