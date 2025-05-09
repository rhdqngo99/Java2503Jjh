package java2503.basic.network;

import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

/*
   Google에서 제공하는 무료 SMTP(Simple Mail Transfer Protocol : 메일발송프로토콜)
   서버를   이용하여 메일보내기
   
   1. jakarta.mail(메일발송), jakarta.activation(메일계정인증) 라이브러리리(jar) 필요
       (mvnrepository.com에서 다운로드하여 프로젝트에 추가)
       
   2. Google SMTP 사용 설정
      1) 2단계 인증 설정
        Google 계정 로그인 > 계정관리> 보안 > 2단계인증 활성화
      2) 앱 비밀번호 생성
        Google 계정 로그인 > 검색> 앱 비밀번호 > 앱 이름 지정 > 생성된 앱 비밀번호 저장
*/

public class GoogleSMTPTest {
   
   public static void main(String[] args) {
      
      // Google 계정명 / 앱 비밀번호
      String username = "rhdqngo99@gmail.com";
      String password = "tdkb aerc rvbd mwkh";
      
      // SMTP 서버 설정
      Properties props = new Properties();
      props.put("mail.smtp.auth", "true"); // SMTP서버 인증 여부
      props.put("mail.smtp.starttls.enable", "true"); // TLS서비스 사용 여부
      props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP 서버
      props.put("mail.smtp.port", "587"); // SMTP 포트번호
      
      // 메일세션 (연결) 생성
      // SMTP서버 설정 정보, 인증 정보
      Session session = Session.getInstance(props, new Authenticator() {
         @Override
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, password);
         }
      });
      
      try {
         
         // 이메일 메세지 작성
         Message message = new MimeMessage(session);
         
         // 발신자 이메일
         message.setFrom(new InternetAddress("rhdqngo99@gmail.com"));
         
         // 수신자 이메일
         message.setRecipients(
            Message.RecipientType.TO, 
            InternetAddress.parse("rhdqngo99@naver.com")
         );
         
         // 이메일 제목
         message.setSubject("Google SMTP 테스트 메일");
         
         // 이메일 내용
         message.setText("안녕하세요~ Google SMTP서버에서 보낸 테스트 메일입니다!");
         
         // 이메일 발송
         Transport.send(message);
         System.out.println("이메일 발송 완료!");
         
      	} catch (Exception ex) {
         ex.printStackTrace();
      }
      
   } // main

} // class


