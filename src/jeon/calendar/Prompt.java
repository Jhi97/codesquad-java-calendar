package jeon.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT="cal>";
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 0;

		while (true) {
			System.out.println("달을 입력하세요. : ");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if (month == -1) {
				break;
			} else if (month >= 13) {
				continue;
			}
			cal.calendarfunc(cal.maxDaysOfMonth(month));
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
