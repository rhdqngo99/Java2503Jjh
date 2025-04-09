package java2503.basic.oop;

public class ProductMain {

	public static void main(String[] args) {
		
		// tv1의 타입은 TV, 가지고 있는 참조의 타입은 TV
		TV tv1 = new TV();
		
		// radio1의 타입은 Radio, 가지고 있는 참조 타입은 Radio
		Radio radio1 = new Radio();
		
		// 상위형변환(up casting = auto casting = implicit casting)
		// tv2의 타입은 Product, 가지고 있는 참조의 타입은 TV
		Product tv2 = new TV();
		
		// 하위형변환(down casting = force casting = explicit type casting)
		Product tv3 = new Product();
		// 하위형변환은 형변환 연산을 명시적으로 해줘야 함
		// TV tv4 = tv3;
		// 컴파일은 문제 없지만 실행시간에 java.lang.ClassCastException (형변환 예외) 발생!
		//TV tv4 = (TV)tv3;
		
		// 상위형변환
		Product tv4 = new TV();
		// 상위형변환 후에 하위형변환을 하므로 문제 없음! (참조범위를 알고 있어야 형변환이 가능!)
		TV tv5 = (TV)tv4;
		
		// 상위형변환
		Object obj1 = new Product();
		// 하위형변환
		Product prod1 = (Product)obj1;
		
		// 상위형변환
		Object obj2 = new Radio();
		// 하위형변환
		Radio radio2 = (Radio)obj2;
		
		// 전자제품 공장에서 TV500대와 Radio 500대를 생산한다고 가정
		
		// solution1
		TV[] tvArr = new TV[500];
		int tvArrLeng = tvArr.length;
		for (int i=0; i<tvArrLeng; i++) {
			tvArr[i] = new TV();
			System.out.println((i+1)+"번째 TV가 생성됨!");
		}
		Radio[] radioArr = new Radio[500];
		int radioArrLeng = radioArr.length;
		for (int i=0; i<radioArrLeng; i++) {
			radioArr[i] = new Radio();
			System.out.println((i+1)+"번째 Radio가 생성됨!");
		}
		
		// 생산된 TV500대와 Radio 500대를 변수 하나에 담아보자!
		// TV와 Radio만 사용하면 하나의 변수에 담을 수 없음
		// => TV와 Radio의 상위타입에 저장 가능!
		Product[] prodArr = new Product[1000];
		int prodArrLeng = prodArr.length;
		for (int i=0; i<prodArrLeng; i++) {
			if(i%2==0) {
				prodArr[i] = new TV(); // 상위 형변환
				System.out.println((i+1)+"번째 TV가 생성됨!");
			}
			else {
				prodArr[i] = new Radio(); // 상위 형변환
				System.out.println((i+1)+"번째 Radio가 생성됨!");
			}
		}
		
		for (int i=0; i<prodArrLeng; i++) {
			if(prodArr[i] instanceof TV) { // prodArr[i]가 TV 타입과 화환 타입인지
				System.out.println((i+1)+"번째 제품은 TV입니다!");
			} else if(prodArr[i] instanceof Radio) { // prodArr[i]가 Radio 타입과 화환 타입인지
				System.out.println((i+1)+"번째 제품은 Radio입니다!");
			}
		}
		
		for (int i=0; i<prodArrLeng; i++) {
			if(prodArr[i] instanceof TV) { // prodArr[i]가 TV 타입과 화환 타입인지
				TV tv = (TV)prodArr[i]; // 하위형변환
			} else if(prodArr[i] instanceof Radio) { // prodArr[i]가 Radio 타입과 화환 타입인지
				Radio radio = (Radio)prodArr[i]; // 하위형변환
			}
		}
		
		// 상속관계에 있지 않은 TV와 Radio간에는 형변환 불가
		TV newtv = new TV();
		Radio newradio = new Radio();
		// TV newtv2 = (Radio)newradio;
		// Radio newradio2 = (TV)newtv;
		
		// ************************************************
		// *** 하위타입 객체를 생성하면 상위타입 객체참조변수에 할당 ***
		// ************************************************
		
		// Product 생성
		Product p = new Product("회사", "제품명", 0);
		System.out.println(p.name);
		
		// TV 생성
		// TV t = new TV("삼송", "잘보여2", 1000);
		Product t = new TV("삼송", "잘보여2", 1000);
		System.out.println(t.name); // Product t의 name은 할당하지 않았으므로 null
		System.out.println(((TV)t).name); // 잘보여2
		
		// Radio 생성
		// Radio r = new Radio("알지", "잘들려3", 500);
		Product r = new Radio("알지", "잘들려3", 500);
		System.out.println(r.name); // Product r의 name은 할당하지 않았으므로 null
		System.out.println(((Radio)r).name); // 잘들려3
		
	} // main

} // class