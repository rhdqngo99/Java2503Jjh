package java2503.basic.oop;

public class Outer {
	
	// static member variable
	static int si = 1;
	
	// non-static member variable
	int nsi = 2;
	
	// static inner class
	static class SIClass {
		void print() {
			// static inner class에서 outer class의 static member variable 접근 가능
			System.out.println("SIClass print si => " + si);
			// static inner class에서 outer class의 non-static member variable 접근 불가
			//System.out.println("SIClass print nsi => " + nsi);
		}
	}
	
	// non-static inner class
	class NSIClass {
		void print() {
			// non-static inner class에서 outer class의 static member variable 접근 가능
			System.out.println("SIClass print si => " + si);
			// non-static inner class에서 outer class의 non-static member variable 접근 가능
			System.out.println("SIClass print nsi => " + nsi);			
		}
	}
	
	void print() {
		
		int li = 3; // print메소드의 지역변수
		System.out.println("Outer클래스의 print메소드 호출됨!");
		
		// local inner class
		class LIClass {
			void print() {
				System.out.println("LIClass print si => " + si); // Outer클래스의 static멤버변수
				System.out.println("LIClass print nsi => " + nsi); // Outer클래스의 non-static멤버변수
				System.out.println("LIClass print li => " + li); // 지역변수
			}
		}
		
		// local inner class의 객체 생성
		LIClass liClass = new LIClass();
		liClass.print();
		
	}

} // Outer
