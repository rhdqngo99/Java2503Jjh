package java2503.basic;

public class Operator {
	
	public static void main(String[] args) {
		
		// 단항 연산자
		int i1 = 5;
		int j1 = -i1;
		
		// 전치 연산자
		int i2 = ++i1; // i1을 1 증가시키고 i2에 할당 => i1은 6, i2는 6
		// 후치 연산자
		int i3 = i2++; // i2를 i3에 할당하고 i2를 1 증가시킴 => i3은 6, i2 는 7 
		
		System.out.println("i2의 값 : " + i2);
		System.out.println("i3의 값 : " + i3);
		
		// 삼항 연산자
		int i4 = 5;
		int j2 = i4 > 5 ? 1 : 2;
		
		System.out.println(j2);
		
		// 비트 연산자
		byte b1 = 3;    // 00000011(2)
		byte b2 = ~3; // 11111100(2) => -4
		System.out.println(b2);
		
		// 양수를 음수로 변환하는 방법
		// 3 => 00000011(2)
		// 1) 비트 반전시킴 => 11111100(2)
		// 2) 1을 더함 => 11111101(2)
		
		byte b3 = 5; // 00000101(2)
		byte b4 = 3|5; // 00000011 | 00000101 => 00000111
		byte b5 = 3&5; // 00000011 & 00000101 => 00000001
		byte b6 = 3^5; // 00000011 ^ 00000101 => 00000110
		
		// 시프트 연산자
		byte b7 = 5; // 00000101
		byte b8 = 5 >> 3; // 00000101 > 00000000 (5를 3칸 우측으로 이동시키고 나머지 비트를 0으로 채움)
		byte b9 = 5 >>> 3; // 00000101 > 00000000 (5를 3칸 우측으로 이동시키고 나머지 비트를 부호비트로 채움)
		byte b10 = 3 << 2; // 00000011 > 00001100 (3을 2칸 좌측으로 이동시키고 나머지 비트를 0으로 채움)
		
		// 시프트 연산을 하는 이유?
		// 좌로 1비트 움직이면 2배, 우로 1비트 움직이면 1/2배
		// 3(00000011) >> 1 => 00000001(십진수 1)
		// 3(00000011) << 1 => 00000110(십진수 6)
		
		// 나머지 연산자 : 배수(2의 배수, 3의 배수 ....) 구할때
		int i5 = 7;
		int j5 = 3;
		System.out.println(i5 % j5); // 7 나머지 3 => 1
		
		// 관계 연산자
		int i6 = 10;
		int j6 = 5;
		System.out.println(i6==j6); // false
		System.out.println(i6!=j6); // true
		System.out.println(i6>j6); // true
		System.out.println(i6>=j6); // true
		System.out.println(i6<j6); // false
		System.out.println(i6<=j6); // false
		
		// 논리 연산자
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(!bool1); // false
		System.out.println(bool1 & bool2); // false
		System.out.println(bool1 | bool2); // true
		
		// 논리 연산자 &&, ||
		int i7 = 10;
		int j7 = 5;
		// 첫번째 조건인 i7>10 => false 이므로 두번째 조건인 j7<10는 실행하지 않음 => 어차피 결과는 false
		if (i7>10 && j7<10) {
			System.out.println("i7은 j7보다 큽니다!");
		}
		// 첫번째 조건인 i7>5 => true 이므로 두번째 조건인 j7<10는 실행하지 않음 => 어차피 결과는 true
		if (i7>5 || j7<10) {
			System.out.println("i7이 5보다 크거나 j7이 10보다 작다!");
		}
		
		// 대입 연산자
		int i8 = 5;
		int i9 = 3;
		i9 += i8; // i9 = i9 + i8;
		int i10 = 7;
		int i11 = 3;
		i10 %= i11; // i10 = i10 % i11;
		
		// 연산자 우선순위
		// 2 * 3 > 1 + 6
		// 2*3 연산 => 1+6 연산 => 6 > 7 연산 => result=false 
		boolean result = (2 * 3) > (1 + 6);
		
				
	} // main

} // class



























