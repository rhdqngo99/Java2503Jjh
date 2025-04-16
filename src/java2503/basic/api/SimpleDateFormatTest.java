package java2503.basic.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		
		// 날짜/시간의 표시 형식을 생성
		SimpleDateFormat sdf 
		= new SimpleDateFormat("yyyy년 M월 dd일 a h:m:s");
		
		// 현재 날짜/시간을 형식화
		String dateStr = sdf.format(new Date());
		System.out.println(dateStr);
		
		// 실습 : 2020년 1월 1일 오후 1시 0분 0초 시간을
		// 		 20/1/1 PM 1:0:0 형식으로 출력
		Calendar cal = Calendar.getInstance();
		cal.set(2020,0,1,13,0,0);
		SimpleDateFormat sdf2 
		= new SimpleDateFormat("yy/M/d/ a h:m:s");
		String result = sdf2.format(cal.getTime()).replace("오후","PM");
		System.out.println(result);
		
	}

}
