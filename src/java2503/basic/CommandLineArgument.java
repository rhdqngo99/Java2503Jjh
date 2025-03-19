package java2503.basic;

//실행방법 : Run > Run Configuration... > Arguments > Program Arguments에
//문자열 3개를 공백문자로 구분해서 입력 > 하단 Run
public class CommandLineArgument {

// Command Line Argument (명령행인자) : main메소드 실행시에 전달되는 값들을 저장할 배열
// String[] args : main메소드 실행시에 전달한 문자열 여러개를 저장하는 문자열 배열
// args[0] : 첫번째 문자열, args[1] : 두번째 문자열, args[2] : 세번째 문자열
public static void main(String[] args) {

System.out.println("첫번째 명령행인자의 값 : " + args[0]);
System.out.println("두번째 명령행인자의 값 : " + args[1]);
System.out.println("세번째 명령행인자의 값 : " + args[2]);

}

}

