package jeon.calendar;

import java.util.Scanner;

public class Calendar {

	public final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public static void main(String[] args) {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println();
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
//		1,3,5,7,8,10,12 : 31일
//		2월 28일
//		4,6,9,11 : 30일
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		String PROMPT="cal> ";
		
		int month = 0;
		
		while(true){
		System.out.println("달을 입력하세요. : ");
		System.out.print(PROMPT);
		month = scanner.nextInt();
		if (month == -1) {
			break;
		}
		else if(month >=13) {
			continue;
		}
		System.out.println(month+"월은 "+cal.maxDaysOfMonth(month)+"일까지 있습니다.");
		}
		
		System.out.println("Goodbye~");
		scanner.close();
	}
}
