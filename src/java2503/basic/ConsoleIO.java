package java2503.basic;

import java.util.Scanner;

public class ConsoleIO {
   
   public static void main(String[] args) {
      
      // 표준입력장치인 키보드로 부터 문자열을 입력받는 스캐너 객체 생성
      // System.in : 표준입력 (키보드)
      Scanner scanner = new Scanner(System.in);
      
      // 입력받은 문자열이 있는 동안 반복
      while (scanner.hasNext()) {
         // 입력한 문자열을 nextStr이라는 변수에 저장
         // scanner.next() : 사용자가 문자열을 입력하고 엔터칠때까지 문자들을 저장 (blocking method)
         String nextStr = scanner.next();
         // 변수에 저장된 문자열을 출력
         // System.out : 표준출력 (모니터)
         System.out.println(nextStr);         
      }
      
      scanner.close();
      
   } // main

} // class


