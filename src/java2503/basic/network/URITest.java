package java2503.basic.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class URITest {

	public static void main(String[] args) {
		
		try {
			
			// 1. URI 객체 생성
			URI uri = new URI("https://koreaitacademy.com");
			
			// 2. URL객체 생성
			URL url = uri.toURL();
			
			// 3. URLConnection 객체 생성 (연결 객체)
			URLConnection conn = url.openConnection();
			
			// 4. InputStream 객체 생성
			InputStream is = conn.getInputStream();
			
			// 5. 문자들을 읽을경우 InputStream을 Reader로 변환
			InputStreamReader isr = new InputStreamReader(is, "EUC-KR");
			
			// 6. 데이터가 많은 경우 BufferedReader 생성
			BufferedReader br = new BufferedReader(isr);
			
			// 실습 : 가져온 소스코드를 koreaitacademy.txt 파일에 저장
			File file = new File("E:\\Java2503Jjh\\workspace\\java2503\\src\\java2503\\basic\\network\\koreaitacademy.txt");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			String readLine;
			while ((readLine=br.readLine()) != null) {
				bw.write(readLine);
				bw.newLine();
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	} // main

} // class
