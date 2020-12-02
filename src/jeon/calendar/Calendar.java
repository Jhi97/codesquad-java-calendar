package jeon.calendar;

import java.util.Scanner;

public class Calendar {

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
		int month;
		System.out.println("달을 입력하세요. : ");
		a = scanner.nextInt();
		if (month <= 7) {
			if (month % 2 == 1) {
				System.out.println(month + "월의 최대 일수는 31일 입니다.");
			} else if (month == 2)
				System.out.println(month + "월의 최대 일수는 28일 입니다.");
			else
				System.out.println(month + "월의 최대 일수는 30일 입니다.");
		} else if (month % 2 == 1)
			System.out.println(month + "월의 최대 일수는 30일 입니다.");
		else
			System.out.println(month
					+ "월의 최대 일수는 31일 입니다.");
		scanner.close();
	}
}
