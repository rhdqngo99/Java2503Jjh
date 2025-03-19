package java2503.basic;

public class PrimitiveTypeCasting {
	
	public static void main(String[] args) {
		
		// 1은 4바이트 정수 (즉, int타입)이지만 byte범위에 있는 정수 => 자동형변환 됨
		byte b = 1;
		
		System.out.println("b변수의 값 : "+b);
		
		// 128도 4바이트 정수 (즉,int타입)...하지만 byte범위에 없는 정수 => 강제형변환 해줘야 함
		byte b2 = (byte)128; 
		
		// 데이터의 손실(loss)가 일어나서 전혀 엉뚱한 값이 출력됨
		System.out.println("b2변수의 값 : "+b2);
		
		short s = 2;
		int i = 3;
		long l = 4;
		float f = 1.0f;
		double d = 2.0;
		char c = 'A';
		boolean bool = true;
		
		// 자동형변환
		// b는 byte타입, s는 short타입, b가 2바이트 short으로 자동형변환된 후에 s에 저장됨
		s = b; // s = (short)b;
		
		// 강제 형변환
		// b는 byte타입, s는 short타입, s를 1바이트 byte로 강제형변환 해줘야 함
		b = (byte)s;
		
		// 자동형변환
		l = i;
		
		// 강제형변환
		i = (int)l;
		
		// 자동형변환
		d = f;
		
		// 강제형변환
		f = (float)d;
		
		// 자동형변환 (65는 bayt범위에 있으므로)
		b = 65; // b = (byte)65;
		
		// byte를 char로 변환하려면 강제형변환 해줘야 함
		// WHY? byte, char는 비트 배열이 틀림
		// byte는 부호화 정수(맨앞의 비트가 부호비트)
		// char는 비부호화 정수(맨앞의 비트가 데이터비트)
		c = (char)b;
		System.out.println(c);//A (ASCII코드 65는 대문자 A)
		
		char c2 = '김'; // 2byte 유니코드
		byte b3 = (byte)c2; // 1byte 버려짐
		char c3 = (char)b3;
		System.out.println(c3); //64
		
		short s2 = (short)c2;
		System.out.println(s2);
		
		// boolean타입은 다른 타입과 형변환 불가
		// i = bool;
		
		long l2 = 100;
		float f2 = 100.f;
		//float 표현 범위가 long보다 넓어서 강제형변환 해야 할당 가능
		// l2 = f2;
		l2 = (long)f2;
		System.out.println(l2);
		
	} // main
	

} // class
