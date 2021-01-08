package jeon.calendar;

import java.util.Scanner;

public class Prompt {
	
	public int parseDay(String week) {
		if (week.equals("일")) {return 0;}
		else if(week.equals("월")) { return 1;}
		else if(week.equals("화")) { return 2;}
		else if(week.equals("수")) { return 3;}
		else if(week.equals("목")) { return 4;}
		else if(week.equals("금")) { return 5;}
		else if(week.equals("토")) { return 6;}
		else return 0;
	}
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 0;
		int year = 0;
		int weekday=0;
		
		while (true) {
			System.out.println("년을 입력하세요. : (exit : -1)");
			System.out.print("YEAR>");
			year = scanner.nextInt();
			if (year == -1) {
				break;
			} 
			
			System.out.println("달을 입력하세요. : ");
			System.out.println("MONTH>");
			month = scanner.nextInt();
			if (month >= 13||month<1) {
				System.out.println("잘못된 입력입니다.");
				System.out.println();
				continue;
			}
			
			
			
			
			
			
			cal.calendarfunc(year, month);
		}

		System.out.println("Goodbye~");
		scanner.close();
	}
	
	public static void main(String[] args) {
		//셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
				
	}
}
