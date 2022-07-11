package co.edu.api;

public class IndexOfEx {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location); // 프로그래밍이란 단어는 3번째 위치부터 시작
		
		if(subject.indexOf("자바") == -1) { // -1이면 없는거임
			System.out.println("자바와 관련없는 책");
		} else {
			System.out.println("자바와 관련있는 책");
		}
	}
}
