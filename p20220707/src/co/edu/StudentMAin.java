package co.edu;

public class StudentMAin {
	
	public static void main(String[] args) {
		
//		System.out.println(args[0]);
//		System.out.println(args[1]);
		
		Student kim = new Student();
		kim.setSno("22-001");
		kim.setName("김민수");
		kim.setScore(80);
		
		System.out.println("학번: "+kim.getSno());
		System.out.println("이름: "+kim.getName());
		System.out.println("점수: "+kim.getScore());
		System.out.println();
		kim.showInfo();
		
		Student park = new Student("22-002", "박희수", 85);
		park.showInfo();
		System.out.println();
		
		Student son = new Student("22-003", "손정빈", 88);
		Student lee = new Student("22-004", "이철수", 96);
		
		Course course = new Course("김철수", "1-3", 25);
		System.out.println("선생님: "+course.getTname());
		System.out.println("반 정보: "+course.getBname());
		
		// 학생등록
		course.addStudent(kim);
		course.addStudent(park);
		course.addStudent(son);
		course.addStudent(lee);
		
		// 학생리스트 보기
		course.getStudents();
		
		System.out.print("최고점수 학생정보 > ");
		course.getMaxStudent().showInfo();
		
		System.out.printf("평균점수 > %.1f\n", course.getAvgScore());
	}
}
