package jeon.calendar;

import java.util.Scanner;

public class Calendar {

	public final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int maxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void calendarfunc(int i) {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		
		if (i == 2) {
			System.out.println("22 23 24 25 26 27 28");
		}	
		else if (i <= 7) {
			if (i % 2 == 1) {
				System.out.println("22 23 24 25 26 27 28");
				System.out.println("29 30 31");
			}
			else {
				System.out.println("22 23 24 25 26 27 28");
				System.out.println("29 30");
			}
		}
		else {
			if(i%2 ==1) {
				System.out.println("22 23 24 25 26 27 28");
				System.out.println("29 30");
			}
			else {
				System.out.println("22 23 24 25 26 27 28");
				System.out.println("29 30 31");
			}
		}
		System.out.println();
	}

	
}
