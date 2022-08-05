package com.yedam.app;

import java.util.Scanner;

import com.yedam.member.MemberDTO;
import com.yedam.member.MemberService;
import com.yedam.student.StudentDTO;
import com.yedam.student.StudentService;

public class LMSAPP {

	MemberService ms = new MemberService();
	StudentService ss = new StudentService();
	Scanner scn = new Scanner(System.in);
	
	int menu = 0;
	MemberDTO MD = null;
	
	public LMSAPP() {
		run();
	}
	
	private void run() {
		while(true) {
			menuNo();
			// 로그인이 되지 않았을 때
			if(MD==null) {
				// 로그인 진행
				if(menu==1) {
					MemberDTO member = new MemberDTO();
				
					System.out.println("아이디를 입력하세요.");
					System.out.print(">> ");
					String id = scn.nextLine();
				
					System.out.println("비밀번호를 입력하세요.");
					System.out.print(">> ");
					String pw = scn.nextLine();
				
					member.setMemberId(id);
					member.setMemberPw(pw);
				
					MD = ms.doLogin(member);
				
				} else if(menu==2) {
					System.out.println("End of Program");
					break;
				}
			} else {
				if(menu==1) { // 학생등록
					
					StudentDTO std = new StudentDTO();
					
					System.out.print("ID >> "); // ID
					int id = Integer.parseInt(scn.nextLine());
					System.out.print("이름 >> "); // NAME
					String name = scn.nextLine();
					System.out.print("강의실 >> "); // CLASS
					String lecture = scn.nextLine();
					System.out.print("주소 >> "); // ADDR
					String addr = scn.nextLine();
					System.out.print("전화번호 >> "); // TEL
					String tel = scn.nextLine();
					
					std.setStudentId(id);
					std.setStudentName(name);
					std.setStudentClass(lecture);
					std.setStudentAddr(addr);
					std.setStudentTel(tel);
					
					ss.insertStudent(std);
					
				} else if(menu==2) { // 성적입력
					StudentDTO std = new StudentDTO();
					System.out.println("ID를 입력하세요.");
					System.out.print(">> ");
					int id = Integer.parseInt(scn.nextLine());
					std.setStudentId(id);
					// 존재할 경우
					std = ss.getStudent(std);
					if(std!=null) {
						ss.insertSubject(std);
					} else {
						System.out.println("정보가 존재하지 않습니다.");
					}
				} else if(menu==3) { // 학생정보수정
					// 전화번호 변경
					ss.updateTel();
				} else if(menu==4) { // 학생정보조회
					StudentDTO std = new StudentDTO();
					System.out.println("ID를 입력하세요.");
					System.out.print(">> ");
					int id = Integer.parseInt(scn.nextLine());
					std.setStudentId(id);
					std = ss.getStudent(std);
					System.out.println(std.toString());
				}
			}
		}
	}
	
	private void menuNo() {
		if(MD==null) {
			System.out.println("1. 로그인 | 2. 종료");
			System.out.print(">> ");
			menu = Integer.parseInt(scn.nextLine());
		} else {
			System.out.println("1. 학생등록 | 2. 성적입력 | 3. 학생정보수정 | 4. 학생정보조회");
			System.out.print(">> ");
			menu = Integer.parseInt(scn.nextLine());
		}
	}
}
