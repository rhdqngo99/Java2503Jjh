package java2503.basic.api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf
		   = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		
		while (true) {
			System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(1000); // 1초간 쓰레드가 중지 (실행 중지)
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
	} // main

} // class
