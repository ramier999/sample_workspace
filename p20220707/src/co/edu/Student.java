package co.edu;

public class Student {
	
	// 필드
	private String sno;
	private String name;
	private int score;
	
	// 생성자: 정의하지 않을 시 기본 생성자
	// 중복으로 정의 가능
	public Student() {
	}
	
	// 생성자 오버로딩
	public Student(String sno, String name, int score) {
		this.sno = sno;
		this.name = name;
		this.score = score;
	}
	
	// getter, setter
	public void setSno(String sno) { // 학번에 값을 대입
		this.sno = sno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getSno() { // 학번을 반환
		return this.sno;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
	
	// 전체 정보를 보여주는 showInfo()
	public void showInfo() {
		System.out.printf("학번: %s, 이름: %s, 점수: %d\n", sno, name, score);
	}
}
