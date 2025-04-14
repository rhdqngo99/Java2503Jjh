package java2503.basic.api;

/*
  - String은 불변 (메모리에 String이 한번 생성되면 변경 불가)
  - 문자열들을 접합하는 작업이 빈번해지면 메모리에 쓸데없는 문자열이 늘어남
  - 이런 문제점을 보완하기 위해서 StringBuffer, StringBuilder를 사용함
  - StringBuffer, StringBuilder는 버퍼에 문자들을 넣고 모든 작업을 완료한 후 문자열로 변환
  - StringBuffer : Thread Safe (쓰레드 환경에서 안전함, 쓰레드가 동시에 문자열을 같이 접근할 수 없음)
  - StringBuilder : Thread Unsad
  - 
 */
public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();
		
		// 초기 버퍼용량은 16, 문자가 버퍼용량을 초과하면 자동으로 증가
		System.out.println(sb1.capacity()); // 기본 버퍼용량 16
		
		sb1.append("H");
		sb1.append("e");
		sb1.append("l");
		sb1.append("l");
		sb1.append("o");
		sb1.append("");
		sb1.append("J");
		sb1.append("a");
		sb1.append("v");
		sb1.append("a");
		
		System.out.println(sb1.capacity()); // 16
		System.out.println(sb1.length()); // 10
		
		sb1.append("");
		sb1.append("자");
		sb1.append("바");
		sb1.append("");
		sb1.append("재");
		sb1.append("밌");
		sb1.append("나");
		sb1.append("요");
		
		// 버퍼의 크기를 초과하면 자동으로 증가
		System.out.println(sb1.capacity()); // 34
		System.out.println(sb1.length()); // 18
		
		// 버퍼를 문자열로 변환
		String str1 = sb1.toString();
		System.out.println(str1);
		
		StringBuilder sb2 = new StringBuilder("안녕하세요 자바!");
		
		System.out.println(sb2.capacity()); // 25
		System.out.println(sb2.length()); // 9
		
		System.out.println(sb2.charAt(2)); // 하
		
		sb2.delete(2,5);
		System.out.println(sb2); // 안녕 자바!
		
		sb2.ensureCapacity(50); // 50이상으로 용량 증가
		System.out.println(sb2.capacity()); // 52
		
		sb2.trimToSize();
		System.out.println(sb2.capacity()); // 6
		
		StringBuilder sb3 = new StringBuilder("Java Java Java");
		
		System.out.println(sb3.indexOf("Java", 5));
		System.out.println(sb3.insert(5, "Hi"));
		System.out.println(sb3.lastIndexOf("Java"));
		System.out.println(sb3.length());
		System.out.println(sb3.replace(5, 7, "Hello"));
		System.out.println(sb3.reverse());
		
		sb3.setCharAt(0, 'J');
		System.out.println(sb3);
		
		System.out.println(sb3.substring(5));
		System.out.println(sb3.substring(5, 9));
		
	} // main
	
} // class
