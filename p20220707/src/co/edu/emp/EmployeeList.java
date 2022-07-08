package co.edu.emp;

import java.util.Calendar;
import java.util.Scanner;

public class EmployeeList {
	
	private static EmployeeList instance = new EmployeeList();
	private EmployeeList() {}
	public static EmployeeList getInstance() {
		return instance;
	}
	
	// 배열
	Employee[] list;	// 사원 배열
	int empNum;			// 사원수
	Scanner scn = new Scanner(System.in);
	
	// 리스트 초기화 : 지금은 사용하지 않음
//	private EmployeeList(Employee[] list) {
//		this.list = list;
//		this.empNum = list.length;
//	}
	
	// 배열객체 선언
	public void init() {
		System.out.print("사원수 입력 > ");
		int num = Integer.parseInt(scn.nextLine());
		list = new Employee[num];
	}
	
	// 사원정보 입력 -> 배열에 추가
	public void input() {
		if(empNum>=list.length) {
			System.out.println("입력초과");
			return;
		}
		System.out.printf("%d 사번 > ", empNum);
		int no = Integer.parseInt(scn.nextLine());
		
		System.out.printf("이름 > ");
		String name = scn.nextLine();
		
		System.out.printf("급여 > ");
		int sal = Integer.parseInt(scn.nextLine());
		
		list[empNum++] = new Employee(no, name, sal); // 사원인스턴스.. -> 배열저장
	}
	
	// 전체출력
	public void printList() {
		for(int i=0; i<empNum; i++) {
			System.out.printf("%5d %10s %7d\n", list[i].getemployeeId(), list[i].getName(), list[i].getSalary());
		}
	}
	
	// 상세조회, 사원에 상세정보를 보여주는 기능 Employee 추가
	public void search() {
		System.out.print("사원번호를 입력 > ");
		int employeeId = Integer.parseInt(scn.nextLine());
		for(int i=0; i<empNum; i++) {
			if(employeeId==list[i].getemployeeId()) {
				System.out.println(list[i].getDetailInfo());
				break;
			}
		}
	}
	
	//말일정보
//	private int getLastDate(int mon) {
//		switch(mon) {
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//			return 30;
//		case 2:
//			return 28;
//		default:
//			return 31;
//		}
//	}
	
	private int getLastDate(int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(2022, month-1 , 1);
		return cal.getActualMaximum(Calendar.DATE);
	}
	
	//1일의 말일정보
//	private int getDayInfo(int mon) {
//		switch(mon) {
//		case 9:
//			return 4;
//		case 6:
//		case 12:
//			return 3; // 첫째날 요일정보
//		case 7:
//			return 5;
//		case 8:
//		case 11:
//			return 1;
//		default:
//			return 0;
//		}
//	}

	public static int getDayInfo(int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(2022, month-1, 1);
		return cal.get(Calendar.DAY_OF_WEEK);
	}
		
	// 달력
	public void showCalendar() {
		System.out.print("월을 입력 > ");
		int month = Integer.parseInt(scn.nextLine());
		// 요일정보, 1일의 위치, 말일의 날짜
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		int firstDay = getDayInfo(month); // 일:0, 월:1, 화:2, 수:3, 목:4, 금:5, 토:6
		int lastDate = getLastDate(month); //
		
		for(int i=0; i<days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		// 1일의 요일정보를 맞춤
		for(int i=0; i<firstDay; i++) {
			System.out.printf("%4s"," ");
		}
		for(int i=1; i<=lastDate; i++) {
			System.out.printf("%4d",i);
			if((i+firstDay)%7==0) { // 공란포함해주려고
				System.out.println();
			}
		}
		System.out.println();
	}

}
