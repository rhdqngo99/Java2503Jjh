package java2503.basic.exception;

import java.util.Scanner;

public class ExException2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("피젯수를 입력하세요!");
		String str1 = scanner.next(); // 피젯수
		
		System.out.println("젯수를 입력하세요!");
		String str2 = scanner.next(); // 젯수
		
		int num1 = 0;
		int num2 = 0;
		
		try {
			num1 = Integer.parseInt(str1);
			num2 = Integer.parseInt(str2);
		}catch (NumberFormatException nfe) {
			System.out.println("숫자만 입력해 주세요!");
			System.exit(0);
		}
		
		if(num2==0) {
			try {
				throw new ArithmeticException();
			}catch (ArithmeticException ae) {
				System.out.println("0의로 나눌 수 없어요!");
			}
		}
		
		float result = num1 / num2;
		
		System.out.println("나눈 결과는" + result + "입니다!");
		
	}

}
