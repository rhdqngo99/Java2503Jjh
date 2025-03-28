package java2503.basic;

public class Array {
	
	public static void main(String[] args) {
		
		// 배열 선언 : 배열변수의 타입과 배열변수명을 지정
		int[] intArr;
		// int intArr[]; : 배열 선언시에 왼쪽과 같이 선언할 수 있지만 비추
		
		// 자바에서 배열은 초기화 해야만 사용할 수 있음
		//System.out.println(intArr);
		
		// 배열 초기화 : 배열의 크기(length)를 지정하고 배열요소들의 값을 초기화
		//            5개의 4byte공간이 정수의 기본값인 0으로 초기화 됨
		intArr = new int[5]; // 배열의 크기(length)는 5, 인덱스(index)의 범위는 0~4
		System.out.println(intArr); // 참조타입 중에 배열 타입임을 알 수 있음
		System.out.println(intArr[0]); // 0
		
		// intArr의 인덱스범위가 0~4임
		// 실행시간에 예외발생 ArrayIndexOutOfBoundsException
		// System.out.println(intArr[5]); 
		
		// 배열에 값을 할당
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5;
		// intArr[4] = 10000000000; // int 범위의 값을 할당 가능
		
		// for문을 이용해서 배열에 값을 할당
		int intArrLength = intArr.length;
		for (int i = 0; i<intArr.length; i++) {
		// 좋은 코드 아님... WHY? intArr의 크기는 항상 5, for문의 조건식에 넣어두면 반복마다 크기를 연산하게 됨
		// 마틴파울러의 리팩토링 책에 나오는 내용, 마이크로소프트의 Code Complete 책도 추천
		//for (int i=0; i<intArr.length; i++) {
			intArr[i] = i + 1;
			System.out.println(intArr[i]);
		}
		
		// enhanced for문을 이용해서 배열의 값들을 출력
		for (int each : intArr) {
			System.out.println(each);
		}
		
		// 문자열 배열
		// 배열 선언, 초기화, 할당을 동시에 하는 코드
		String[] strArr = {"안녕하세요!", "자바", "프로그래밍", "재밌나요?"};
		
		// enhanced for를 사용해서 문자열 배열의 각 요소 출력
		for (String str : strArr) {
			System.out.println(str);
		}
		
		
		
	} // main

} // class
