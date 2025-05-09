package java2503.basic.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
   
   public static void main(String[] args) {
      
      Socket clientSocket = null;
      
      try {
         
         // 서버 아이피, 포트번호를 인자로 클라이언트 소켓 생성
         clientSocket = new Socket("192.168.13.16", 5000);
         
         // 서버에 문자열을 보낼 스트림
         PrintWriter pw = new PrintWriter(
            new OutputStreamWriter(clientSocket.getOutputStream(), "UTF-8"),
            true
         );
         pw.println("클라이언트가 보낸 메세지 : 안녕하세요! 클라이언트입니다!");
         pw.flush();

         // 서버에서 보낸 문자열을 수신할 스트림
         BufferedReader br = new BufferedReader(
            new InputStreamReader(clientSocket.getInputStream(), "UTF-8")
         );
         System.out.println(br.readLine());

         // 모든 작업이 끝난 후 소켓 닫기
         pw.close();
         br.close();
         clientSocket.close();
         
      } catch (Exception ex) {
         ex.printStackTrace();
      }
      
   } // main

} // class


