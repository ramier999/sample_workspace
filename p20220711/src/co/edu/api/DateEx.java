package co.edu.api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date; // 2개있는데 util에 있는거 사용할거
/*
 * Date, Calendar => 시간, 날짜 정보
 */
public class DateEx {
	public static void main(String[] args) {
		Date today = new Date(); // LocalDate, LocalDateTime도 있어요
		today.getDate();
		today.getDay();
		
		System.out.println(today.toString());
		System.out.println(today.toGMTString());
		System.out.println(today.toLocaleString());
		
		// 0000년 00월 00일 00시 00분 00초 << 형식의 포맷 만들기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		// HH : 24시 기준, hh : 12시 기준
		System.out.println(sdf.format(today));
//		sdf = new SimpleDateFormat("yyyy-MM-dd");
//		System.out.println(sdf.format(today));
		
		today = new Date("2022/07/15 13:23:12"); // 값 넣어주는 포맷 기억하기
		System.out.println(sdf.format(today));
		
		// Calendar 클래스
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR)+"년 "+(now.get(Calendar.MONTH)+1)+"월 "+
		now.get(Calendar.DATE)+"일");
		
		// LocatDate
		LocalDate lDate = LocalDate.now(); // 정적메소드
		System.out.println(lDate.toString());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 | MM월 | dd일");
		System.out.println(lDate.format(dtf));
		
		
	}
}