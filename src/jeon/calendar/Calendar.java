package jeon.calendar;


public class Calendar {

	public final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 != 0)
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

	public void calendarfunc(int n, int m) {
		System.out.printf("  <<%d4년 %d2월>>\n",n,m);
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		int maxDay = maxDaysOfMonth(n, m);
		for (int y = 1; y <= maxDay; y++) {
			System.out.printf("%2d ", y);
			if (y % 7 == 0) {
				System.out.println();
			}
		}
		/*
		 * System.out.println(" 1  2  3  4  5  6  7");
		 * System.out.println(" 8  9 10 11 12 13 14");
		 * System.out.println("15 16 17 18 19 20 21");
		 * 
		 * if (i == 2) { System.out.println("22 23 24 25 26 27 28"); } else if (i <= 7)
		 * { if (i % 2 == 1) { System.out.println("22 23 24 25 26 27 28");
		 * System.out.println("29 30 31"); } else {
		 * System.out.println("22 23 24 25 26 27 28"); System.out.println("29 30"); } }
		 * else { if(i%2 ==1) { System.out.println("22 23 24 25 26 27 28");
		 * System.out.println("29 30"); } else {
		 * System.out.println("22 23 24 25 26 27 28"); System.out.println("29 30 31"); }
		 * }
		 */
		System.out.println();
		
	}

}
