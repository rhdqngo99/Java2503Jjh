package java2503.basic.exception;

public class ExceptionMain1 {

	public static void main(String[] args) {
		
	 // Important: 모든 예외는 반드시 처리해야 한다!!!
		
	 // 1. 예외발생 가능한 코드들을 try블럭으로 묶는다.
	 try {
		int i3 = 10 / 0; 
		int i2 = Integer.parseInt("백만");
		int[] iArr = {1, 2, 3, 4, 5};
		int i1 = iArr[5];
	 // 2. catch블럭에서 발생한 예외를 처리한다
	 //    try블럭안의 코드에서 발생가능한 예외는 모두 catch블럭으로 처리해야 함!
	 } catch (ArrayIndexOutOfBoundsException aiobe) {
		 aiobe.printStackTrace();
	 } catch (NumberFormatException nfe) {
		 nfe.printStackTrace();
	 } catch (ArithmeticException ae) {
		 ae.printStackTrace();
	 // 나머지 모든 예외는 아래 catch에서 처리하겠음!
	 // Exception을 catch에 사용하려면 맨 하단 catch에서 사용해야 함!
	 } catch (Exception ex) {
		 ex.printStackTrace();
	 } catch (Throwable th) {
		 th.printStackTrace();
	 // finally구문은 선택사항
	 // 주로 외부 자원들(파일, 데이터베이스, 네트워크 ...)을
	 // 사용하고 닫아주는(자원 해제) 코드들을 finally내에 넣음
	 } finally {
		System.out.println("예외가 발생하든 안하든 수행할 코드들");
	 }
	 
	 System.out.println("하단 코드들...");
	
	} // main

} // class
