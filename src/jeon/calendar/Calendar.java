package jeon.calendar;


public class Calendar {

	public final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public final String[] DAY = {"월", "화", "수", "목", "금", "토", "일"};
	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;

	}

	public int maxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}
	
	int getDayName(int a, int b) {
		int answer = 0;
		int sum = 0;
				
		for ( int i =0; i< b -1; i++) {
			sum += maxDaysOfMonth(a, i);
		}
		
		answer = sum%7;
		
		return answer;
		
	}

	public void calendarfunc(int n, int m) {
		System.out.printf("  <<%4d년 %2d월>>\n",n,m);
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		
		//get weekday automatically
		int weekday = 0;
		
		//print blank space
		for (int i=0; i<weekday; i++) {
			System.out.print("   ");
		}
		
		int maxDay = maxDaysOfMonth(n, m);
		for (int y = 1; y <= maxDay; y++) {
			System.out.printf("%2d ", y);
			if ((y+weekday) % 7 == 0) {
				System.out.println();
			}
		}
	
		System.out.println();
		
	}

}
