package co.edu;

public class Course {
	// 필드
	private String tname;
	private String bname;
	private Student[] students;
	
	//생성자
	public Course() {
	}
	
	public Course(String tname) {
		this.tname = tname;
	}
	
	public Course(String tname, String bname, int studentNum) {
		this.tname = tname;
		this.bname = bname;
		this.students = new Student[studentNum];
	}
	
	public String getTname() {
		return tname;
	}
	
	public String getBname() {
		return bname;
	}
	
	public void getStudents() {
		for(int i=0; i<students.length; i++) {
			if(students[i] != null) {
				students[i].showInfo();
			}
		}
	}
	
	// 학생정보 등록
	public void addStudent(Student student) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}
	
	//점수가 제일 높은 학생의 정보 반환
	public Student getMaxStudent() {
		int max = 0;
		Student student = null;
		for(int i=0; i<students.length; i++) {
			if(students[i] != null && students[i].getScore()>max) {
				max = students[i].getScore();
				student = students[i];
			}
		}
		return student;
	}
	
	public double getAvgScore() {
		int sum = 0;
		int cnt = 0;
		for(int i=0; i<students.length; i++) {
			if(students[i] != null) {
				cnt++;
				sum += students[i].getScore();
			}
		}
		double avg = (double) sum / cnt; 
		return avg;
	}
	
}
