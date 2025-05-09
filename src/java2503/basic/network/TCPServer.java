package java2503.basic.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
   
   public static void main(String[] args) {
      
      ServerSocket ss = null;
      
      try {
         
         ss = new ServerSocket(5000);
         if (ss != null) {
            System.out.println("서버소켓 생성됨! 클라이언트 접속 대기중!");
         }
         
         // 클라이언트 접속을 무한 대기
         while (true) {
             Socket serverSocket = ss.accept();
             if (serverSocket != null) {
                 BufferedReader br = new BufferedReader(
                     new InputStreamReader(serverSocket.getInputStream(), "UTF-8")
                 );
                 System.out.println("클라이언트가 보낸 문자열 : " + br.readLine());

                 BufferedWriter bw = new BufferedWriter(
                     new OutputStreamWriter(serverSocket.getOutputStream(), "UTF-8")
                 );
                 bw.write("서버가 보낸 문자열 : 안녕하세요! 서버입니다!\n");
                 bw.flush();

                 br.close();
                 bw.close();
                 serverSocket.close();
             }
         }
         
      } catch (Exception ex) {
         ex.printStackTrace();
      }
      
   } // main

} // class

