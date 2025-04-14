package java2503.basic.api;

public class StringTest {
	
	public static void main(String[] args) {
		
		// length:8, index:0~7
		String str1 = "abcdefgh";

		System.out.println(str1.charAt(3));
		System.out.println(str1.concat("ij"));
		System.out.println(str1.contains("cda"));
		System.out.println(str1.endsWith("gh"));
		System.out.println(str1.equals("abcdefgh"));
		System.out.println(str1.equalsIgnoreCase("Abcdefgh"));
		
		byte[] byteArr = str1.getBytes();
		for(byte b : byteArr) {
			System.out.println(b);
			System.out.println((char)b);
		}
		
		System.out.println(str1.indexOf('c')); // 2
		
		String str2 = "            ";
		System.out.println(str2.isBlank()); // 공백문자를 문자로 취급하지 않음, true
		System.out.println(str2.isEmpty()); // 공백문자를 문자로 취급, false
		
		String str3 = "abcdabcdabcd";
		System.out.println(str3.lastIndexOf('a')); // 8
		System.out.println(str3.length()); // 12
		System.out.println(str3.repeat(2)); // abcdabcdabcdabcdabcdabcd
		System.out.println(str3.replace("bc", "ef")); //aefdaefdaefd
		System.out.println(str3.replaceAll("ab", "12")); // 12cd12cd12cd

		String str4 = "010-1234-5678";
		
		String[] strArr = str4.split("-");
		for(String str : strArr) {
			System.out.println(str);
		}
		
		String str5 = "안녕하세요! 자바 재밌나요?";
		
		System.out.println(str5.startsWith("안녕")); // true
		System.out.println(str5.substring(7)); // 자바 재밌나요?
		System.out.println(str5.substring(7, 9)); // 자바

		char[] charArr = str5.toCharArray();
		for(char ch : charArr) {
			System.out.println(ch);
		}
		
		String str6 = " Abc dEf ";
		
		System.out.println(str6.toLowerCase());
		System.out.println(str6.toUpperCase());
		System.out.println(str6.trim());
		System.out.println(str6.valueOf(false));
		System.out.println("" + false);
		System.out.println(String.valueOf(100));
		System.out.println("" + 100);
		System.out.println(String.valueOf(new Object()));
		System.out.println("" + new Object());
		
	} // main
	
} // class
