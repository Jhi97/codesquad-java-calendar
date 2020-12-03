package jeon.calendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT_YEAR="YEAR>";
	private final static String PROMPT_MONTH="MONTH>";
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 0;
		int year = 0;
		while (true) {
			System.out.println("년을 입력하세요. :");
			System.out.println(PROMPT_YEAR);
			year = scanner.nextInt();
			System.out.println("달을 입력하세요. : ");
			System.out.print(PROMPT_MONTH);
			month = scanner.nextInt();
			if (month == -1) {
				break;
			} else if (month >= 13) {
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
