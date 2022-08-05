package com.yedam.student;

public class StudentDTO {
	
	private int studentId; // student_id
	private String studentName; // student_name
	private String studentClass; // student_class
	private String studentAddr; // student_addr
	private String studentTel; // student_tel
	private int studentKor; // student_kor
	private int studentEng; // student_eng
	private int studentMath; // student_math
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public String getStudentClass() {
		return studentClass;
	}
	
	public String getStudentAddr() {
		return studentAddr;
	}
	
	public String getStudentTel() {
		return studentTel;
	}
	
	public int getStudentKor() {
		return studentKor;
	}
	
	public int getStudentEng() {
		return studentEng;
	}
	
	public int getStudentMath() {
		return studentMath;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	
	public void setStudentAddr(String studentAddr) {
		this.studentAddr = studentAddr;
	}
	
	public void setStudentTel(String studentTel) {
		this.studentTel = studentTel;
	}
	
	public void setStudentKor(int studentKor) {
		this.studentKor = studentKor;
	}
	
	public void setStudentEng(int studentEng) {
		this.studentEng = studentEng;
	}
	
	public void setStudentMath(int studentMath) {
		this.studentMath = studentMath;
	}

	@Override
	public String toString() {
		return "StudentDTO [studentId=" + studentId + ", studentName=" + studentName + ", studentClass=" + studentClass
				+ ", studentAddr=" + studentAddr + ", studentTel=" + studentTel + "]";
	}
	
}
