package co.edu.inherit.friend;

import java.util.Scanner;

/*
 * 등록, 조회, 목록
 */
public class FriendApp {
	// 기본 생성자 사용
	Friend[] friends = new Friend[10];
	int friendNum;
	Scanner scn = new Scanner(System.in);
	
	public void start() {
		while(true) {
			timerShow("1.등록 | 2.조회 | 3.목록 | 9.종료");
			System.out.print("선택> ");
			int selectNo = 0;
			try { // 잘못 입력한 경우 try - catch로 재실행
				selectNo = Integer.parseInt(scn.nextLine()); // 전환 : "12" (문자열숫자) -> 12 (숫자)
			} catch(Exception e) {
				System.out.println("유효한 숫자를 입력하세요.");
			}
			
			if(selectNo==1) {
				add();
			} else if(selectNo==2) {
				search();
			} else if(selectNo==3) {
				list();
			} else if(selectNo==9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("<<End of Program>>");
	} // end of start()

	private void add() {
		
		int choice = 0;
		
		while(true) {
			System.out.println("등록할 친구 목록을 선택하세요.");
			System.out.println("1.학교 | 2.회사 | 3.친구");
			System.out.print("선택> ");
			try{
				choice = Integer.parseInt(scn.nextLine());
				break;
			} catch(Exception e) {
				System.out.println("유효한 숫자를 입력하세요.");
			}
		}
		
		System.out.print("이름> ");
		String name = scn.nextLine();
		System.out.print("연락처> ");
		String phone = scn.nextLine();
		
		if(choice==1) {
			System.out.print("학교> ");
			String univ = scn.nextLine();
			System.out.print("전공> ");
			String major = scn.nextLine();
			friends[friendNum++] = new UnivFriend(name, phone, univ, major);
			// 가능
		} else if(choice==2) {
			System.out.print("회사> ");
			String company = scn.nextLine();
			System.out.print("부서> ");
			String department = scn.nextLine();
			friends[friendNum++] = new ComFriend(name, phone, company, department);
			
		} else if(choice==3) {
			friends[friendNum++] = new Friend(name, phone);
		}

	}
	
	private void search() {
		// 친구이름 입력 => 상세정보 출력 showInfo
		System.out.println("조회할 친구의 이름을 입력하세요.");
		System.out.print("입력> ");
		String inName = scn.nextLine();
		for(int i=0; i<friendNum; i++) {
			if(inName.equals(friends[i].getName())){
				friends[i].showInfo();
			}
		}

	}
	
	private void list() {
		for(int i=0; i<friendNum; i++) {
			System.out.println(friends[i].toString());
		}
	}
	
	private void timerShow(String msg) {
		String[] message = msg.split(""); // split - 문 자 를 자 름
		for(int i=0; i<message.length; i++) {
			System.out.print(message[i]);
			try {
				Thread.sleep(100); // 0.1초마다 문자를 하나씩 찍어줌
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
}
