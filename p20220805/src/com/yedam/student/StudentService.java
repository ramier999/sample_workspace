package com.yedam.student;

import java.util.Scanner;

public class StudentService {
	Scanner scn = new Scanner(System.in);
	// 1. 학생 등록
	public void insertStudent(StudentDTO std) {
		int result = StudentManage.getInstance().insertStudent(std);
		if(result==1) {
			System.out.println("성공!");
		} else {
			System.out.println("실패!");
		}
	}
	
	public void insertSubject(StudentDTO std) {
		int menu = 0;
		System.out.println("<< 성적 입력 >>");
		System.out.println("1. 국어 | 2. 영어 | 3.수학");
		System.out.print(">> ");
		menu = Integer.parseInt(scn.nextLine());
		System.out.print(">> ");
		if(menu==1) {
			int kor = Integer.parseInt(scn.nextLine());
			std.setStudentKor(kor);
			CheckResult(StudentManage.getInstance().insertKor(std));
		} else if(menu==2) {
			int eng = Integer.parseInt(scn.nextLine());
			std.setStudentEng(eng);
			CheckResult(StudentManage.getInstance().insertEng(std));
		} else if(menu==3) {
			int math = Integer.parseInt(scn.nextLine());
			std.setStudentMath(math);
			CheckResult(StudentManage.getInstance().insertMath(std));
		}
	}
	
	public void updateTel() {
		
		StudentDTO std = new StudentDTO();
		
		System.out.println("ID를 입력하세요.");
		System.out.print(">> ");
		int id = Integer.parseInt(scn.nextLine());
		System.out.println("변경할 전화번호를 입력하세요.");
		System.out.print(">> ");
		String tel = scn.nextLine();
		
		std.setStudentId(id);
		std.setStudentTel(tel);
		
		int result = StudentManage.getInstance().updateTel(std);
		CheckResult(result);
	}
	
	// 학생 정보 조회
	public StudentDTO getStudent(StudentDTO std) {
		return StudentManage.getInstance().getStudent(std.getStudentId());
	}
	
	public void CheckResult(int value) {
		if(value==1) {
			System.out.println("성공!");
		} else {
			System.out.println("실패!");
		}
	}
	
}
