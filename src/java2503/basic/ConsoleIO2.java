package java2503.basic;

import java.util.Scanner;

public class ConsoleIO2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("덧셈하실 두 수를 입력해 주세요!");
		
		int input1 = scanner.nextInt(); // 첫번째 입력한 수
		int input2 = scanner.nextInt(); // 두번째 입력한 수
		
		// + 연산자는 양쪽에 하나라도 문자열이 있으면 두 문자 열을 붙이는(concatenation) 연산을 함
		// 양쪽에 모두 수가 있으면 두 수를 더하는(add) 연산을 함
		System.out.println("입력하신 두 수의 합은" + (input1 + input2)+ " 입니다!");
		
		scanner.close();
		
	}

}
