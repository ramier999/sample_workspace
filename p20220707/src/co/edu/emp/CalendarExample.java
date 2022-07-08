package co.edu.emp;

import java.util.Scanner;
import java.util.Calendar;

public class CalendarExample {
	
	Scanner scn = new Scanner(System.in);
	Calendar cal = Calendar.getInstance();
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		System.out.print(cal.get(Calendar.YEAR)+"년 ");
		System.out.print(cal.get(Calendar.MONTH)+1+"월 "); // 값이 0 ~ 11이기 때문에 +1
		System.out.print(cal.get(Calendar.DATE)+"일 ");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 1: 일요일 ~ 7: 토요일
		System.out.println(cal.get(Calendar.MONTH)+1+"월의 마지막 날은 "+
		cal.getActualMaximum(Calendar.DATE)+"일"); // 말일 날짜
		
		System.out.println();
		cal.set(2022, 5, 1); // 2022년 6월 1일로 날짜 지정
		System.out.print(cal.get(Calendar.YEAR)+"년 ");
		System.out.print(cal.get(Calendar.MONTH)+1+"월 "); 
		System.out.print(cal.get(Calendar.DATE)+"일 ");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.MONTH)+1+"월의 마지막 날은 "+
		cal.getActualMaximum(Calendar.DATE)+"일");
		
		System.out.println();
		System.out.println(getLastDate(2022, 5)+"일");
		System.out.println();
		System.out.println(getDayInfo(2022, 10)+"요일");
	}

	// 년, 월 정보 => 해당 년, 월의 말일정보를 가져오는 메소드 작성
	// EX) 2022년 9월 => 30일
	public static int getLastDate(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1 , 1);
		System.out.print(year+"년 "+month+"월 => ");
		return cal.getActualMaximum(Calendar.DATE);
	}
	
	// 년, 월 정보 => 해당 년, 월의 1일의 요일정보를 가져오는 메소드 작성
	// EX) 2022년 9월 => 5요일
	public static int getDayInfo(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		System.out.print(year+"년 "+month+"월 => ");
		return cal.get(Calendar.DAY_OF_WEEK);
	}
}