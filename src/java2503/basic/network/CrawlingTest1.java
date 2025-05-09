package java2503.basic.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class CrawlingTest1 {
	
	   // https://news.naver.com/section/105 네이버 > 뉴스 > IT/과학 제목 크롤링
	   
	   public static void main(String[] args) {
	      
	      URI uri = null;
	      URL url = null;
	      URLConnection conn = null;
	      BufferedReader br = null;
	      
	      try {
	         
	         uri = new URI("https://news.naver.com/section/105");
	         url = uri.toURL();
	         conn = url.openConnection();
	         br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	         
	         // 한 줄 읽어온 데이터 저장할 변수
	         String line = "";
	         
	         // 크롤링 시작할 문자열 앞의 문자열
	         String startStr = "<strong class=\"sa_text_strong\">";
	         
	         // 크롤링 끝낼 문자열 뒤의 문자열
	         String endStr = "</strong>";
	         
	         // 한줄씩 반복적으로 읽어서 line변수에 저장
	         while ((line=br.readLine()) !=null) {
	            
	            // 크롤링할 제목을 저장할 변수
	            String subject = "";
	            
	            // <strong class="sa_text_strong">네이버·카카오 올해 특명 '체류시간' 더 늘려라</strong>
	            
	            // 읽어온 한 줄 문자열에서 앞뒤공백을 제거하고
	            // 시작문자열로 시작한다면
	            if (line.trim().startsWith(startStr)) {
	               
	               // 크롤링할 제목의 시작인덱스
	               int startIdx = line.indexOf(startStr) + startStr.length();
	               
	               // 크롤링할 제목의 끝인덱스
	               int endIdx = line.indexOf(endStr, startIdx);
	               
	               // 제목
	               subject = line.substring(startIdx, endIdx);
	               System.out.println(subject);
	               
	            } // if
	            
	         } // while
	         
	      } catch (Exception ex) {
	         ex.printStackTrace();
	      }
		
	} // main

} // class
