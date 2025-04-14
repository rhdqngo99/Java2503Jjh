package java2503.basic.api;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	
	public static void main(String[] args) {
		
		String str1 = "안녕 하세요! 자바 재밌나요?";
		String str2 = "010-1234-5678";
		
		// 공백문자 기준으로 str1 문자열을 분리하는 StringTokenizer 
		StringTokenizer st1 = new StringTokenizer(str1);
		
		System.out.println(st1.countTokens()); // 4
		
		// token이 있는동안 반복
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		// -문자열 기준으로 str2 문자열을 분리하는 StringTokenizer 
		StringTokenizer st2 = new StringTokenizer(str2, "-");
		
		System.out.println(st2.countTokens()); // 3
		
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		// 실습 : ,문자열 기준으로 str3 문자열을 분리해서 정수로 변환해서 합을 출력
		// 문자열을 int로 변환 : int i = Integer.parseInt(문자열);
		String str3 = "10,5,7,3,6";
		StringTokenizer st3 = new StringTokenizer(str3, ",");
		int sum = 0;
		while (st3.hasMoreTokens()) {
			sum += Integer.parseInt(st3.nextToken());
		}
		System.out.println("합계는 " + sum);
		
	} // main

} // class
