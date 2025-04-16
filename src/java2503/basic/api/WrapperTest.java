package java2503.basic.api;

import java.util.ArrayList;
import java.util.List;

public class WrapperTest {

	public static void main(String[] args) {
		
		// auto wrapping : 참조타입이 필요할때 기본타입이 참조타입으로 자동 래핑
		Integer i = 10;
		// ===> Integer i = new Integer(10);
		
		System.out.println(i.intValue()); // unwrapping : 참조타입에서 기본타입 값 꺼냄
		System.out.println(Integer.compare(10, 5)); // 앞이 크면1
		System.out.println(Integer.compare(10, 10)); // 같으면 0
		System.out.println(Integer.compare(5, 10)); // 뒤가 크면 -1
		
		Double d = 3.14;
		System.out.println(Double.isFinite(d)); // 유한수인지
		System.out.println(Double.isInfinite(d)); // 무한수인지
		System.out.println(d.isNaN()); // 숫자가 아닌지
		System.out.println(Double.max(3.14, 5.5)); 
		System.out.println(Double.min(3.14, 5.5)); 
		
		int result = Integer.parseInt("10");
		System.out.println(result);
		
		// 숫자가 아닌 경우 java.lang.NumberFormatException (숫자의 형식이 아님)
		try {
		int num = Integer.parseInt("홍길동");
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		
		int i2 = 15;
		System.out.println(Integer.toBinaryString(i2)); // 2진 문자열
		System.out.println(Integer.toOctalString(i2)); // 8진 문자열
		System.out.println(Integer.toHexString(i2)); // 16진 문자열
		
		// Wrapper의 존재 이유는 기본타입을 참조타입화 하는 것!
		// 기본타입과 참조타입은 형변환 되지 못함!
		//Object obj = 3;
		Object obj = new Integer(3); // wrapping (기본타입을 참조타입화)
		System.out.println(obj);
		int i3 = ((Integer)obj).intValue(); // unwrapping (참조타입을 기본타입화)
		System.out.println(i3);
		
		// Integer들을 저장할 수 있는 리스트 객체 생성
		List<Integer> intList = new ArrayList<Integer>();
		// auto wrapping
		intList.add(3); // = new Integer(3)
		intList.add(5);
		intList.add(7);
		
		// 리스트에 있는 Integer의 수만큼 반복
		int sum = 0;
		for (Integer i4 : intList) {
			sum += i4; // 덧셈 연산을 위해서 Integer > int로 auto unwrapping
		}
		System.out.println(sum);
		
	}

}
