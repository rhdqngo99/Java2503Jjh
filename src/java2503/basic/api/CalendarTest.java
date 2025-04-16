package java2503.basic.api;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		// Calendar 객체 생성
		/*
		 java.util.GregorianCalendar[
		 time=1744803778582, // unix time : 1970년 1월 1일 0시 0분 0초 0밀리초부터 지금까지 밀리초마다 1씩 센 값
		 areFieldsSet=true,
		 areAllFieldsSet=true,
		 lenient=true,
		 zone=sun.util.calendar.ZoneInfo[
		 	id="Asia/Seoul", // 시간대
		 	offset=32400000, // 영국의 그리니치천문대(시간의 원점)에서부터의 시간 변위
		 	dstSavings=0,
		 	useDaylight=false, // 썸머타입 사용여부 (여름에 한시간을 이전돌림)
		 	transitions=30,
		 	lastRule=null],
		 firstDayOfWeek=1,
		 minimalDaysInFirstWeek=1,
		 ERA=1,
		 YEAR=2025,
		 MONTH=3, // 0부터 1월
		 WEEK_OF_YEAR=16, // 1년 중에 몇번째 주인지
		 WEEK_OF_MONTH=3, // 1년 중에 몇번째 달인지
		 DAY_OF_MONTH=16, // 월에서 몇번째 일인지
		 DAY_OF_YEAR=106, // 1년 중에 몇번째 일인지
		 DAY_OF_WEEK=4, // 주에서 몇번째 일인지
		 DAY_OF_WEEK_IN_MONTH=3, // 월에서 몇번째 주인지
		 AM_PM=1, // AM:0, PM:1
		 HOUR=8, // 오후 8시
		 HOUR_OF_DAY=20, // 20시
		 MINUTE=42,
		 SECOND=58,
		 MILLISECOND=582,
		 ZONE_OFFSET=32400000,
		 DST_OFFSET=0]

		 */
		Calendar cal = Calendar.getInstance(); 
		System.out.println(cal);
		
		System.out.println(cal.getTimeInMillis()); // 날짜/시간을 밀리초로
		
		System.out.println(cal.getTimeZone()); // 시간대
		
		// 현재 날짜/시간 정보
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1); // 월은 0부터
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // 월에서 몇번째 일인지
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 일에서 몇시인지
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.MILLISECOND));
		
		// 특정 날짜 설정
		cal.set(2024, Calendar.JANUARY, 1); // 2024년 1월 1일로 설정
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		
		// 날짜 더하기(이후)
		cal.add(Calendar.DAY_OF_MONTH, 7); // 7일후
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		// 날짜 빼기(이전)
		cal.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
	}

}
